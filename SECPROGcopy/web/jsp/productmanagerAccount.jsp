<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : productmanagerAccount
    Created on : Nov 15, 2014, 10:02:34 PM
    Author     : Giodee
--%>

<%@page import="Beans.AccountBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    AccountBean homeuser = (AccountBean) session.getAttribute("homeuser");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="jquery-2.1.0.min.js" type="text/javascript"></script>
        <script src="js-general.js" type="text/javascript"></script>
        <script src="js-edit.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="wadesign.css">
        <link rel="stylesheet" type="text/css" href="category.css">
        <link rel="stylesheet" type="text/css" href="style4.css">
        <link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Istok+Web|Exo+2' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Istok+Web|Exo+2|Over+the+Rainbow' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Muli' rel='stylesheet' type='text/css'>

        <title>Edit Account</title>
    </head>
    <body>
        <header>
            <div id="banner"> <a href="productmanagerHOME.jsp"><img src="books.jpg"></a> </div>
        </header>

        <nav>
            <ul>
                <li><a href="productmangerHOME.jsp">Home</a>    </li>
                <li><a href='#'>Account</a>
                    <ul>
                        <li><a href='productmanagerAccount.jsp'>Edit Account</a></li>
                        <li><a href='#'>Log out</a></li>
                    </ul>
                </li>
            </ul>
        </nav>

        
        <div id='actions'>
            <br>
            <br>
            <a href='addproduct.jsp'>Add Product</a>
            <br/>
            <br>
            
            arrange item
        </div>
        
    </body>
</html>
