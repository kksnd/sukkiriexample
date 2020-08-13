<%@page import="model.SiteEV"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omochi</title>
</head>
<body>
<h1>Do you like OMOCHI??</h1>
<p>
<a href="/sukkiriexample/OmochiIndex?action=like">Like</a> <br>
<%= siteEV.getLike() %> likes <br><br>
<a href="/sukkiriexample/OmochiIndex?action=dislike">Dislike</a> <br>
<%= siteEV.getDislike() %> dislikes
</p>
</body>
</html>