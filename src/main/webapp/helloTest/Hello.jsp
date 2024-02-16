<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	
	//스크립틀릿
	
	String name = "정건희";
	String inputValue = "test";
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
		<li><%= name %></li>
	</ul>
	<div>
		<input value="<%= inputValue %>">
	</div>
	
</body>
</html>