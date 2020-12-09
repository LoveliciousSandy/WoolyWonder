<%-- 
    Document   : FixedTopNavBar
    Created on : 04-May-2018, 19:59:55
    Author     : Senani
--%>


<%@page import="hibernate.HibernateSession"%>
<%@page import="Pojos.Account"%>
<%@page import="Servlet.Login"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<style>
    
    .dropdown:hover > ul.dropdown-menu{
        display: block;
    }
    .dropdown-menu-content{
        width:350px;
        height: 200px;
    }
    #menu-content{
        padding: 20px 25px 0px 25px;
    }
    #footer-content{
        padding: 0px 25px 0px 25px;
    }
    #viewprofile{
        background-color: #ec407a;
        color: white;
        border: none;
    }
    #link{
        color: #333333;
    }
    #link:hover{
        color: hotpink;
    }
    #myww{
        border: none;
        background-color:transparent;
        padding-top: 25px;
        margin-top: -10px;
        color: white;
    }
    .dropdown-menu li{
        padding: 5px;
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
<%
    Account a = Login.getLoggedInAccount(request.getSession());
    if (a == null) {
    } else {
%>
<body>
    <div class="navbar navbar-inverse navbar-fixed-top" >
        <div class="container-fluid">
            <div class="navbar-header" style="padding-bottom: 20px; padding-top: -30px; margin-left: 100px; " >
                <a style="font-size: 40px; color: red" class="navbar-brand" href="index.jsp">Wooly Wonder</a>
            </div>
            <ul class="nav navbar-nav navbar-right" style="padding: 0px 20px 0px 0px;">
                <li>  
                    <form action="<%= request.getContextPath()%>/Productsearch.jsp" method="POST">
                        <input id="searchbarinput" name="q" type="text" class="form-control input-sm" value="${param.q}" placeholder="search">
                    </form>
                </li>
                <li><a href=""><i class="fa fa-search fa-fw fa-lg"></i></a></li>
                <!--               <li id="searchbar">
                                    <button id="searchbarbtn" type="submit" class="btn-sm"><i class="fa fa-search fa-fw fa-lg" ></i></button>
                
                                </li>-->
                <li> 
                    <div class="dropdown">
                        <button class=" btn btn-default dropdown-toggle" id="myww" data-toggle="dropdown">My WW Zone<i class="fa fa-caret-down"></i></button>


                        <ul class="dropdown-menu" role="menu">

                            <li><a href="myOrders.jsp">Recent Orders</a></li>
                            <li><a href="myOrdersHistory.jsp">Order History</a></li>
                            <li><a href="customorder.jsp">Custom Orders</a></li><!--
                                                        <li><a href="#">Wish List</a></li>-->

                        </ul>
                    </div>
                </li>
                <li><a href="mybag.jsp"><i class="fa fa-shopping-bag fa-fw fa-lg"></i></a></li>
                <li class="dropdown">
                    <a href=""><i class="fa fa-user fa-fw fa-lg"></i><i class="fa fa-caret-down"></i></a>
                    <ul class="dropdown-menu" role="menu">

                        <li><span style="padding-left: 20px;">My Account</span></li>
                        <li><span style="padding-left: 20px;">Hi <%=a.getUsername()%></span></li><hr>
                        <li><a href="userprofile.jsp">Profile Setting</a></li>
                        <li><a href="<%=request.getContextPath()%>/Logout">Logout</a></li>

                    </ul>
                </li>
                <!--                <li class="dropdown" data-toggle="dropdown">
                                    <ul class="dropdown-menu">
                                        <li>
                                            <div class="dropdown-menu-content">
                                                <div class="row" id="menu-content">
                                                    <div class="col-sm-5">
                                                        <img src="http://placehold.it/120x120" alt="profile pic" class="img-responsive" />
                                                        <p class="text-center small"><button class="btn-link" id="link">Change Photo</button></p>
                                                    </div>
                                                    <div class="col-sm-7">
                                                        <span><%=a.getUsername()%></span>
                                                        <p class="text-muted small"><%=a.getEmail()%></p>
                                                        <div class="divider"></div>
                                                        <button class="btn btn-default" id="viewprofile" onclick="userprofile();">View Profile</button>
                                                    </div>
                
                                                </div>
                                                <div class="navbar-footer">
                                                    <div class="navbar-footer-content" id="footer-content">
                                                        <div class="row">
                                                            <div class="col-sm-6">
                                                                <a href="#" id="link">Change Password</a>
                                                            </div>
                                                            <div class="col-sm-6">
                                                                <a href="#" id="link">Sign out</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                    <a href=""><i class="fa fa-user fa-fw fa-lg"></i><i class="fa fa-caret-down"></i></a>
                
                                </li>-->
            </ul>
        </div>
    </div> 
    <% }%>

    <script>
        function userprofile() {
            location.replace("userprofile.jsp");
        }
    </script>