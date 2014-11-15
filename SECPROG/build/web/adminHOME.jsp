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
        <title>JSP Page</title>
        <style type="text/css">
            #logo {
                float:left;
                height:50px;
                width:60px;
                margin-left:10px;
                margin-right:-100px;
                margin-top:10px;
                position: absolute;
            }

            #logoimg {
                height:100px;
                width:auto;
            }

            #content{
                background-color: #FFFFF;
                margin-left:-10px;
                margin-right:-10px;
                margin-top:-10px;
                height: 130px;
            }

            #navbar {
                padding-top: 75px;
                padding-left: 1000px;
                background-color:#FD97BE;
                text-align: left;
                height: 40px;
            }

            #navbar li {
                list-style-type: none;
            }

            #navbar a {
                color: blueviolet;
                text-decoration: none;
                font-family:Arial;
                font-size: 20px;
                padding: 30px;
            }	

            #navbar a:hover{ 
                color: red;
                font-weight:bold;
            }
        </style>


    </head>
    <body>

        <div id="logo"><img id="logoimg" src="images/logo.png"/></div>

        <div id="content">
            <div id="navbar">
            </div>
        </div>

        
        <a href="signup_productmanager.html">Add Product Manager</a>
        <br>
        <a href="signup_accountingmanager.html">Add Accounting Manager</a>
        <br>
        <a href="viewlogs.html">View Activity Log </a>
    </body>
</html>
