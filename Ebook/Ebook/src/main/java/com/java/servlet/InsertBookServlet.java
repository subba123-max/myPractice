package com.java.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.java.DTO.ProductDTO;
import com.java.service.Productservice;
import com.java.service.ServiceFactory;

@MultipartConfig
@WebServlet(name = "insertbook" ,urlPatterns = "/insertbook")
public class InsertBookServlet extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String price =request.getParameter("price");
		String description = request.getParameter("description");
		Part file=request.getPart("image");
		String imageName=file.getSubmittedFileName();

		
		String uploadPath="D:\\New folder (2)\\eclipse\\virtusaServlets\\Ebook\\src\\main\\webapp\\resources\\images\\"+imageName;

		try {
			FileOutputStream fos=new FileOutputStream(uploadPath);
			InputStream is=file.getInputStream();
			
			byte[] data=new byte[is.available()];
			is.read(data);
			fos.write(data);
			fos.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		
		ProductDTO productdto=new ProductDTO();
		productdto.setName(name);
		productdto.setPrice(price);
		productdto.setDescription(description);
		productdto.setImage(imageName);
//		
	Productservice productservice=	ServiceFactory.getProductservice();
	int x=productservice.insertBook(productdto);
	String page="";
	String msg="";
	if(x>0) {
		page="insertbook.jsp";
		msg="Successfully Inserted Book";
		request.setAttribute("successmsg", msg);
	}else {
		page="insertbook.jsp";
		msg="something went wrong!!";
		request.setAttribute("errormsg", msg);
	}
	RequestDispatcher rd=request.getRequestDispatcher(page);
	rd.forward(request, response);
		
	}

}
