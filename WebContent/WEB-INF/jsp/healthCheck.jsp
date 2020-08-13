<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Health Check</title>
</head>
<body>
<h1>Let's check your health!</h1>
<form action="/sukkiriexample/HealthCheck" method="post">
  Height: <input type="text" name="height"> [cm] <br>
  Weight: <input type="text" name="weight"> [kg] <br>
  <input type="submit" value="Check now">
</form>
</body>
</html>