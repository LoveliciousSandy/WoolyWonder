<%-- 
    Document   : defaultnavbar
    Created on : 20-Jun-2018, 01:31:41
    Author     : Senani
--%>


<%@page import="java.util.List"%>
<%@page import="Pojos.Account"%>
<%@page import="Servlet.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html><jsp:include page="Links/Links.jsp"/>
<link href="CSS/maincss.css" type="text/css" rel="stylesheet">
<style>  

    #myww{
        border: none;
        background-color:transparent;
        padding-top: 25px;
        margin-top: -10px;
    }

    #searchbarinput{
        margin-top: 10px;

    }

    #searchbarbtn{
        margin-top: 10px;
        border: none;
        background-color: transparent;
    }
    .navbar-brand{
        font-family: serif;
        font-style: oblique;

        margin-left: 100px;



    }

</style>

<body>

    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header" style="padding-bottom: 20px; padding-top: -30px; margin-left: 100px; " >
                <a style="font-size: 40px; color: red" class="navbar-brand" href="index.jsp">Wooly Wonder</a>
            </div>
            <form action="<%= request.getContextPath()%>/Productsearch.jsp" method="POST">
                <ul class="nav navbar-nav navbar-right" style="padding: 0px 40px 0px 0px;">
                    <li>  
                        <input id="searchbarinput" name="q" type="text" class="form-control input-sm" value="${param.q}" placeholder="search">
                    </li>
                    <li><a href=""><i class="fa fa-search fa-fw fa-lg"></i></a></li>

                    <li><a href="mybag.jsp"><i class="fa fa-shopping-bag fa-fw fa-lg"></i></a></li>
                    <li id="si"><a href="Login_Signup/Login.jsp">Sign In</a></li>

                </ul>
            </form>
        </div>
    </div>
