<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session Demo</title>
</head>
<body>
	<h1>Session Demo</h1>
	<hr>
	<h3>Add a name</h3>
	
	<!-- in the absence "action" attribute, the form
	will be submitted to the same URL displayed on the
	address bar of the browser. -->
	<form method="POST" >
		<div>
			<input type="text" placeholder="Enter a friend's name..."
			name="name">
		</div>
		<button>Add to list</button>
	</form>
</body>
</html>