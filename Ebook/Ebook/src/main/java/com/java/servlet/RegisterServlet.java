package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import com.java.service.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.DTO.*;

@WebServlet(name = "register", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UsersDTO usersdto = new UsersDTO();
		usersdto.setFullname(fullname);
		usersdto.setEmail(email);
		usersdto.setPhone(Long.parseLong(phone));
		usersdto.setGender(gender);
		usersdto.setDob(dob);
		usersdto.setUsername(username);
		usersdto.setPassword(password);

//		calling service layer
		Userservise us = ServiceFactory.getUserservice();

		int x = us.userRegistration(usersdto);
		String page = "";
		String msg = "";
		HttpSession session = request.getSession();
		if (x > 0) {
			page = "login.jsp";
			msg = "successfully registered .plz login to continue..";
			session.setAttribute("msg", msg);
		} else {
			page = "Register.jsp";
			msg = "something went wrong!!";
			session.setAttribute("msg", msg);
		}

		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);

	}

}
