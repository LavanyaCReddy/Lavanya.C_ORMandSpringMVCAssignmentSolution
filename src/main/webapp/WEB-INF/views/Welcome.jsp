<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<h1>Welcome to Customer Relationship Management</h1>
<form action="/customer-details/Customer/new-customer" method="post">
<input type="hidden" name="id" placeholder="CustomerId" /> <br>
<input type="text" name="firstname" placeholder="FirstName" /> <br>
<input type="text" name="lastname" placeholder="LastName" /> <br>
<input type="text" name="email" placeholder="Email" /> <br>
<br> <input type="submit" name="s" value="Save"/>


</form>


</div>

</body>
</html>