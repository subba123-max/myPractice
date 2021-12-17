package com.java.servlet;
import com.java.DTO.*;
import com.java.service.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="login",urlPatterns = "/login")
public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password = request.getParameter("password");
		
		
//		calling service layer
		Userservise userservice=ServiceFactory.getUserservice();
		UsersDTO userdto=userservice.verifyUser(username, password);
		
		String page="";
		if(userdto !=null) {
			if(userdto.getUsername().equals("admin")) {
				page="book.jsp";
				HttpSession ses=request.getSession();
				ses.setAttribute("userdata", userdto);
			}else {
				page="book.jsp";
				HttpSession ses=request.getSession();

				ses.setAttribute("userdata", userdto);
				
			}
			
			
		}else 
		{
			
			page="login.jsp";
			HttpSession ses=request.getSession();
			String logMsg="invalid username or password";
			ses.setAttribute("errorMsg", logMsg);
		}
		
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	
	}

}
