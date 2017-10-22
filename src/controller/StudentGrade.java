package controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.FBDTO;
import entity.DsStudentinfo;

@Controller
public class StudentGrade {
	@ResponseBody
	@RequestMapping("student/grade")
	public FBDTO getGrades(HttpSession session)
	{
		DsStudentinfo student =(DsStudentinfo) session.getAttribute("user");
		HashMap<String,Object> map = new HashMap();
		map.put("grade", student.getStScore());
		map.put("url", "");
		return new FBDTO(map);
	}
}
