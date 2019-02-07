<%@page import="com.slk.entity.OrdersClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Orders</title>
<link rel="stylesheet" type="text/css"
	href="./assets/bootstrap/bootstrap.min.css">
</head>
<body>
	<div style="background-color: lightblue;">
		<br>
		<h2>
			<b>Hotel Management</b>
		</h2>
		<div style="position: absolute; left: 1350px; top: 30px;">
			<a class="btn btn-primary" href="./AddDish">AddDish</a>
		</div>
		<hr>
	</div>

	<h3>Orders</h3>



	<%
		OrdersClass obj[] = (OrdersClass[]) request.getAttribute("orders");
		System.out.println("Final:" + obj[0]);
		if (obj.length == 0) {
	%>

	<h6>No Orders</h6>

	<%
		} else {
			
			%>
			<table class="table table=striped table-bordered table-hover">
			<thead>
				<tr>
					<th>TableNumber</th>
					<th>Order</th>
				</tr>
			</thead>
			<%
			

			for (int i = 0; i < obj.length; i++) {
				if (obj[i] == null) {

				} else {
	%>
	
		<tbody>
			<tr>
				<td><%=obj[i].getTableNumber()%></td>
				<td><%=obj[i].getDish()%></td>
			</tr>
			<%
				}
					}

				}
			%>

		</tbody>

	</table>

</body>
</html>