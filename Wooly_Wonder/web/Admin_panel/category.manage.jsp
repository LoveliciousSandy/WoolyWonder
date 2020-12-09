<%-- 
    Document   : category.manage
    Created on : 01-Jun-2018, 00:39:07
    Author     : Senani
--%>

<%@page import="org.hibernate.criterion.Criterion"%>
<%@page import="java.util.Collection"%>
<%@page import="Pojos.ProductColour"%>
<%@page import="Pojos.ProductSize"%>
<%@page import="java.util.Iterator"%>
<%@page import="Pojos.ProductSubcategory"%>
<%@page import="Pojos.ProductCategory"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Pojos.Orders"%>
<%@page import="java.util.Set"%>
<%@page import="Servlet.Login"%>
<%@page import="Pojos.Account"%>
<%@page import="Pojos.Account"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.Login"%>
<%
    Session s = HibernateSession.getSession();
    String tab = request.getParameter("tab");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../Links/Links.jsp"></jsp:include>
            <link href="../CSS/maincss.css" type="text/css" rel="stylesheet">
            <link href="../CSS/adminpanelnavbar.css" type="text/css" rel="stylesheet">

            <style>
                #addcategory{
                    float: right; margin-right: 10px;
                }

                #button {
                    background-color: 36FF78;
                    border: none;
                    color: white;
                    padding: 20px;
                    text-align: center;
                    text-decoration: none;
                    display: inline-block;
                    font-size: 16px;
                    margin: 4px 2px;
                   
                    border-radius: 8px;
                }
                #f{
                background-color: lightgrey;
                height: 90px;
            }
            </style>

        </head>
        <body>
         <jsp:directive.include file="adminpanelnavbar.jsp"/>
        <br><br>
        <div class= container-fluid" id="f">
            <div class="wel well-lg">
                <h2 style="margin-left: 60px;">Category Manage</h2>
            </div>
        </div><br>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-9"  style="margin-left: 80px;">
                    <ul class="nav nav-tabs">
                        <li class="active"><a  data-toggle="tab" href="#Categories"><h4>Categories</h4></a></li>
                        <li><a  data-toggle="tab" href="#Sizers"><h4>Sizers</h4> </a></li>
                        <li><a data-toggle="tab" href="#Colours"><h4>Colour</h4></a></li>
                    </ul>
                    <div class="tab-content">
                        <div id="Categories" class="tab-pane fade in active" style="background-color: white">
                            <br>
                            <div class="container">
                                <!--                                    <button onclick="hiddenCategory();" id="addcategory" class="btn btn-danger " data-toggle="tooltip" title="Delete Selected"><i class="fa fa-trash fa-lg"></i></button>-->
                                <button onclick="window.location.reload();"  id="addcategory" class="btn btn-info" data-toggle="tooltip" title="Refresh"><i class="fa fa-retweet fa-fw"></i></button>
                                <button onclick="window.location = 'category.add.jsp'" id="addcategory" class="btn btn-success" data-toggle="tooltip" title="Add New Category"><i class="fa fa-plus fa-lg fa-fw"></i></button>

                            </div>
                            <br>
                            <table class="table table-hover"    id="myTable" >
                                <thead>
                                    <tr>
                                        <th>Category Name</th>
                                        <th>Sub category Name</th>
                                        <th>Status</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <% Criteria c1 = s.createCriteria(ProductSubcategory.class);
//                                    c1.add(Restrictions.ne("status", "disable"));
                                    List<ProductSubcategory> l1 = c1.list();
                                    for (ProductSubcategory psc : l1) {
                                %>
                                <tbody>
                                    <tr style="height: 50px;">
                                        <td>
<!--                                            <input onchange="selectedcatid(this.value);" type="checkbox" name="checkbox" class="i" value="<%=psc.getId()%>" style="height: 17px; width: 17px;"/>-->
                                            <%=psc.getProductCategory().getName()%>
                                        </td>
                                        <td>
                                            <%=psc.getSubcategory()%>
                                        </td>
                                        <td>
                                            <%=psc.getStatus()%>
                                        </td>
                                        <td>
                                            <a href="../catmangedeleterow?action=active&v3=<%= psc.getId()%>">
                                                <button class="btn btn-warning" data-toggle="tooltip" title="Active"><i class="fa fa-unlock fa-1x fa-fw"></i></button>
                                            </a>
                                            <a href="../catmangedeleterow?action=disable&v2=<%= psc.getId()%>">
                                                <button class="btn btn-danger" data-toggle="tooltip" title="Disable"><i class="fa fa-lock fa-1x fa-fw"></i></button>
                                            </a>
                                        </td>
                                    </tr>
                                </tbody>
                                <% }

                                %>
                            </table>
                        </div>
                        <div id="Sizers" class="tab-pane fade" style="background-color: white">
                            <br>
                            <div class="container">
                                <!--                                <button id="addcategory" class="btn btn-danger " data-toggle="tooltip" title="Delete Selected"><i class="fa fa-trash fa-lg"></i></button>-->
                                <button onclick="window.location.reload()"  id="addcategory" class="btn btn-info" data-toggle="tooltip" title="Refresh"><i class="fa fa-retweet fa-fw"></i></button>
                                <button onclick="window.location = 'category.add.jsp'" id="addcategory" class="btn btn-success" data-toggle="tooltip" title="Add New Category"><i class="fa fa-plus fa-lg fa-fw"></i></button>
                            </div>
                            <br>
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>Size Name</th>
                                        <th>Status</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <%  Criteria c2 = s.createCriteria(ProductSize.class);
                                    c2.add(Restrictions.ne("status", "Hidden"));
                                    List<ProductSize> l2 = c2.list();
                                    for (ProductSize ps : l2) {
                                %>
                                <tbody>
                                    <tr style="height: 50px;">
                                        <td>
                                            <!--                                            <input type="checkbox" style="height: 17px; width: 17px;">&nbsp;&nbsp;-->
                                            <%=ps.getName()%>
                                        </td>
                                        <td>
                                            <%=ps.getStatus()%>
                                        </td>

                                        <td> 
                                            <a href="../sizemanage?action=active&v4=<%= ps.getId()%>">
                                                <button class="btn btn-warning" data-toggle="tooltip" title="Active"><i class="fa fa-unlock fa-1x fa-fw"></i></button>
                                            </a>
                                            <a href="../sizemanage?action=disable&v5=<%= ps.getId()%>">
                                                <button class="btn btn-danger" data-toggle="tooltip" title="Disable"><i class="fa fa-lock fa-1x fa-fw"></i></button>
                                            </a>
                                        </td>
                                    </tr>
                                </tbody>
                                <% }
                                %>
                            </table>
                        </div>
                        <div id="Colours" class="tab-pane fade" style="background-color: white">
                            <br>
                            <div class="container">
                                <!--                                <button id="addcategory" class="btn btn-danger " data-toggle="tooltip" title="Delete Selected"><i class="fa fa-trash fa-lg"></i></button>-->
                                <button onclick="window.location.reload()"  id="addcategory" class="btn btn-info" data-toggle="tooltip" title="Refresh"><i class="fa fa-retweet fa-fw"></i></button>
                                <button onclick="window.location = 'category.add.jsp'" id="addcategory" class="btn btn-success" data-toggle="tooltip" title="Add New Category"><i class="fa fa-plus fa-lg fa-fw"></i></button>
                            </div>
                            <br>
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>Colour Code</th>
                                        <th>Colour Name</th>
                                        <th>Status</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <%
                                    Criteria c3 = s.createCriteria(ProductColour.class);
                                    List<ProductColour> l3 = c3.list();
                                    for (ProductColour pc : l3) {
                                %>
                                <tbody>
                                    <tr style="height: 50px;">
                                        <td>
                                            <img class=""style="width:120px" src=<%= pc.getImage()%> alt=<%= pc.getName() %>">
                                        </td>
                                        <td>
                                            <%= pc.getName()%>
                                        </td>
                                        <td>
                                            <%=pc.getStatus()%>
                                        </td>
                                        <td>
                                            <a href="../colourmanage?action=active&v6=<%= pc.getId()%>">
                                                <button id="activecolour" class="btn btn-warning" data-toggle="tooltip" title="Active"><i class="fa fa-unlock fa-1x fa-fw"></i></button>
                                            </a>
                                            <a href="../colourmanage?action=disable&v7=<%= pc.getId()%>">
                                                <button id="disablecolour" class="btn btn-danger" data-toggle="tooltip" title="Disable"><i class="fa fa-lock fa-1x fa-fw"></i></button>
                                            </a>
                                        </td>
                                    </tr>
                                </tbody>
                                <% }
                                %>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script>
            /*
             function disableColour(cc) {
             var e = document.innerHTML = cc;
             var r1 = new XMLHttpRequest();
             r1.onreadystatechange = function () {
             if (r1.readyState == 4 && r1.status == 200) {
             if (r1.responseText = "1") {
             location.reload();
             }
             }
             };
             r1.open("GET", "../colourmanage?action=disable&v7=" + e, true);
             r1.send();
             }
             
             function activeColour(cc) {
             var d = document.innerHTML = cc;
             var r1 = new XMLHttpRequest();
             r1.onreadystatechange = function () {
             if (r1.readyState == 4 && r1.status == 200) {
             if (r1.responseText = "1") {
             location.reload();
             }
             }
             };
             r1.open("GET", "../colourmanage?action=active&v6=" + d, true);
             r1.send();
             }
             
             function disableSize(ss) {
             var c = document.innerHTML = ss;
             var r1 = new XMLHttpRequest();
             r1.onreadystatechange = function () {
             if (r1.readyState == 4 && r1.status == 200) {
             if (r1.responseText = "1") {
             location.reload();
             }
             }
             };
             r1.open("GET", "../sizemanage?action=disable&v5=" + c, true);
             r1.send();
             
             }
             function activeSize(ss) {
             var b = document.innerHTML = ss;
             var r1 = new XMLHttpRequest();
             r1.onreadystatechange = function () {
             if (r1.readyState == 4 && r1.status == 200) {
             if (r1.responseText = "1") {
             location.reload();
             }
             }
             };
             r1.open("GET", "../sizemanage?action=active&v4=" + b, true);
             r1.send();
             
             }
             
             function activeCategory(ca) {
             var a = document.innerHTML = ca;
             var r1 = new XMLHttpRequest();
             r1.onreadystatechange = function () {
             if (r1.readyState == 4 && r1.status == 200) {
             if (r1.responseText = "1") {
             //                            location.reload();
             }
             }
             };
             r1.open("GET", "../catmangedeleterow?action=active&v3=" + a, true);
             r1.send();
             
             }
             
             
             
             function disableCategory(ca) {
             var r = document.innerHTML = ca;
             var r1 = new XMLHttpRequest();
             r1.onreadystatechange = function () {
             if (r1.readyState == 4 && r1.status == 200) {
             if (r1.responseText = "1") {
             // location.reload();
             }
             }
             };
             r1.open("GET", "../catmangedeleterow?action=disable&v2=" + r, true);
             r1.send();
             
             }
             */

            function changeTab(tab) {
                $('.nav-tabs a[href="#' + tab + '"]').tab('show');
            }

            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
            <%= tab == null ? "" : "changeTab('" + tab + "');"%>
            });
        </script> 
    </body>
    <br><br>
    
    <div class="col-sm-12">
        <div class="jumbotron" style="background-color: black">
            <center>
            <p style="color: white"> © 2018 All Rights Reserved.
                Version 3.0.1.</p></center>
        </div>
    </div>
</html>
