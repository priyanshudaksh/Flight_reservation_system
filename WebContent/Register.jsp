<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
input[type=email], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=number], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=date], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<title>Insert title here</title>
</head>
<body>
${msg}
<!-- <form action="RegisterServlet" method="post">
Enter Name: <input type="text" name="name"><br>
Enter Password: <input type="password" name="password"><br>
Enter Mobile: <input type="number" name="mobile"><br>
Enter Email: <input type="text" name="email"><br>
Enter DOB: <input type="date" name="dob"><br>
<input type="submit" value="submit">
</form> -->
<div>
  <form action="RegisterServlet" method="post">
    <label for="name">Enter Name</label>
    <input type="text" id="name" name="name" placeholder="Enter Name...">

    <label for="Password">Enter Password</label>
    <input type="password" id="password" name="password" placeholder="Password.....">
	
	<label for="mobile">Enter Mobile</label>
    <input type="number" id="number" name="mobile" placeholder="Mobile....">
    
    <label for="email">Enter Email</label>
    <input type="email" id="email" name="email" placeholder="Email.....">
    
    <label for="dob">Enter Dob</label>
    <input type="date" id="dob" name="dob" placeholder="DOB.....">
    <!-- <label for="country">Country</label>
    <select id="country" name="country">
      <option value="australia">Australia</option>
      <option value="canada">Canada</option>
      <option value="usa">USA</option>
    </select> -->
  
    <input type="submit" value="Submit">
  </form>
</div>
</body>
</html>