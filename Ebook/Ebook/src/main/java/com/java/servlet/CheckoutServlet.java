package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.DTO.UsersDTO;
import com.mysql.cj.Session;

@WebServlet(urlPatterns = "/checkout")
public class CheckoutServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String door = request.getParameter("door");
		String street = request.getParameter("street");
		String area = request.getParameter("area");
		String district = request.getParameter("district");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String payment = request.getParameter("payment");

		HttpSession ses = request.getSession();
		UsersDTO user = (UsersDTO) ses.getAttribute("userdata");


		RequestDispatcher rd = request.getRequestDispatcher("checkout.jsp");
		rd.forward(request, response);

	}

}
