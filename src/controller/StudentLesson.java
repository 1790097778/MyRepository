package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
@RequestMapping("/student/lesson")
public class StudentLesson {
	 @Autowired
	private BasicService ser;
	@RequestMapping("show.do")
	@ResponseBody
	public FBDTO show(HttpSession hSession)
	{
		try{
			DsStudentinfo student = (DsStudentinfo) hSession.getAttribute("user");
//			ser.update(student);
			DsSubject subject = student.getSubject();
			DataDTO data = new DataDTO(subject);
			HashMap<String,Object> map = new HashMap<String,Object>();
			map.put("subject",data);
			System.out.println(data.sbName);
			return new FBDTO(map);
		}catch(Exception e)
		{
			e.printStackTrace();
			return new FBDTO(0,"Fail to get subject",null);
		}
	}
	/*
	@RequestMapping("abandon")
	@ResponseBody
	public FBDTO choose(HttpSession hSession)
	{
		try {
			//relieve contaction
			Transaction tran = ser.begin();
			DsStudentinfo student = (DsStudentinfo) hSession.getAttribute("user");
			ser.update(student);
			student.getSubject().setStudent(null);
			student.setSubject(null);
			tran.commit();
			
			//return all subject
			ArrayList<DsSubject> subjects = (ArrayList<DsSubject>) ser.get(null, DsSubject.class);
			ArrayList<DataDTO> dataDto = new ArrayList<DataDTO>();
			for(DsSubject subject:subjects)
			{
				DataDTO dto = new DataDTO(subject);
				dataDto.add(dto);
			}
			HashMap<String,Object> map = new HashMap<String,Object>();
			map.put("subjects", dataDto);
			map.put("max_pageNumber", (subjects.size()%20)+1);
			map.put("current_pageNumber", 1);
			
			return new FBDTO(1,"success",map);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	*/
	private class DataDTO implements java.io.Serializable{
		private int sbId;
		private String sbName;
		private String sbType;
		private String sbCollegeName;
		private String sbMajorName;
		private String sbStatus;
	
		private DataDTO(DsSubject subject)
		{
			this.sbId = subject.getSbId();
			this.sbName = subject.getSbTitle();
			this.sbType = subject.getSbType();
			this.sbCollegeName = subject.getCollege().getClName();
			this.sbMajorName = subject.getMajor().getMjName();
			this.sbStatus = subject.getSbStatus();
		}

		public int getSbId() {
			return sbId;
		}

		public String getSbName() {
			return sbName;
		}

		public String getSbType() {
			return sbType;
		}

		public String getSbCollegeName() {
			return sbCollegeName;
		}

		public String getSbMajorName() {
			return sbMajorName;
		}

		public String getSbStatus() {
			return sbStatus;
		}
		
	}
}
