package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "logout", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		session.invalidate();

		String page = "login.jsp";
		String msg = "logout successfully";
		RequestDispatcher rd = request.getRequestDispatcher(page);
		request.setAttribute("logoutMsg", msg);
		rd.forward(request, response);

	}

}
