<%-- 
    Document   : customerAccount
    Created on : Nov 15, 2014, 10:27:25 AM
    Author     : Giodee
--%>

<%@page import="Beans.AccountBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="jquery-2.1.0.min.js" type="text/javascript"></script>
        <script src="js-general.js" type="text/javascript"></script>
        <script src="js-edit.js" type="text/javascript"></script>


        <title>Edit Account</title>
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

        <div id='actions'>
        <h1>Hello <% out.print(homeuser.getUsername());%> !</h1>

        <a href='customerAccount.jsp'>General</a>
        <br/>
        <a href='customerBilling.jsp'>Manage Billing Information</a>
        <br/>
        <a href='customerPayments.jsp'>Manage Payment Information</a>
        <br/>
        <a href='customerTransactions'>View Transactions</a>
        <br/>
        </div>
    </body>
</html>
