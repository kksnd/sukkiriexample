<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fortune</title>
</head>
<body>
<% // tell fortune randomly
String[] luckArray = {"Amazing", "Great", "Good"};
int index = (int) (Math.random() * 3);
String luck = luckArray[index];
%>
<% // get executed date
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
String today = sdf.format(date);
%>
<p><%= today %>'s fortune is <%= luck %></p>
</body>
</html>