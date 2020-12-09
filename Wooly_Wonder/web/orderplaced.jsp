<%-- 
    Document   : orderplaced
    Created on : 29-Jun-2018, 14:45:38
    Author     : Senani
--%>

<%@page import="Servlet.Login"%>
<%@page import="Pojos.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Account acc = Login.getLoggedInAccount(request.getSession());
    if (acc == null) {
%>
<jsp:include page="defaultnavbar.jsp"/>  
<%
} else {
%>
<jsp:include page="FixedTopNavBar.jsp"/>  
<% }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <jsp:include page="Links/Links.jsp"/>
        <link href="CSS/maincss.css" type="text/css" rel="stylesheet">
        <style>
            #f{
                background-color: lightgrey;
                height: 90px;
            }
        </style>
    </head>
    <body>
        <br><br> 
        <div class= container-fluid" id="f">
            <div class="wel well-lg">

                <h2 style="margin-left: 60px;">Order Palced</h2>
            </div>
        </div>
        <br><br>
        <h1>Thank You</h1>
    </body>
    <jsp:directive.include file="Footer.jsp"/>
</html>
