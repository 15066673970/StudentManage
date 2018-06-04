package com.quanlian.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;
/**
 * ȫ���쳣����
 * @author java
 *
 */
public class MyHandleException implements HandlerExceptionResolver{

	public ModelAndView resolveException
	(HttpServletRequest request,
			HttpServletResponse response, 
			Object handler,
			Exception ex) {
		//�Ѵ�����Ϣ��ʾ����ҳ��
		
		//�ж��쳣�ǲ������Ƕ����
		String errorMsg="";
		if (ex instanceof StudentException)
		{
			errorMsg=ex.getMessage();
		}else {
			errorMsg="������";
		}
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("errorMsg", errorMsg);
		modelAndView.setViewName("exception");
		//�Ѵ������ϸ��Ϣ���浽mysql
		
		StringWriter stringWriter=new StringWriter();
		PrintWriter printWriter=new PrintWriter(stringWriter);
		ex.printStackTrace(printWriter);
		String detailErrormsg=stringWriter.toString();
		System.out.println("----------���������---");
		System.out.println(detailErrormsg);
		
		
		
		
		return modelAndView;
	}

}
