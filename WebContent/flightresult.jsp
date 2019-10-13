<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>   
 input#submit{
  background:none;
  border:none;
  font-size:1em;
  color:blue;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body marginheight="20">
<h3>Flight Id     Flight Name     Source	Destination     Fare	Time		Seats</h3>
<c:forEach var="p" items = "${flight}"> 
	<form action="payServlet" method="post"> 
   <input type="submit" name="id" value="${p.fid}     ${p.fname }     ${p.source}     ${p.destination}     Rs.${p.fare}      ${p.time}      ${p.seats}" id="submit"><br>
 	<br>
   </form>
</c:forEach>
</body>
</html>