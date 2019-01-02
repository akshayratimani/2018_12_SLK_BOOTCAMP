<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="https://vinod.co/custom-tags/slk" prefix="slk" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Custom tags demo</title>
</head>
<body>
	<h1>Custom tags demo</h1>
	<hr>
	
	<h3>Today is <slk:today /> </h3>
	<h3>Today is <slk:today format="d/M/y" /> </h3>
	<h3>Today is <slk:today format="yyyy-MM-dd"/> </h3>
	<h3>Today is <slk:today format="EEEE MMMM yyyy, dd"/> </h3>
</body>
</html>