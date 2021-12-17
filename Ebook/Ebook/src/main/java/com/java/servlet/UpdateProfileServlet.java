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
import com.java.service.ServiceFactory;
import com.java.service.UserserviceImpl;
import com.java.service.Userservise;

@WebServlet(name = "update", urlPatterns = { "/editprofile", "/updateprofile" })
public class UpdateProfileServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String page = null;
		if (uri.endsWith("editprofile")) {
			HttpSession ses = request.getSession(false);
			UsersDTO userdtdo = (UsersDTO) ses.getAttribute("userdata");
			int userid = userdtdo.getUserid();

			Userservise userservice = new UserserviceImpl();
			UsersDTO userdto = userservice.getuserbyuserid(userid);
			ses.setAttribute("userdata", userdto);
			page = "updateprofile.jsp";

		} else if (uri.endsWith("updateprofile")) {
			String userId = request.getParameter("userid");
			String fullname = request.getParameter("fullname");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String username = request.getParameter("username");

			UsersDTO userdto = new UsersDTO();
			userdto.setUserid(Integer.parseInt(userId));
			userdto.setFullname(fullname);
			userdto.setEmail(email);
			userdto.setPhone(Long.parseLong(phone));
			userdto.setUsername(username);

//			calling service layer
			Userservise userservice = ServiceFactory.getUserservice();
			boolean status = userservice.updateprofile(userdto);

			if (status) {
				page = "updateprofile.jsp";
				String upMsg = "Your Profile is updated Successfully";
				request.setAttribute("UpdateMsg", upMsg);
			} else {
				page = "updateprofile.jsp";
				String upMsg = "Something Wrong, Try again";
				request.setAttribute("errorMsg", upMsg);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);

	}

}
