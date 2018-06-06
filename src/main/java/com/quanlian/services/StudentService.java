package com.quanlian.services;

import java.util.*;
import com.quanlian.pojo.*;

public interface StudentService {
	
	/**
	 * 显示所有信息
	 */
	public abstract List<Student> listAllStudent() throws Exception;

}
