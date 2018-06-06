package com.quanlian.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quanlian.mapper.UserMapper;
import com.quanlian.pojo.User;
import com.quanlian.pojo.UserExample;
import com.quanlian.pojo.UserExample.Criteria;
import com.quanlian.services.UserService;
@Service
public class UserServiceImpl implements UserService {
	//�Զ�ע��
	@Autowired
	UserMapper userMapper;
	
	User user;
	public User loginByNameAndPassword(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public User registerByNameAndPassword(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public User modifyByUserName(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public int checkByUserName(String username) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	public int checkByUserNameAndPassword(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	public String checkPasswordByUserName(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
