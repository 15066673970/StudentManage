package com.quanlian.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.quanlian.*;
import com.quanlian.pojo.Student;
import com.quanlian.pojo.User;
import com.quanlian.services.StudentService;
import com.quanlian.services.UserService;
import com.sun.research.ws.wadl.Request;
@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	
	

	
	HttpSession httpSession;
	User loginUser;
	/*
	 * һ��������������¼����ķ���
	 */
	@RequestMapping("/toindex")
	public ModelAndView  tologinjsp() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	

}
