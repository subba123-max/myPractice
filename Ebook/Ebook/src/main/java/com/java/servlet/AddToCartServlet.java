package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.DTO.CartDTO;
import com.java.DTO.ProductDTO;
import com.java.service.CartService;
import com.java.service.Productservice;
import com.java.service.ServiceFactory;

@WebServlet(name="cart",urlPatterns = "/addtoCart")
public class AddToCartServlet extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String bid=request.getParameter("bookid");
		String uid=request.getParameter("userid");
		
		int bookid=Integer.parseInt(bid);
		int userid=Integer.parseInt(uid);

		
		Productservice productservice=ServiceFactory.getProductservice();
		ProductDTO	productdto=productservice.getBookByID(bookid);

		String bookname=productdto.getName();
		double price=Double.parseDouble(productdto.getPrice());
	
		CartDTO cart=new CartDTO();
		cart.setBookid(bookid);
		cart.setUserid(userid);
		cart.setBookName(bookname);
		cart.setPrice(price);
		cart.setTotalprice(price);

		
	CartService	cartservice=ServiceFactory.getCartservice();
		int status=cartservice.AddToCart(cart);
		System.out.println("status:"+status);
		String page="";
		String msg="";
		
		if(status >0) {
			page="books.jsp";
			msg="book added to cart";
			request.setAttribute("cartmsg", msg);
			
		}else {
			page="books.jsp";
			msg="something went wrong??";
			request.setAttribute("cartmsg", msg);
		}
		 RequestDispatcher rd=request.getRequestDispatcher(page);
		 rd.forward(request, response);

		
		
	}

	

}
