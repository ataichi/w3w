
<%@page import="Beans.AccountBean"%>
<%@page import="Beans.CustomerBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="jquery-2.1.0.min.js" type="text/javascript"></script>
        <script src="js-general.js" type="text/javascript"></script>


        <title>Customer Home Page</title>
    </head>
    <body>
        <div id="logo"><img id="logoimg" src="images/logo.png"/></div>

        <div id="content">
            <div id="navbar">
                <a href="customerHOME.jsp">HOME</a> ||
                <a href="customerAccount.jsp">Account</a> 
            </div>
        </div>

        <% AccountBean homeuser = (AccountBean) session.getAttribute("homeuser"); %>
        <h1>Hello <% out.print(homeuser.getUsername());%> !</h1>
    </body>
</html>
