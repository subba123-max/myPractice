package com.java.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.java.model.User;
import com.java.service.UserService;

@Controller
@EnableWebMvc
@ComponentScan(basePackages="com.java.*")
public class UserController {
	
	@Autowired
	public UserService userService;
//	@RequestMapping(value="/")
//	public ModelAndView test(HttpServletResponse response) throws IOException{
//		return new ModelAndView("login");
//	
//	}
	
	
	@GetMapping(value = "/")
	public String login(Model md,HttpServletRequest req) {
		System.out.println(req.getContextPath());
		User user=new User();
		md.addAttribute("user",user);
	
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String verifyLogin(@RequestParam("username") String username,@RequestParam("password") String password,Model md,HttpServletRequest req) {
		
		List<User> user=	userService.verifyUser(username, password);
	System.out.println(user);
	if(user != null) {
		for(User u:user) {
			System.out.println(u.getUsername());
			HttpSession session=req.getSession(true);
			session.setAttribute("userinfo", u);
			
		}
		return "home";
	}
	else {
		System.out.println("error");
		return "/";
		
	}
		
		
	}
	
	@GetMapping(value="/register")
	public String register(Model md) {
		
		System.out.println("i am user");
		User user=new User();
		md.addAttribute("user",user);
		
		return "register";
	}
	
	@PostMapping(value="/save")
	public String saveUser(@ModelAttribute("user") User user,BindingResult result,HttpServletRequest req,Model md) {
		if(result.hasErrors()) {
			return "register";
		}else {
			System.out.println("register success");
			System.out.println("user:"+user);
//			user.setUserid(1);
			userService.userReistration(user);
			req.setAttribute("msg", "Registartion Done .Plz login");
			md.addAttribute("message","Registartion Done .Plz login");
			return "login";
		}
		
		
	}
	
	@GetMapping(value = "/logout")
	public ModelAndView logout(HttpServletRequest request) {
		System.out.println("logout");  
		HttpSession session=request.getSession(false);
		session.invalidate();
		return new ModelAndView("login") ;
	}
	
}
