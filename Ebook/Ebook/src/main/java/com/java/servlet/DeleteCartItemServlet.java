
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
import com.java.service.CartService;
import com.java.service.ServiceFactory;
@WebServlet(name="DeleteItem",urlPatterns = "/deleteitem")
public class DeleteCartItemServlet extends HttpServlet {
	
	public void service( HttpServletRequest request,HttpServletResponse response) throws IOException ,ServletException {
		String id=request.getParameter("id");
		int itemid=Integer.parseInt(id);
		String uid=request.getParameter("userid");
		int userid=Integer.parseInt(uid);
		
	CartService service=ServiceFactory.getCartservice();
	service.deleteItem(itemid,userid);
	
	
	request.setAttribute("deletemsg", "deleted item");

	RequestDispatcher rd=request.getRequestDispatcher("cart.jsp");
	rd.forward(request, response);
		
		
	}



}

