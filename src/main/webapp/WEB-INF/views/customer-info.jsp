<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1" import="java.util.List, com.greatlearning.customer.relationship.entity.Customer" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<h1>Customer Info</h1>
<div style="border:1px solid blue;background-color:yellow;color:blue;">
<%
List<Customer> customers=(List<Customer>)request.getAttribute("customerInfo");
out.println("<table border=1><tr><th>Id</th><th>FirstName</th><th>LastName</th><th>Email</th><th>Delete</th></tr>");
for(Customer s:customers){	
	out.println("<tr><td>"+s.getId()+"</td><td>"+s.getFirstname()+"</td><td>"+s.getLastname()+"</td><td>"+s.getEmail()+"</td><td><a href='/customer-details/Customer/delete-customer?id="+s.getId()+"'>Delete</a></td></tr>");
}

out.println("</table>");


%>
</div>
<a href="/customer-details/Customer/show-form">Add More..Students</a>
</div>
</body>
</html>