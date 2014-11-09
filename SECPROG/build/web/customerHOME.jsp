
<%@page import="Beans.AccountBean"%>
<%@page import="Beans.CustomerBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Home Page</title>
    </head>
    <body>
        <% AccountBean homeuser = (AccountBean) session.getAttribute("homeuser"); %>
        <h1>Hello <% out.print(homeuser.getUsername());%> !</h1>
    </body>
</html>
