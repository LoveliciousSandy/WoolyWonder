<%-- 
    Document   : custom.order.manage
    Created on : Nov 30, 2018, 5:47:06 AM
    Author     : Senani
--%>

<%@page import="java.util.List"%>
<%@page import="Pojos.Request"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.Login"%>
<%
    Session s = HibernateSession.getSession();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../Links/Links.jsp"/>
        <link href="CSS/maincss.css" type="text/css" rel="stylesheet">
        <style>
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
                <h2 style="margin-left: 60px;"> Custom Order Manage</h2>
            </div>
        </div>
        <br><br>
        <br>
        <div class="container">
            <div class="row">

                <div class="col-sm-9" style="margin-left: 80px;">
                    <table class="table table-hover" id="tableproduct">

                        <thead>
                            <tr>
                                <th>Request ID</th>
                                <th>Product Name</th>
                                <th>Product Price</th>
                                <th>Date</th>
                            </tr>
                        </thead>
                        <% Criteria c6 = s.createCriteria(Request.class);
                            //            c4.add(Restrictions.eq("status", "Placed"));
                            //            c4.add(Restrictions.ne("status", "completed"));
                            List<Request> l3 = c6.list();
                            for (Request psc : l3) {

                        %>
                        <tbody>
                            <tr style="height: 50px;">
                                <td>
                                    <%=psc.getId()%>
                                </td>

                                <td>
                                    <%=psc.getProduct().getName()%>
                                </td>
                                <td>
                                    <%=psc.getPrice()%>
                                </td>
                                <td>
                                    <%=psc.getDateTime()%>
                                </td>
                            </tr>
                        </tbody>
                        <% }

                        %>
                    </table>
                </div>
            </div>
        </div>
        <br><br><br><br><br><br>

        <div class="col-sm-12">
            <div class="jumbotron" style="background-color: black">
                <center>
                    <p style="color: white"> © 2018 All Rights Reserved.
                        Version 3.0.1.</p></center>
            </div>
        </div>


    </body>
</html>
