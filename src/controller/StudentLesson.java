package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.Response;

import dto.FBDTO;
import entity.DsStudentinfo;
import entity.DsSubject;
import service.BasicService;

@Controller
@RequestMapping(value="/student/lesson",method=RequestMethod.POST)
public class StudentLesson {
	 @Autowired
	private BasicService ser;
	
	@RequestMapping("show.do")
	@ResponseBody
	public FBDTO show(HttpSession hSession)
	{
		try {
			Session session = ser.getSession();
			DsStudentinfo student =(DsStudentinfo) session.load(DsStudentinfo.class, (int) hSession.getAttribute("user_id"));
			HashMap map;
			DsSubject subject = student.getSubject();
			if(subject==null)
			{
				map = new HashMap<String,String>();
				map.put("jump", "true");
				return new FBDTO(1,"No subject",map);
			}
			map = singleTanToMap(subject);
			map.put("jump", false);
			return new FBDTO(map);
		} catch (Exception e) {
			// TODO: handle exception
			return new FBDTO(1,"获取已选课表失败",null);
		}
		
		
		
	}
	
	@RequestMapping("abandon.do")
	@ResponseBody
	public FBDTO choose(HttpSession hSession)
	{
		try {
			//relieve contaction
			Session session = ser.getSession();
			Transaction tran = session.beginTransaction();
			DsStudentinfo student =(DsStudentinfo) session.load(DsStudentinfo.class, (int) hSession.getAttribute("user_id"));
			student.getSubject().setStudent(null);
			student.setSubject(null);
			
			
			//return all subject
			ArrayList<DsSubject> subjects = (ArrayList<DsSubject>) ser.get(null, DsSubject.class);
			HashMap map = arrayTranToMap(subjects,1);
			tran.commit();
			session.close();
			return new FBDTO(1,"success",map);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new FBDTO(0, "获取课题列表失败", null);
		}
	}
	
	@RequestMapping("flip.do")
	@ResponseBody
	public FBDTO flip(@RequestParam(value="current_pageNumber")int current_pageNumber)
	{
		ArrayList<DsSubject> subjects = (ArrayList<DsSubject>) ser.get(null, DsSubject.class);
		HashMap map = arrayTranToMap(subjects,current_pageNumber);
		
		return new FBDTO(map);
	}
	
	@RequestMapping("addSubject.do")
	@ResponseBody
	public FBDTO addSubject(@RequestParam(value="sb_id")int id,HttpSession hSession)
	{
		Session session = ser.getSession();
		Transaction tran = session.beginTransaction();
		DsStudentinfo student =(DsStudentinfo) ser.getSession().load(DsStudentinfo.class, (int) hSession.getAttribute("user_id"));
		DsSubject subject =(DsSubject) ser.getSession().load(DsSubject.class, id);
		student.setSubject(subject);
		subject.setStudent(student);
		session.update(student);
		
		return new FBDTO(null);
	}
	private HashMap<String, Object> singleTanToMap(DsSubject subject){
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("sb_id", subject.getSbId());
		map.put("sb_name", subject.getSbTitle());
		map.put("sb_type", subject.getSbType());
		map.put("sb_college", subject.getCollege().getClName());
		map.put("sb_major", subject.getMajor().getMjName());
		map.put("status", subject.getSbStatus());
		
		
		return map;	
	}
	
	private HashMap arrayTranToMap(ArrayList<DsSubject> subjects,
			int current_pageNmuber)
	{
		int end=0;
		int max_pageNumber = subjects.size()/20+1;
		HashMap map = new HashMap<String, Object[]>();
		int size = subjects.size();
		Integer[] sb_id = new Integer[size];
		String[] sb_name = new String[size];
		String[] sb_type = new String[size];
		String[] sb_college=new String[size];
		String[] sb_major = new String[size];
		String[] sb_status = new String[size];
		
		if(current_pageNmuber<max_pageNumber)
			end=current_pageNmuber*20-1;
		else end = subjects.size();
		for(int i =(current_pageNmuber-1)*20;i<end;i++)
		{
			DsSubject subject = subjects.get(i);
			sb_id[i] = subject.getSbId();
			sb_name[i] = subject.getSbTitle();
			sb_type[i] = subject.getSbType();
			sb_college[i] = subject.getCollege().getClName();
			sb_major[i] =subject.getMajor().getMjName();
			sb_status[i] = subject.getSbStatus();
		}
		map.put("sb_id", sb_id);
		map.put("sb_name", sb_name);
		map.put("sb_type", sb_type);
		map.put("sb_college", sb_college);
		map.put("sb_major", sb_major);
		map.put("sb_status", sb_status);
		
		map.put("current_pageNumber", current_pageNmuber);
		map.put("max_pageNumber", max_pageNumber);
		return map;
	}
}
