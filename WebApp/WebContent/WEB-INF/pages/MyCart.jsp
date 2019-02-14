<%@page import="com.slk.entity.Products"%>
<%@page import="java.util.List"%>
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
<body>

<br>

	<div>
		<h1>
			<b>Online Shopping</b>
		</h1>
		<hr style="height:1px;border:none;color:#333;background-color:#333;" />
	</div>
	
	<div style="position: absolute; left: 1120px; top: 30px;">
		<a href="./ShowProducts" class="btn btn-primary">Show products</a>
	</div>

	<h3>My Cart</h3>
	<hr>
	
	<%
		List<Products> li = (List<Products>) request.getAttribute("abc");
	
		if(li.isEmpty())
		{
			%>
				<h6>No Products found</h6>
			<% 
		}
		else
		{
		for(Products p : li){
	%>
		<div style="background-color: #DBE1E1">
			<hr>
			<b>ProductName:<%= p.getName() %></b><br>
			Price:<%=p.getPrice() %><br>
			Rating:<%=p.getRating() %>
			<br>
			<br>
			<a href="./RemoveFromCart?id=<%=p.getId() %>" class="btn btn-primary">Remove</a> 
			<hr>
		</div>
		&nbsp;&nbsp;&nbsp;<a href="Buy.jsp" class="btn btn-primary">Buy</a>
		<br><br>
	<%
		}
		}
	%>
		
		


</body>
</html>