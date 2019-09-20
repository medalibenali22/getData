<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>test</h1>

	<table>
		<tr>
			<td>Sender</td>
			<td>Submission Id</td>
			<td>Application Number</td>
			<td>Formtype</td>
			<td>Current States</td>
			<td>Receiving Time</td>
			<td>State Timestamp</td>
			<td>Comment</td>
			<td>Team</td>
			<td>Status</td>
		</tr>
		
		 <c:forEach items="${submissions}" var="submission">
		 
		 <tr>
			<td>${submission.sender}</td>
		</tr>
         
      </c:forEach>
		

	</table>
</body>
</html>