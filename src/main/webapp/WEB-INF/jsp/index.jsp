<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<% 
			String sch = request.getScheme();
			String server = request.getServerName();
			int port = request.getServerPort();
			String context = request.getContextPath();
			String basePath=sch+"://"+server+":"+port+context+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
		<head lang="en">
			<base href="<%=basePath%>" />
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    		<title>首页</title>
		</head>
		<body>
			<h1>test</h1>
		</body>
</html>