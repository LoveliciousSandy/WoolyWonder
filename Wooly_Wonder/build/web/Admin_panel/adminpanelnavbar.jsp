<%-- 
    Document   : adminpanelnavbar
    Created on : Nov 18, 2018, 9:01:21 PM
    Author     : Senani
--%>
<%@page import="Pojos.Account"%>
<%@page import="Servlet.Login"%>
<%
    Account loggedInAcc = Login.getLoggedInAccount(session);
    if (loggedInAcc == null || loggedInAcc.getId() >= 0) {
        response.sendRedirect(request.getContextPath() + "/Login_Signup/Login.jsp");
        return;
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../Links/Links.jsp"></jsp:include>
            <link href="../CSS/maincss.css" type="text/css" rel="stylesheet">
            <link href="../CSS/adminpanelnavbar.css" type="text/css" rel="stylesheet">
        </head>
        <style>
            #dropmenuparastyle{
                font-size:11px;
            }
            #ddb{
                color: white;
            }
            .navbar{
                /*                    background-color: #e91f1e;
                                    opacity: 0.8;*/
            }
        </style>
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid row">
                <ul class="nav navbar-nav navbar-left" style="padding: 0px 40px 0px 50px;">
                    <li><a href="adminpanel.jsp"><i class="fa fa-home fa-fw fa-2x"></i></a></li>
                    <li> 
                        <div class="dropdown">
                            <button class=" btn btn-default dropdown-toggle" id="ddb" data-toggle="dropdown">Catalog<i class="fa fa-caret-down"></i></button>

                            <ul class="dropdown-menu" role="menu">
                                <li><a href="category.manage.jsp">Categories<br><p id="dropmenuparastyle">View Product Categories which<br> are used to group<br> products in your store</p></a></li>
                                <li><a href="products.manage.jsp">Products<p id="dropmenuparastyle">View, Add & Edit Products<br> that are shown to<br> visitors of your store</p></a></li>
                                <!--                                    <li><a href="#">Shipments</a></li>-->
                            </ul>
                        </div>
                    </li>
                    <li> 
                        <div class="dropdown">
                            <button class=" btn btn-default dropdown-toggle" id="ddb" data-toggle="dropdown">Sales<i class="fa fa-caret-down"></i></button>

                            <ul class="dropdown-menu" role="menu">

                                <li><a href=" order.manage.jsp">Orders<br><p id="dropmenuparastyle">View Products and print<br> invoice slips for orders<br> <br> </p></a></li>
                                <li><a href="custom.order.manage.jsp">Custom Orders<p id="dropmenuparastyle">View Custom orders</p></a></li>
                            </ul>
                        </div>
                    </li>
                    <!--                        <li> 
                                                <div class="dropdown">
                                                    <button class=" btn btn-default dropdown-toggle" id="ddb" data-toggle="dropdown">Customers<i class="fa fa-caret-down"></i></button>
                    
                                                    <ul class="dropdown-menu" role="menu">
                                                        <li><a href="#">Administrators</a></li>
                                                        <li><a href="#">Customers</a></li>
                                                    </ul>
                    
                                                </div>
                    
                                            </li>-->
                    <li  class="dropdown" style="margin-left: 900px;">
                        <a href=""><i class="fa fa-user fa-fw fa-lg"></i><i class="fa fa-caret-down"></i></a>
                        <ul class="dropdown-menu" role="menu">

                            <li><span style="padding-left: 20px;">My Account</span></li>
                            <li><a href="#">Profile Setting</a></li>
                            <li><a href="<%=request.getContextPath()%>/Admin_panel/admin.jsp">Logout</a></li>

                    </ul>
                </li>
            </ul>
        </div>
        <!--                bottom nav-->

        <!--                <div class="divider" style=""  >
        
                        </div>
                        <div class="container-fluid row">
                            <ul class="nav navbar-nav navbar-left"  id="downnavba">
                                <li>
                                    <button class=" btn btn-default btn-sm" data-toggle="tooltip" data-placement="bottom" title="back">
                                        <i class="fa fa-arrow-left fa-fw " ></i>
                                    </button>
        
                                    <label id="apname">Add Catalog</label>
                                </li>
                            </ul>
                        </div>
                    </div>-->
    </div>
</body>
</html>
