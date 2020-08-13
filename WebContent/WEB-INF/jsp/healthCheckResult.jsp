<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Health" %>

<%
// restore Health instance from request scope
Health health = (Health) request.getAttribute("health");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<h1>Result is here!</h1>
<p>
Height: <%= health.getHeight() %> <br>
Weight: <%= health.getWeight() %> <br>
BMI: <%= health.getBmi() %> <br>
Body Type: <%= health.getBodyType() %>
</body>
</html>