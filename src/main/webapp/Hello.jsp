<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	
	//스크립틀릿
	
	List<String> names = List.of("정건희","정건이","정건삼");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello</h1>
	<ul>
		<%
			for(String name : names) {
		%>
			<li>${name}</li>
		<%
			};
		%>
		
	</ul>
	
</body>
</html>