package com.java.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.DTO.CartDTO;
import com.java.DTO.UsersDTO;
import com.java.service.CartService;
import com.java.service.ServiceFactory;

@WebServlet(name = "ShowCart", urlPatterns = "/showcart")
public class ShowCartServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("userid");

		CartService cartservice = ServiceFactory.getCartservice();
		ArrayList<CartDTO> cartitems = cartservice.getAllCartItemsbyUserID(Integer.parseInt(id));

		String page = "";
		String msg = "";
		if (cartitems != null) {
			HttpSession session = request.getSession();
			UsersDTO user = (UsersDTO) session.getAttribute("userdata");

			session.setAttribute("userData", user);

			session.setAttribute("items", cartitems);
			page = "cart.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
