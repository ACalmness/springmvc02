<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="doRegister.s">
		<input type="text" name="name" placeholder="姓名"><br>
		<input type="radio" name="sex" value="男">男
		<input type="radio" name="sex" value="女">女<br>
		<input type="text" name="age" placeholder="年龄"><br>
		<input type="date" name="birthday">
		<input type="submit" value="提交">
	</form>
</body>
</html>