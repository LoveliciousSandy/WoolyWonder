<%-- 
    Document   : adminpanel
    Created on : 23-May-2018, 15:01:42
    Author     : Senani
--%>

<%@page import="Servlet.Login"%>
<%@page import="Pojos.Request"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="Pojos.ProductSubcategory"%>
<%@page import="Pojos.Product"%>
<%@page import="Pojos.PaymentReceived"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Pojos.Orders"%>
<%@page import="org.hibernate.Session"%>
<%@page import="hibernate.HibernateSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  Session s = HibernateSession.getSession();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
    </head>
    <style>
        #f{
            background-color: lightgrey;
            height: 90px;
        }
    </style>
    <jsp:directive.include file="adminpanelnavbar.jsp"/>
    <body>
        <br><br>
        <div class= container-fluid" id="f">
            <div class="wel well-lg">
                <h2 style="margin-left: 60px;">Dashboard</h2>
            </div>
        </div><br><br>

        <div class="col-sm-1"></div>
        <div class="col-sm-3">
            <div class="panel panel-danger">
                <div class="panel-heading">
                    <h3 class="panel-title">Total Orders</h3>
                </div>
                <div class="panel-body">
                    <div class="form-group col-md-6">
                        <i class="fa fa-shopping-cart fa-5x" aria-hidden="true"></i>
                        <%
                            Criteria c1 = HibernateSession.createCriteria(s, Orders.class);
                            List<Orders> orders = c1.list();
                        %>
                    </div><div class="form-group col-md-6">
                        <span style="font-size: 50px;"><%=orders.size()%></span>
                    </div                </div>
            </div>
            <div class="panel-footer">
            </div>
        </div>
    </div>
    <div class="col-sm-3">
        <div class="panel panel-danger">
            <div class="panel-heading">
                <h3 class="panel-title">Total Sales</h3>
            </div>
            <div class="panel-body">
                <div class="form-group col-md-6">
                    <i class="fa fa-money fa-5x" aria-hidden="true"></i>
                    <%

                        Criteria c2 = HibernateSession.createCriteria(s, PaymentReceived.class);
                        List<PaymentReceived> paymentreceived = c2.list();
                    %>
                </div><div class="form-group col-md-6">
                    <span style="font-size: 50px;"><%=paymentreceived.size()%></span>
                </div                </div>
        </div>
        <div class="panel-footer">
        </div>
    </div>
</div>

<div class="col-sm-3">
    <div class="panel panel-danger">
        <div class="panel-heading">
            <h3 class="panel-title">Total Products</h3>
        </div>
        <div class="panel-body">
            <div class="form-group col-md-6">
                <i class="fa fa-product-hunt fa-5x" aria-hidden="true"></i>
                <%
                    Criteria c3 = HibernateSession.createCriteria(s, Product.class);
                    List<Product> product = c3.list();
                %>
            </div><div class="form-group col-md-6">
                <span style="font-size: 50px;"><%=product.size()%></span>
            </div                </div>
    </div>
    <div class="panel-footer"></div>
</div>
</div>

<div class="col-sm-2"></div><br>

<div class="col-sm-5" style="margin-left: 30px;">
    <h3>Recent Placed Orders</h3>
    <table class="table table-hover"    id="myTable" >
        <thead>
            <tr>
                <th>Order Id</th>
                <th>Customer</th>
                <th>Date Added</th>
                <th>Status</th>
            </tr>
        </thead>
        <% Criteria c4 = s.createCriteria(Orders.class);
            c4.add(Restrictions.eq("status", "Placed"));
            c4.add(Restrictions.ne("status", "completed"));
            List<Orders> l1 = c4.list();
            for (Orders psc : l1) {
        %>
        <tbody>
            <tr style="height: 50px;">
                <td>
                    <%=psc.getId()%>
                </td>
                <td>
                    <%=psc.getAddress().getFirstname() + " " + psc.getAddress().getLastname()%>
                </td>
                <td>
                    <%=psc.getDatetime()%>
                </td>
                <td>
                    <%=psc.getStatus()%>
                </td>
            </tr>
        </tbody>
        <% }

        %>
    </table>
</div>

<div class="col-sm-6" style="margin-left: 30px;">
    <h3>Product </h3>
    <table class="table table-hover"    id="myTable" >
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
    </table><br><br>
</div>
<div class="col-sm-6" style="margin-left: 30px;">
    <h3>Product </h3>
    <table class="table table-hover"    id="myTable" >
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Product Code</th>
                <th>Product Name</th>
                <th>Product Price</th>
                <th>Product QTY</th>
                <th>Product Status</th>
            </tr>
        </thead>
        <% Criteria c5 = s.createCriteria(Product.class);
//            c4.add(Restrictions.eq("status", "Placed"));
//            c4.add(Restrictions.ne("status", "completed"));
            List<Product> l2 = c5.list();
            for (Product psc : l2) {
                if (psc.getQty() <= 2) {
        %>
        <tbody>
            <tr style="height: 50px;">
                <td>
                    <%=psc.getId()%>
                </td>
                <td>
                    <%=psc.getCode()%>
                </td>
                <td>
                    <%=psc.getName()%>
                </td>
                <td>
                    <%=psc.getPrice()%>
                </td>
                <td>
                    <%=psc.getQty()%>
                </td>
                <td>
                    <%=psc.getStatus()%>
                </td>
            </tr>
        </tbody>
        <% }
            }
        %>
    </table>
</div><br><br>

<div class="col-sm-12">
    <div class="jumbotron" style="background-color: black">
        <center>
            <p style="color: white"> © 2018 All Rights Reserved.
                Version 3.0.1.</p></center>
    </div>
</div>

</body>

</html>
