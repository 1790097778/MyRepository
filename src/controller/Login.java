package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.FBDTO;
import entity.DsStudentinfo;
import service.BasicService;



@Controller
@RequestMapping("login")
public class Login {
	@Autowired
	private BasicService studentService;
	
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST,value="loginIn.do")
	public FBDTO loginIn(@RequestParam(required = true,value="name")String name
			,@RequestParam(required = true,value="password")String password,
			Model model,HttpSession hSession)
	{
		
		ArrayList<Criterion> criterions = new ArrayList<>();
		criterions.add(Restrictions.eq("stUsername", name));
		List list = studentService.get(criterions, DsStudentinfo.class);
		if(list.size()==0)
			return new FBDTO(0,"name",null);
		DsStudentinfo user = (DsStudentinfo) list.get(0);
		System.out.println(user.getStPassword());
		if(!user.getStPassword().equals(password))
			return new FBDTO(0,"password",null);
		else
		{	
//			Save in session 
			hSession.setAttribute("user", user);
			hSession.setAttribute("power", user.getPower());
			studentService.getSession().close();
			return new FBDTO(null);
		}
	}

}
