package data;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		User u = new User();
		u.setName(request.getParameter("name"));
		u.setAge("25");
		if (!u.isExisted()) {
//			 response.sendRedirect("http://localhost:8080/SimpleWebDemo/NewFile.jsp?name="+u.getName());
			// 以上代码亦可

			// 将请求和回应参数直接传给jsp
			request.setAttribute("user", u);
			request.getRequestDispatcher("content/student/lesson_choose.jsp").forward(request, response);
		} else {
			response.setContentType("text/html;charset=GB2312");
			response.getWriter().println("<HTML><BODY>");
			response.getWriter().println("登录失败!");
			response.getWriter().println("</body></html>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
