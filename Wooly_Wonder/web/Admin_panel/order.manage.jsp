<%-- 
    Document   : order.manage
    Created on : 30-Jun-2018, 18:50:42
    Author     : Senani
--%>

<%@page import="Pojos.Product"%>
<%@page import="Pojos.OrderDetails"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Pojos.Orders"%>
<%@page import="Pojos.Orders"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Set"%>
<%@page import="Servlet.Login"%>
<%@page import="org.hibernate.Session"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="Pojos.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.Login"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Manage</title>
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
                <h2 style="margin-left: 60px;">Order Manage</h2>
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
                                <th>Order Id</th>
                                <th>Receiver Name</th>
                                <th>Total</th>
                                <th>Date & Time</th>
                                <th>Status</th>
                            </tr>
                        </thead>
                        <%   Session s = HibernateSession.getSession();
                                Criteria c = HibernateSession.createCriteria(s, Orders.class);
//                                c.add(Restrictions.ne("status", "Completed"));
                               // c.add(Restrictions.not(Restrictions.in("status", new String[]{"Completed","Delivered"})));
                                List<Orders> orders = c.list();
                                for (Orders o : orders) {
                        %>
                        <tbody>
                            <tr style="height: 50px;">
                                <td>
                                    <a href="<%= request.getContextPath()%>/orderInformation.jsp?oid=<%=o.getId()%>"> <h5 style="color: black;"><strong>#<%=o.getId()%></strong></h5></a>
                                </td>
                                <td>
                                    <strong> <%= o.getAddress().getFirstname() + " " + o.getAddress().getLastname()%></strong>
                                        <strong><%=o.getAccount().getEmail()%></strong>
                                </td>
                                <td>
                                    <%=o.getShipping() + o.getTotal()%>
                                </td>
                                <td>
                                    <h6><strong><%= o.getDatetime()%></strong></h6>
                                </td>
                                <td>
                                    <h6 id="st"><strong><%= o.getStatus()%></strong></h6>
                                </td>
                                <td>
                                  <button id="P" class="btn btn-primary"  <%= o.getStatus().equals("Placed") ? "" : "disabled"%> onclick="Processing(<%= o.getId()%>);">Processing</button>
                                </td>
                                <td>
                                    <button class="btn btn-warning" <%= o.getStatus().equals("Processing") ? "" : "disabled"%> onclick="Shipped(<%= o.getId()%>);">Shipped</button>
                                </td>
                                <td>
                                    <button class="btn btn-success" <%= o.getStatus().equals("Shipped") ? "disabled" : ""%> onclick="Completed(<%= o.getId()%>);">Completed</button>
                                </td>
                            </tr>
                        </tbody>
                        <% }
                          %>
                    </table>
                </div>
            </div>

        </div>

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <script>
            function Processing(oid) {

                var r1 = new XMLHttpRequest();
                r1.onreadystatechange = function () {
                    if (r1.readyState === 4 && r1.status === 200) {
                        if (r1.responseText = "1") {
                            location.reload();

                        }
                    }
                };
                r1.open("POST", "../status?P=0&orderid=" + oid, true);
                r1.send();
                alert("send1");
            }

            function Shipped(oid) {

                var r1 = new XMLHttpRequest();
                r1.onreadystatechange = function () {
                    if (r1.readyState === 4 && r1.status === 200) {
                        if (r1.responseText = "2") {
                            location.reload();

                        }
                    }
                };
                r1.open("POST", "../status?S=0&orderid=" + oid, true);
                r1.send();
                alert("send1");
            }
            function Completed(oid) {
                var r1 = new XMLHttpRequest();
                r1.onreadystatechange = function () {
                    if (r1.readyState === 4 && r1.status === 200) {
                        if (r1.responseText = "4") {
                            location.reload();
                        }
                    }
                };
                r1.open("POST", "../status?C=0&orderid=" + oid, true);
                r1.send();

            }
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
