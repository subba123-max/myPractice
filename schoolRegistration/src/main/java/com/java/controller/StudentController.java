package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.java.dao.StudentDAO;
import com.java.model.Student;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;  

@Controller
@EnableWebMvc
@ComponentScan(basePackages="com.java.*")
public class StudentController {

	
	@Autowired
	StudentDAO stdDao;
	
	@GetMapping(value="/hello")
	public void hello() {
		System.out.println("hello");
	}
	
	@GetMapping(value="/register")
	public String showStudent(Model md) {
		System.out.println("I am in showStudent");
		Student std = new Student();
		md.addAttribute("student",std);
		return "register";
	}
	
//	@ResponseBody
//	@RequestMapping(value="/save")
	@PostMapping( value="save")
	public String saveStudent(@Valid @ModelAttribute("student") Student std,BindingResult bs,HttpServletRequest request,Model md) {
		if(bs.hasErrors()) {
			System.out.println("errors in code");
			return "register";
		}
		else {
			stdDao.saveStudent(std);
			Student stu = new Student();
			md.addAttribute("student",stu);
			HttpSession session=request.getSession();
			session.setAttribute("studnet", stu);
			return "save";
		}
			
	}
	
	@GetMapping(value="/allstudents")
	public String getAllStudents(HttpServletRequest request) {
		System.out.println("all students");
		List<Student> list= stdDao.getAllUsers();
		HttpSession session=request.getSession();
		session.setAttribute("studentinfo", list);

		return "students";
	}
	
	
	@RequestMapping(value="/edit",method =RequestMethod.GET)
	public String EditData(HttpServletRequest request,Map<String,Object> map,Model m) {
//		System.out.println("update");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
//		System.out.println(id);
//		Student stu=stdDao.getStudentByID(id);
//		System.out.println("stuu:"+stu);
//	HttpSession session=request.getSession();
//	session.setAttribute("studentdata", stu);
//		m.addAttribute("data",stu);
		Student student=stdDao.getStudentByID(id);
//		map.put("Student", student);
		m.addAttribute("stu",student);
		System.out.println("m:"+m);
//		System.out.println("map:"+map);

		return "edit";
	}
	
	@PostMapping(value = "/update")
	public String Update(Model m,@ModelAttribute("stu") Student student,HttpServletRequest request) {
		stdDao.updateStudent(student);
		Student stu = new Student();
		m.addAttribute("student",stu);
		HttpSession session=request.getSession();
		session.setAttribute("studnet", stu);
		
		return "update";
		
	}

}
