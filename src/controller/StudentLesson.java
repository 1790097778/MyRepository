package controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.FBDTO;
import entity.DsStudentinfo;
import entity.DsSubject;
import service.BasicService;

@Controller
@RequestMapping("student/lesson")
public class StudentLesson {
	 @Autowired
	private BasicService ser;
	 @RequestMapping("aaa")
	 public void aaa(){};
	 
	 @RequestMapping("bbb")
	 public void bbb(){};
	@RequestMapping("choose")
	@ResponseBody
	public FBDTO choose(@RequestParam(required=false,value="sb_id")Integer id,
			@RequestParam(required=true,value="page_maxnumber")Integer max,
			@RequestParam(required=true,value="page_number")Integer current,
			HttpSession hSession)
	{
		Session dSession = ser.getSession();
		Transaction tran = dSession.beginTransaction();
		FBDTO result = new FBDTO();
		HashMap<String,Object> data = new HashMap<String, Object>();
		if(id!=null)
		{
			DsStudentinfo student = (DsStudentinfo) hSession.getAttribute("user");
			student.getSubject().setStudent(null);
			student.setSubject(null);
			ser.update(student);
			tran.commit();		
		}
		List list = ser.get(null,DsSubject.class);
		
		if(list.size()<(current*20+1))
			return new FBDTO(0,"Lack of subject infomation",null);
		
			
	}
}
