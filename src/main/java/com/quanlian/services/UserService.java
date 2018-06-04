package com.quanlian.services;

import java.sql.SQLException;

import com.quanlian.pojo.User;

public interface UserService {
	//ͨ1.通过用户名和密码登陆的方法
		/**
		 * 通过用户名和密码登陆的方法
		 * @param username 输入的用户名
		 * @param password	输入的密码
		 * @return	返回一个User对象
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		public abstract  User loginByNameAndPassword(String username,String password) throws Exception;
		
		/**
		 * 通过用户名和密码注册的方法
		 * @param username 输入的用户名
		 * @param password	输入的密码
		 * @return 返回创建好的user对象
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		
		public abstract  User registerByNameAndPassword(String username,String password) throws Exception;
		
		
		/**
		 * 通过用户名修改密码的方法
		 * @param username 输入的用户名
		 * @param password	输入的新密码
		 * @return 返回创建好的user对象
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		
		public abstract User modifyByUserName(String username,String password ) throws Exception;
		/**
		 * 查询用户名是否已经被占用的方法
		 * @param username 查询的用户名
		 * @return 返回是否有这样一条记录
		 * @throws Exception
		 */
		public abstract int checkByUserName(String username) throws Exception;
		/**
		 * 通过登录用户名和输入的密码来查询当前输入的密码是否和旧密码一样
		 * @param username 登录的用户名
		 * @param password	输入的密码
		 * @return 返回是否有这样一条记录
		 * @throws Exception
		 */
		public abstract int checkByUserNameAndPassword(String username,String password) throws Exception;
		/**
		 * 通过用户名查询登录密码的方法
		 * @param username 要查询的用户名
		 * @return	返回当前用户的密码
		 * @throws Exception
		 */
		public abstract String checkPasswordByUserName(String username) throws Exception;
}
