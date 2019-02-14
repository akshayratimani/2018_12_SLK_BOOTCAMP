<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet" type="text/css"
	href="./assets/bootstrap/bootstrap.min.css">


</head>
<body style="text-align: center">





	<h2>LOGIN PAGE</h2>

	<form action="LoginServlet" method="post">

		<div style="margin-bottom: 15px">
			Username : <input type="text" name="uname" id="username">
		</div>


		<div style="margin-bottom: 15px">
			Password : <input type="password" name="pass">
		</div>



		<div>
			<input type="submit" value="submit" class="btn btn-primary">
		</div>


	</form>
	



</body>
</html>