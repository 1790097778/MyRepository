package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.FBDTO;
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
	public FBDTO loginIn(@RequestParam(required = true,value="name")String name
			,@RequestParam(required = true,value="password")String password,
			Model model,HttpSession hSession)
	{
		HashMap<String,String> data = new HashMap();
		DsStudentinfo user =studentService.getByUsername(name);
		if(user==null)
			return new FBDTO(0,"name",null);
		if(!user.getStPassword().equals(password))
			return new FBDTO(0,"password",null);
		else
		{	
			//Save in session 
			hSession.setAttribute("user", user);
			hSession.setAttribute("power", powerService.getById(user.getStPowerid()));
			
			return new FBDTO(null);
		}
	}

}
