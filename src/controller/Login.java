package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import entity.DsCollege;
import entity.DsPower;
import entity.DsStudentinfo;


@Controller
@RequestMapping("login")
public class Login {
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST,value="loginIn")
	
	public Map<String,String> loginIn(@RequestParam(required = true,value="name")String name
			,@RequestParam(required = true,value="password")String password,
			Model model,HttpSession hSession)
	{
		
		HashMap<String,String> result = new HashMap();
		Session dSession =DatabaseManager.getDatabaseManager().getSession();
	
		DetachedCriteria dc = DetachedCriteria.forClass(DsStudentinfo.class);
		//the first parameter in eq() is the name of attribute in entity but not of columns in tables;
		dc.add(Restrictions.eq("stUsername", name));
		
		Criteria serName = dc.getExecutableCriteria(dSession);
		ArrayList<DsStudentinfo> list = (ArrayList<DsStudentinfo>) serName.list();
		switch (list.size()) {
		//The account dosen't exist in database;
		case 0:
		{
			result.put("error", "name");
			System.out.println("name");
			return result;
		}
		//The account exist in database;
		case 1:
		{
			
			if(!list.get(0).getStPassword().equals(password))
			{
				result.put("error", "password");
				System.out.println("password");
				return result;
			}
			else
			{
				
				
				//Search the power of the user;
				dc = DetachedCriteria.forClass(DsPower.class);
				dc.add(Restrictions.eq("pwId", list.get(0).getStPowerid()));
				
				Criteria serPower = dc.getExecutableCriteria(dSession);
				ArrayList<DsPower>power = (ArrayList<DsPower>) serPower.list();
				
				//Save in session 
				
				hSession.setAttribute("user", list.get(0));
				hSession.setAttribute("power", power);
				result.put("error","success");
				System.out.println("success");
				return result;
			}
		}
		default:
			//the number is more than 1 which means there is wrong in database;
			System.out.println("default");
			break;
		}
		dSession.close();
		System.out.println("null");
		return null;
	}

}
