<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!--  only when you make isErrorPage as true then exception object is got  -->
<%@ page isErrorPage="true" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="3">
		<tr>
			<td><img src="images/fannie.jpg"/></td>
			<td>
				Your message Goes here <hr />
				<%=exception.getMessage() %>
			</td>
		</tr>
	</table>
</body>
</html>