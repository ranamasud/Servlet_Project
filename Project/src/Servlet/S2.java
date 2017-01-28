package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Class.ServiceClass;
import Class.User;

public class S2 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public S2() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String dept = request.getParameter("dept");
		String pass = request.getParameter("pass");
		ServiceClass sj = new ServiceClass();
		User uj=new User();
		
		List<User> data = sj.ShowDB(dept);
		request.setAttribute("data", data);
		request.getRequestDispatcher("resul.jsp").forward(request, response);
		
	}


	public void init() throws ServletException {
		// Put your code here
	}

}
