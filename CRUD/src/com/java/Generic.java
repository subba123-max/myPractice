package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;


public class Generic  extends GenericServlet{
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method()");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.write("<h2>generic servlet</h2>");
	}

}
