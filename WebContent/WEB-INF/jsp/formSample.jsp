<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User registration (fake)</title>
</head>
<body>
<form action="/sukkiriexample/FormSampleServlet" method="post">
  Name: <br>
  <input type="text" name="name"><br><br>
  Male<input type="radio" name="gender" value="0">
  Female<input type="radio" name="gender" value="1"><br><br>
  <input type="submit" value="Enter">
</form>
</body>
</html>