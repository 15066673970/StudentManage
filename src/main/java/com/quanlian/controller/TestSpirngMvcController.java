package com.quanlian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quanlian.services.UserService;

@Controller
public class TestSpirngMvcController {
	@Autowired
	UserService userService ;
	
	@RequestMapping("testspringmvccontroller")
	public ModelAndView testMethod(){
		ModelAndView modelAndView  = new ModelAndView();
		modelAndView.setViewName("error");
		return modelAndView;
	}
	
}
