<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
<h1>Input user information</h1>
<form action="/sukkiriexample/RegisterUser" method="post">
  ID: <input type="text" name="id"> <br>
  Password <input type="password" name="pass"> <br>
  Name: <input type="text" name="name"> <br>
  <input type="submit" value="Confirm">
</form>
</body>
</html>