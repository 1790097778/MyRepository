package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.DsPower;
import entity.DsStudentinfo;
import service.DsPowerService;
import service.DsStudentinoService;


@Controller
@RequestMapping("login")
public class Login {
	@Autowired
	private DsStudentinoService studentService;
	
	@Autowired
	private DsPowerService powerService;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST,value="loginIn")
	public Map<String,String> loginIn(@RequestParam(required = true,value="name")String name
			,@RequestParam(required = true,value="password")String password,
			Model model,HttpSession hSession)
	{
		
		HashMap<String,String> result = new HashMap();
		DsStudentinfo user =studentService.getByUsername(name);
		if(user==null)
		{
			result.put("error", "name");
			return result;
		}
		if(!user.getStPassword().equals(password))
		{
			result.put("error", "password");
			return result;
		}
		else
		{
			
			//Save in session 
			
			hSession.setAttribute("user", user);
			hSession.setAttribute("power", powerService.getById(user.getStPowerid()));
			result.put("error","success");
			System.out.println("success");
			return result;
		}
	}

}
