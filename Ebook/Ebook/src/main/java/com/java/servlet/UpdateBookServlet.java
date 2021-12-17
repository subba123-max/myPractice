package com.java.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.java.DTO.ProductDTO;
import com.java.DTO.UsersDTO;
import com.java.service.Productservice;
import com.java.service.ServiceFactory;

@WebServlet(name = "updateBook", urlPatterns = { "/editbookdetails", "/updatebookdetails" })
public class UpdateBookServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println(uri);
		String page = "";
		if (uri.endsWith("editbookdetails")) {
			HttpSession session = request.getSession(false);

			String bookid = request.getParameter("id");
			System.out.println("BookID" + bookid);
			Productservice service = ServiceFactory.getProductservice();
			ProductDTO productdto = service.getBookByID(Integer.parseInt(bookid));

			session.setAttribute("book", productdto);
			page = "updatebook.jsp";

		} else if (uri.endsWith("updatebookdetails")) {
			String bookid = request.getParameter("id");
			String name = request.getParameter("name");
			String price = request.getParameter("price");
			String description = request.getParameter("description");

			ProductDTO productdto = new ProductDTO();
			productdto.setId(Integer.parseInt(bookid));
			productdto.setName(name);
			productdto.setPrice(price);
			productdto.setDescription(description);
			Productservice productservice = ServiceFactory.getProductservice();
			boolean status = productservice.UpdateBook(productdto);
			if (status) {
				page = "updatebook.jsp";
				String msg = "updated book successfully";
				request.setAttribute("updatemsg", msg);
			} else {
				page = "updatebook.jsp";
				String msg = "some thing went wrong??";
				request.setAttribute("errormsg", msg);
			}

		}
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
