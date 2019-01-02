<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session Demo</title>
</head>
<body>
	<h1>Session Demo</h1>
	<hr>
	
	<%
	
	List<String> names = (List<String>) session.getAttribute("names");
	if(names==null) {
		%>
		<h3>No names yet</h3>
		<p>Click <a href="./add-name">here</a> to add a new name</p>
		<%
	}
	else {
		out.println("<h3>Here are your names: </h3>");
		out.println("<ul>");
		for(String name: names) {
			out.println("<li>" + name + "</li>");
		}
		out.println("</ul>");
	}
	%>
	
	
	<h3>The names entered by other clients: </h3>
	<%
		List<String> names2 = (List<String>) application.getAttribute("names");
		if(names2 != null) {
			out.println("<ul>");
			for(String name: names2) {
				out.println("<li>" + name + "</li>");
			}
			out.println("</ul>");
		}
	%>
</body>
</html>
















