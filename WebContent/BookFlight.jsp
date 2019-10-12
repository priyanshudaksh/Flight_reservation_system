<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
input[type=email], select {
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=number], select {
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=date], select {
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 90%;
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
<title>Set your Journey</title>
</head>
<body>
<div>
  <form action="bookServlet" method="post">
    <label for="Source">Source........</label>
    <select id="source" name="source">
      <option value="MAA">Chennai</option>
      <option value="MUM">Mumbai</option>
      <option value="DEL">Delhi</option>
      <option value="PAT">Patna</option>
    </select><br>

    <label for="Destination">Destination</label>
    <select id="destination" name="destination">
      <option value="MAA">Chennai</option>
      <option value="MUM">Mumbai</option>
      <option value="DEL">Delhi</option>
      <option value="PAT">Patna</option>
    </select> <br>
    
    <label for="Class">Class.........</label>
    <select id="class" name="cateogory">
      <option value="Economy">Economy</option>
      <option value="Business">Business</option>      
    </select> <br>
    
    <label for="passangers">No. of Passangers</label>
    <input type="number" id="passangers" name="passangers" placeholder="Enter Number of passangers..."><br>
    
	<label for="dob">Enter DOJ</label>
    <input type="date" id="doj" name="doj" placeholder="DOJ.....">
    <!-- <label for="country">Country</label>
    <select id="country" name="country">
      <option value="australia">Australia</option>
      <option value="canada">Canada</option>
      <option value="usa">USA</option>
    </select> -->
  
    <input type="submit" value="Search">
  </form>
</div>
</body>
</html>