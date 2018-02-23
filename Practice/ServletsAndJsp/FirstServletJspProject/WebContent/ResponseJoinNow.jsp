<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to the shit club</title>
</head>
<body>

	<label>Email &#58;</label>
	<span>${credentials.email}</span><br>
	
	<label>First Name &#58;</label>
	<span>${credentials.firstName}</span><br>
	
	<label>Last Name &#58;</label>
	<span>${credentials.lastName}</span><br>
	
	<form action="" method="get">
		<input type="hidden" name="action" value="toHello" />
		<input type="submit" name="enter" value="Enter" />
		<input type="submit" name="back" value="Back" />
	</form>

</body>
</html>