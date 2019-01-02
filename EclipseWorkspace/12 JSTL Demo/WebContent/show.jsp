<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
</head>
<body>

	<h1>${title}</h1>

	<h3>Data of p1 is:</h3>
	<div>
		<p>Name: ${p1.fullname}</p>
		<p>City: ${p1.city }
	</div>

	<h3>List of names:</h3>
	<ul>
		<c:forEach items="${names }" var="nm">
			<li>${nm }</li>
		</c:forEach>
	</ul>

	<h3>List of people:</h3>
	<ul>
		<c:forEach items="${people}" var="p">
			<li>${p.firstname }${p.lastname } lives in ${p.city }
		</c:forEach>
	</ul>

</body>
</html>








