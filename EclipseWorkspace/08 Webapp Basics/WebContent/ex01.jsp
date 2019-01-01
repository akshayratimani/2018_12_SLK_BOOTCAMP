<%!
	
	public void jspInit() {
	
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello, JSP!</title>
</head>
<body>
	<h1>Hello, JSP!</h1>
	<hr>
	<%
		// This is a special JSP block called scriplet
		// where we can write Java code.
		// This code will be part of the _jspService function
		// of the resulting servlet.
		// The code written here will not be converted into
		// a series of out.write(..) calls, unlike the HTML part.
		
		String name = "Vinod";
		out.println("A greeting message from " + name);
	%>
</body>
</html>