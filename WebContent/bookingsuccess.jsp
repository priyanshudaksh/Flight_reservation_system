<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.button {
  border-radius: 4px;
  background-color: blue;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 15px;
  padding: 20px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
</style>
<title>Insert title here</title>
</head>
<body>
Done<br>
<a href="LogoutServlet">Logout</a><br>
<%-- <a href="Tickets\\Ticket${name}${seat}.pdf" download>Download Ticket</a> --%>
<%-- <a href="Tickets/Ticket${name}${passenger}.pdf" download>Download Ticket</a> --%>
<p align="center"><a href = "Tickets/Ticket${name}${passenger}.pdf" download><button class="button" title="Download Ticket"><span>Download Ticket</span></button></a></p><br>
</body>
</html>