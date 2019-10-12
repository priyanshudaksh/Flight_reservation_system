<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- flight_id flight_name source destination date time fare Class -->
<body marginwidth="20">
<img align="right" width="100" height="100" src="${a.asrc}" alt="dp">
<font size="5">Hello ${a.aname}</font> <br>
<%-- <c:forEach var="p" items = "${a}">  
   name : ${a.aname}
</c:forEach>   --%>
<a href = "LogoutServlet"><h2 align="right">Logout</h2></a>
<a href="index.jsp">Home</a>
<h3 style="color:green">${status}</h3>
<a href = "ListallFlightsServlet"><h3 align="right">All Flights</h3></a>
<form action="FlightEntryServlet" method="post">
<font face = "Comic sans MS" size = 5>Enter Flight Name</font><input type="text" name="fname"><br>
<font face = "Comic sans MS" size = 5>Enter Source</font><input type="text" name="fsrc"><br>
<font face = "Comic sans MS" size = 5>Enter Destination</font><input type="text" name="fdes"><br>
<font face = "Comic sans MS" size = 5>Select date</font><input type="date" name="fdate"><br>
<font face = "Comic sans MS" size = 5>Enter Flight Time</font><input type="time" name="ftime"><br>
<font face = "Comic sans MS" size = 5>Enter Fare</font><input type="number" name="ffare"><br>
<font face = "Comic sans MS" size = 5>Enter Flight class</font>
	<input type = "radio" name = "fclass" value = "Economy"> Economy
	<input type = "radio" name = "fclass" value = "Business"> Business<br>
<input type="submit" value="submit">
</form>
</body>
</html>