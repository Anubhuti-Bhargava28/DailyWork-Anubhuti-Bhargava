<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Declaration Tag -->
	<%!int requestCount = 0;%>
	<!-- Scriptlet Tag -->
	<%
		requestCount++;
	%>
	<%--Helooo polly koldfsf --%>
	<!-- Expression Tag -->
	<h1>
		No. Of User :<%=requestCount%></h1>
	<br>
	<br>

	<h1>
		Todays date is as<%=new Date()%></h1>
	<hr>
	<hr>
	<h1>
		Todays date is as<%=new Date()%></h1>

</body>
</html>