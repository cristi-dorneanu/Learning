<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h1>My First JSP</h1>
	
	<label>Hello &nbsp;</label>
	<span>${user.name}</span><br>
	
	<form action="" method="get">
		<input type="hidden" name="action" value="back">
		<input type="submit" value="Go Back">
	</form>
</body>
</html>