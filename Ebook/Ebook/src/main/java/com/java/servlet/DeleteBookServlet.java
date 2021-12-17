
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
@WebServlet(name="removebook",urlPatterns = "/removebook")
public class DeleteBookServlet extends HttpServlet {
	
	public void service( HttpServletRequest request,HttpServletResponse response) throws IOException ,ServletException {
		String id=request.getParameter("id");
		int bookid=Integer.parseInt(id);
		
	Productservice service=	ServiceFactory.getProductservice();
	service.DeleteBook(bookid);
	
	request.setAttribute("deletemsg", "deleted book");
	RequestDispatcher rd=request.getRequestDispatcher("book.jsp");
	rd.forward(request, response);
		
		
	}



}

