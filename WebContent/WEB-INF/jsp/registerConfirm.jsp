<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User registerUser = (User) session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<body>

<h1>This user will be registered! OK??</h1>

<p>
ID: <%= registerUser.getId() %> <br>
Name: <%= registerUser.getName() %>
</p>

<a href="/sukkiriexample/RegisterUser">Back</a>
<a href="/sukkiriexample/RegisterUser?action=done">Register</a>

</body>
</html>