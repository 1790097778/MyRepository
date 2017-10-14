package controller;

import java.util.ArrayList;

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
import org.springframework.web.servlet.ModelAndView;

import entity.DsPower;
import entity.DsStudentinfo;

/**
 * Servlet implementation class LoginInServlet
 */
@Controller
@RequestMapping("login")
public class Login {
	@RequestMapping(method=RequestMethod.POST,value="loginIn")
	public String loginIn(@RequestParam(required = true,value="name")String name
			,@RequestParam(required = true,value="password")String password,
			Model model,HttpSession hSession)
	{
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
			System.out.println("there is no data!");
			model.addAttribute("error", "name");
			return "/login";
		}
		//The account exist in database;
		case 1:
		{
			
			if(!list.get(0).getStPassword().equals(password))
			{
				System.out.println(name+","+password+":"+list.get(0).getStUsername()+","+list.get(0).getStPassword());
				//The password is wrong
				System.out.println("wrong password!");
				model.addAttribute("error", "password");
				return "/login";
			}
			else
			{
				//Search the power of the user;
				dc = DetachedCriteria.forClass(DsPower.class);
				dc.add(Restrictions.eq("pwId", list.get(0).getStPowerid()));
				Criteria serPower = dc.getExecutableCriteria(dSession);
				ArrayList<DsPower> power=null;
				try {
					power = (ArrayList)serPower.list();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				//Save in session 
				
				hSession.setAttribute("user", list.get(0));
				hSession.setAttribute("power", power);
				
				return "/main";
			}
		}
		default:
			//the number is more than 1 which means there is wrong in database;
			
			break;
		}
		dSession.close();
		return "/error";
	}

}
