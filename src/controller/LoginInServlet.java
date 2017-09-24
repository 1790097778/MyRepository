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
		Session dSession =DatabaseManager.getDatabaseManager().openSession();
	
		DetachedCriteria dc = DetachedCriteria.forClass(DsStudentinfo.class);
		//the first parameter in eq() is the name of attribute in entity but not of columns in tables;
		dc.add(Restrictions.eq("stUsername", request.getParameter("name")));
		dc.add(Restrictions.eq("stPassword",request.getParameter("password")));
		
		Criteria criteria = dc.getExecutableCriteria(dSession);
		ArrayList<DsStudentinfo> list = (ArrayList<DsStudentinfo>) criteria.list();
		switch (list.size()) {
		case 0:
		{
			System.out.println("there is no data");
			break;
		}
			
		case 1:
		{
//			HttpSession hSession =  request.getSession();
//			hSession.setAttribute("user", list.get(0));
			System.out.println(list.get(0).getStUsername());
		}
		default:
			//the number is more than 1.That mean there is wrong in database;
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
