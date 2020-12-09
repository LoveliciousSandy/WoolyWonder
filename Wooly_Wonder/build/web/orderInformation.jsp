<%-- 
    Document   : orderInformation
    Created on : 03-Jul-2018, 04:48:50
    Author     : Senani
--%>

<%@page import="Pojos.OrderDetails"%>
<%@page import="java.util.Set"%>
<%@page import="Cart.DBBag"%>
<%@page import="Cart.SessionBag"%>
<%@page import="Servlet.Login"%>
<%@page import="Servlet.Login"%>
<%@page import="java.util.List"%>
<%@page import="Pojos.ProductImage"%>
<%@page import="Pojos.ProductImage"%>
<%@page import="Pojos.Product"%>
<%@page import="Pojos.Bag"%>
<%@page import="Pojos.Bag"%>
<%@page import="Pojos.Bag"%>
<%@page import="Pojos.Account"%>
<%@page import="Pojos.Address"%>
<%@page import="Pojos.Orders"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Links/Links.jsp"/>
        <link href="CSS/maincss.css" type="text/css" rel="stylesheet">

    </head>
    <body>
        <!--        <div class="jumbotron"></div>-->
        <h2 style="margin-left: 60px;">My Order Details</h2>
        <%
            Session s = HibernateSession.getSession();
            Orders order = HibernateSession.Load(s, Orders.class, request.getParameter("oid"));
            double d = order.getShipping() + order.getTotal();

        %>
        <br>
        <h3 style="margin-left: 0px; padding-left:50px; "><i class="fa fa-shopping-cart"></i>Order ID:#<%=order.getId()%></h3>
        <h4 style="margin-left: 0px; padding-left:50px; "><%= order.getDatetime()%></h4>
        <a style="margin-left: 0px; padding-left:50px;cursor: pointer" onclick="report(this)"><span class="fa fa-print"></span> Print</a>
        <h3 style="margin-left: 0px; padding-left:50px; ">Order Status:<%= order.getStatus()%></h3>
        <h3 style="margin: 0; padding-left: 900px;" >Order NetTotal Rs:<%=d%></h3>
        <br>
        <br>

        <hr>
        <h3 style="margin-left: 0px; padding-left:50px; ">Customer Information</h3>
        <div class="container-fluid"style="margin-left: 0px; padding-left:50px; ">
            <div class="col-sm-4">
                <h4>Billing Information</h4><br>
                <%
                    Account account = order.getAccount();
                %>
                <p> <%= account.getUsername()%><br>
                    <%= account.getEmail()%><br>  
                    <%=  account.getPhone()%><br>

                </p>
            </div>
            <div class="col-sm-4">
                <h4>Shipping Information</h4><br>
                <%
                    Address address = order.getAddress();
                %>
                <p> <%= address.getFirstname()%>  <%= address.getLastname()%><br>
                    <%= address.getAddress()%>,<br> <%=address.getCity()%> ,<br><%=address.getDistrict()%><br>  
                    <%= address.getPhone()%>
                </p>
            </div>
        </div>

        <h3 style="margin-left: 0px; padding-left:50px; ">Product Information</h3><br>
        <div class="container">
            <div class="row">
                <div class="col-xs-12">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="panel-title">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-xs-4">
                                            <h5><span class="glyphicon glyphicon-shopping-cart"></span> Product Description</h5>
                                        </div>
                                        <div class="col-xs-2">
                                            <h5><span class=""></span>Unit Price</h5>	
                                        </div>
                                        <div class="col-xs-2">
                                            <h5><span class=""></span>Quantity</h5>	
                                        </div>
                                        <div class="col-xs-2">
                                            <h5><span class=""></span>Shipping Cost</h5>	
                                        </div>
                                        <div class="col-xs-2">
                                            <h5><span class=""></span>Total</h5>	
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="panel-body">
                            <%

                                Set<OrderDetails> orderdetails = order.getOrderDetailses();
                                for (OrderDetails od : orderdetails) {
                                    ProductImage oi = (ProductImage) od.getProduct().getProductImages().iterator().next();

                            %>
                            <div class="container">
                                <div class="row">
                                    <div class="col-xs-2">
                                        <img class="img-responsive" id="pi" src=<%= oi.getUrl()%> >
                                    </div>
                                    <div class="col-xs-2">
                                        <h4 class="product-name"><strong><%=od.getProduct().getName()%></strong></h4><h4><small><%=od.getProduct().getCode()%></small></h4>
                                    </div>
                                    <div class="col-xs-2">
                                        <h6><strong><%=od.getProduct().getPrice()%></strong></h6>
                                    </div>
                                    <div class="col-xs-2">
                                        <h6 id="qty"><strong><%=od.getProduct().getQty()%></strong></h6>
                                    </div>
                                    <div class="col-xs-2">
                                        <h6><strong><%= od.getProduct().getShipping()%></strong></h6>
                                    </div>
                                    <div class="col-xs-2">
                                        <%double d3, d2;
                                            d2 = (od.getProduct().getPrice() + od.getProduct().getShipping());
                                            d3 = d2 * od.getProduct().getQty();
                                        %>
                                        <p> <%= d3%><br>
                                        </p>
                                        <h6><strong></strong></h6>
                                    </div>

                                </div>
                            </div>
                            <div class="form-group"><hr /></div>
                                <%  }%>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script>
            function report(x){
                $(x).hide();
                window.print();
                $(x).show();
            }
        </script>          
    </body>
</html>
