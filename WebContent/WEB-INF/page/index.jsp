<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% 	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>。。。</title>
</head>
<body>


<h1 id="h">${user.name }</h1>
</body>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">

$("#h").on("click",function(){
	$.post("byResponse.do",{
			
			},
			function(data){
			
			$("#h").text(data.enty.name)
			},"json")
})


</script>
</html>