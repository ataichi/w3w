<%-- 
    Document   : adminHOME
    Created on : Nov 9, 2014, 9:34:57 PM
    Author     : Giodee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="jquery-2.1.0.min.js" type="text/javascript"></script>
        <script src="js-adminhome.js" type="text/javascript"></script>
        <script src="js-general.js" type="text/javascript"></script>

        <title>JSP Page</title>



    </head>
    <body>

        <div id="logo"><img id="logoimg" src="images/logo.png"/></div>

        <div id="content">
            <div id="navbar">
                <a href="adminHOME.jsp">HOME</a> ||
                <a href="adminAccount.jsp">Account </a>
            </div>
        </div>

        <div id="actions">
            <a href="signup_productmanager.html">Add Product Manager</a>
            <br>
            <br>
            <a href="signup_accountingmanager.html">Add Accounting Manager</a>
            <br>
            <br>
            <a href="viewlogs.html">View Activity Log </a>

        </div>
    </body>
</html>
