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
    		<title>萤火世界杯</title>
    		<link href="js/test.css" type="text/css" rel="stylesheet">
    		<link href="js/jquery-ui.min.css" type="text/css" rel="stylesheet">
    		<link href="js/jquery-ui.theme.min.css" type="text/css" rel="stylesheet">
    		<script src="js/jquery-3.1.1.min.js"></script>
    		<script src="js/jquery-ui.min.js"></script>
		</head>
		<body>
			<form action="test1" method="post">
				ID:<input type="text" name="id" /><br/>
				PW:<input type="text" name="pw"/><br/>
				<input type="submit" value="提交"/>
			</form><br/>
			<div id="dialog" title="基本的对话框">
				<p>对话框。</p>
			</div>
			<div id="date">日期选择</div>
		</body>
		<script>
	        $(function() {
	            $("#dialog").dialog(),
	        });
	        $(function() {
	            $( "#date" ).datepicker(
	            		inline:true	;
	            );
	        });
		</script>
</html>