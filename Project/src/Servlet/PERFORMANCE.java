package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Class.ServiceClass;

import Class.PRT;

public class PERFORMANCE extends HttpServlet {

	public PERFORMANCE() {
		super();
	}

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
			ServiceClass sj=new ServiceClass();
		    PRT tns=new PRT();
			tns=sj.TNS();
			
			request.setAttribute("Data",tns);
			request.getRequestDispatcher("Performance.jsp").forward(request, response);
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
