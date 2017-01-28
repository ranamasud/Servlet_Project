package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Class.SIR;
import Class.ServiceClass;

public class InsertTEACHER extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public InsertTEACHER() {
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

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String name = request.getParameter("name");
	
	
		String dept= request.getParameter("dept");
	
		String pass = request.getParameter("pass");
		String rt=request.getParameter("rt");
		String rtp=request.getParameter("rtp");
		ServiceClass sj = new ServiceClass();
		
		SIR sir = new SIR();
		
		sir=sj.check2(rt,rtp);
		if(sir!=null)
		{
			 sj.InsertSIR(name,dept,pass);				
				request.getRequestDispatcher("thanksT.jsp").forward(request, response);
		}
		else
			
		{
			request.getRequestDispatcher("NotAvlRefTeacher.jsp").forward(request, response);
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
