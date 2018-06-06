package com.quanlian.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quanlian.pojo.Student;
import com.quanlian.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/test1")
	public ModelAndView test1(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		int id = Integer.parseInt(httpServletRequest.getParameter("id"));
		String pw = httpServletRequest.getParameter("pw");
		System.out.println("---------------------");
		System.out.println("            -id："+id+"            -pw："+pw);
		System.out.println("--------------------------");
		List<Student> listStudent = studentService.listAllStudent();
		modelAndView.addObject("allStudent", listStudent);
		modelAndView.addObject("id",id);
		modelAndView.addObject("pw",pw);
		modelAndView.setViewName("error");
		
		return modelAndView;
	}
}
