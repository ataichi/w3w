<%-- 
    Document   : productmanagerAccount
    Created on : Nov 15, 2014, 11:44:42 PM
    Author     : Giodee
--%>
<%@page import="Beans.AccountBean"%>

<%
    AccountBean homeproduct = (AccountBean) session.getAttribute("homeproduct");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <script src="jquery-2.1.0.min.js" type="text/javascript"></script>
        <script src="js-general.js" type="text/javascript"></script>

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
            <div id="banner"> <a href="login.html"><img src="books.jpg"></a> </div>
        </header>
        <nav>
            <ul>
                <li><a href="productmanagerHOME.html">Home</a>    </li>
                <li><a href='#'>Account
                        <ul>
                            <li><a href='productmanagerAccount.jsp'>Edit Account</a></li>
                            <li><a href='#'>Log out</a></li>
                        </ul>
                </li>
            </ul>
        </nav>
        
                <div id="actions">
            <br/>
            <br/>
            
            <a href="#.html">Add Product</a>
            <br>
            <br>
           <br>
        </div>
        <h1>Hello <%out.println(homeproduct.getUsername()); %> !</h1>
    </body>
</html>
