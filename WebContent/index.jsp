<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.button {
  border-radius: 4px;
  background-color: green;
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
<style>
body  {
  background-image: url("thor.jpg");
  background-color: #cccccc;
  background-size: cover;
}
</style>
<title>Insert title here</title>
</head>
<body marginwidth="20" background="back1.jpg" >
	<marquee behavior="alternate"><font face="Comic sans MS" size="10" style="color: pink">Welcome to Hexaware</font></marquee>
	<a href = "adminlogin.jsp"><img align="right" height="50" width="50"  alt="admin" src="admin.jpg" title="admin"></a>
	<h3 style="color: red">${a}</h3>><br>
	<a href = "Register.jsp"><font face="Comic sans MS" size="5"><button class="button" title="Register"><span>Register</span></button></font></a><br>
	<a href = "login.jsp"><font face="Comic sans MS" size="5"><button class="button" title="Login"><span>Login</span></button></font></a>
	<!-- <p  align="center"><iframe width="560" height="315" src="https://www.youtube.com/embed/JVYNV1WYhqk?autoplay=1"></iframe></p><br> -->
	<marquee behavior="slide" ><font face="Comic sans MS" size="10" style="color: pink">Speed like Thor</font></marquee>
	<br>
	<br>
</body>
</html>