package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import entity.DsPower;
import entity.DsStudentinfo;

/**
 * Servlet implementation class LoginInServlet
 */
@WebServlet("/loginIn")
public class LoginInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session dSession =DatabaseManager.getDatabaseManager().getSession();
	
		DetachedCriteria dc = DetachedCriteria.forClass(DsStudentinfo.class);
		//the first parameter in eq() is the name of attribute in entity but not of columns in tables;
		dc.add(Restrictions.eq("stUsername", request.getParameter("name")));
		
		Criteria serName = dc.getExecutableCriteria(dSession);
		ArrayList<DsStudentinfo> list = (ArrayList<DsStudentinfo>) serName.list();
		switch (list.size()) {
		//The account dosen't exist in database;
		case 0:
		{
			System.out.println("there is no data");
			request.setAttribute("errorType", "name");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;
		}
		//The account exist in database;
		case 1:
		{
			
			if(list.get(0).getStPassword()!=request.getParameter("password"))
			{
				//The password is wrong
				request.setAttribute("errorType", "password");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				//Search the power of the user;
				dc = DetachedCriteria.forClass(DsPower.class);
				dc.add(Restrictions.eq("pwId", list.get(0).getStPowerid()));
				Criteria serPower = dc.getExecutableCriteria(dSession);
				ArrayList<DsPower> power = (ArrayList)serPower.list();
				
				//Save in session 
				HttpSession hSession =  request.getSession();
				hSession.setAttribute("user", list.get(0));
				hSession.setAttribute("power", power);
				
				request.getRequestDispatcher("main.jsp").forward(request, response);
			}
		}
		default:
			//the number is more than 1 which means there is wrong in database;
			
			break;
		}
		dSession.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
