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

        <div id='editAccount'>
            <form action='EditServlet'>
                First Name:* &nbsp;&nbsp;&nbsp;&nbsp;
                <input type='text' id='editfirst' name='editfirst' value='<% out.println(homeuser.getFirstName()); %>' onblur='fnameCheck();' onfocus='backWhite(this);'/>
                <br/>
                Middle Name* &nbsp;
                <input type='text' id='editmiddle' name='editmiddle' value='<% out.println(homeuser.getMiddleInitial()); %>' onblur='fnameCheck();' onfocus='backWhite(this)'/>
                <br/>
                Last Name:* &nbsp;&nbsp;&nbsp;&nbsp;
                <input id='editlast' type='text' name="editlast" value='<% out.println(homeuser.getLastName()); %>' onblur='lnameCheck();' onfocus='backWhite(this);'/>
                <br/>
                Username:*  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input id='edituser' type='text' name="edituser" value='<% out.println(homeuser.getUsername()); %>' onblur='unameCheck();' onfocus='backWhite(this);'/>
                <br/>
                Email:*    &nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input id='editemail' type='email' name="editemail" value='<% out.println(homeuser.getEmailAdd());%>' onblur='emailCheck();' onfocus='backWhite(this);'/>
                <br/>
                <input type='submit' id='save' value='Save Changes'/>
            </form>
            <a href='customerAccount.jsp'><button>Cancel</button></a>

        </div>
    </body>
</html>
