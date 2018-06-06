package com.quanlian.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quanlian.mapper.StudentMapper;
import com.quanlian.pojo.Student;
import com.quanlian.pojo.StudentExample;
import com.quanlian.pojo.StudentExample.Criteria;
import com.quanlian.services.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentMapper studentMapper;
	
	
	
	public List<Student> listAllStudent() throws Exception {
		
		List<Student> listStudent = new ArrayList<Student>();
		
		StudentExample studentExample = new StudentExample();
		Criteria criteria  = studentExample.or();
		
		listStudent = studentMapper.selectByExample(studentExample);
		
		
		return listStudent;
	}

	
	
}
