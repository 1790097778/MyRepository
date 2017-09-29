<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ERROR!</title>
<style type="text/css">
.words{
	text-align:"center";
	font: 40xp;
}
p{
	padding-left:7.5%;
	color:Red;
	font: 30xp;
}
</style>
</head>
<body>
<h1 class = "words">ERROR:<%=request.getParameter("error")%></h1>
<% 
	String msg[] = request.getParameterValues("error");
	int length = msg.length;
	for(int i = 1;i < length; i++){
		out.print("<p>"+msg[i]+"</p>");
	}
%>
</body>
</html>