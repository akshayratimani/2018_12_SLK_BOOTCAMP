<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
<link rel="stylesheet" type="text/css"
	href="./assets/bootstrap/bootstrap.min.css">

</head>
<body>

	<div style="background-color: lightblue;">
		<br>
		<h2>
			<b>Hotel Management</b> <div style="position:absolute; left:1450px; top:30px;"><a class="btn btn-primary" href="./Orders">DisplayOrders</a></div>
		</h2>
		<hr>
	</div>

	<div class="row" >
		<div class="col-sm-6">
			<h3>Add Order...</h3>
			<form action="./AddDish" method="POST" class="form">
				<div class="form-group" >

					<label>Select table Number:</label> <select name="tn">
						<option value="1">Table 1</option>
						<option value="2">Table 2</option>
						<option value="3">Table 3</option>
						<option value="4">Table 4</option>
						<option value="5">Table 5</option>
						<option value="6">Table 6</option>
						<option value="7">Table 7</option>
						<option value="8">Table 8</option>
					</select>
				</div>
				<div class="form-group">

					<label>Enter Dish:</label> <input type="text" name="dish">
				</div>
				
				
				<pre>    <input class="btn btn-primary" type="submit" value="ADD"></pre>
			
			</form>
		</div>
	</div>

</body>
</html>