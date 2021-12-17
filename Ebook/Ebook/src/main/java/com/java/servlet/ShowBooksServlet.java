package com.java.servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.DTO.ProductDTO;
import com.java.DTO.UsersDTO;
import com.java.service.Productservice;
import com.java.service.ServiceFactory;

@WebServlet(name = "showbooks", urlPatterns = "/book.jsp")
public class ShowBooksServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Productservice productservice = ServiceFactory.getProductservice();
		ArrayList<ProductDTO> productdto = productservice.getAllBooks();

		String page = "";
		if (productdto != null) {
			HttpSession session = request.getSession();
			UsersDTO user = (UsersDTO) session.getAttribute("userdata");
			session.setAttribute("books", productdto);
			session.setAttribute("userData", user);
			page = "books.jsp";

		}

		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);

	}

}
