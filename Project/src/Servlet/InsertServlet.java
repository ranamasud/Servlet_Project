package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Class.ServiceClass;

public class InsertServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public InsertServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String  id= request.getParameter("id");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String dept= request.getParameter("dept");
		String gp= request.getParameter("gp");
		
		ServiceClass sj = new ServiceClass();
		if(name!=""&&id!=""&&email!=""&&pass!=""&&dept!=""&&gp!="")
		{
		sj.Insert(name,id,email,pass,dept,gp);
		
		request.getRequestDispatcher("thanks.jsp").forward(request, response);
		}
		
		else
		{
			
			request.getRequestDispatcher("New.jsp").forward(request, response);
		}
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
