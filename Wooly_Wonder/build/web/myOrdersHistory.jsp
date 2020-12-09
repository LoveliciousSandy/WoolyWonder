<%-- 
    Document   : myOrders
    Created on : 28-Jun-2018, 16:04:46
    Author     : Senani
--%>

<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Pojos.Orders"%>
<%@page import="Pojos.Orders"%>
<%@page import="java.util.Set"%>
<%@page import="Cart.DBBag"%>
<%@page import="Cart.SessionBag"%>
<%@page import="Servlet.Login"%>
<%@page import="Pojos.Account"%>
<%@page import="java.util.List"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="org.hibernate.Session"%>
<%@page import="Pojos.ProductImage"%>
<%@page import="Pojos.Product"%>
<%@page import="Pojos.Bag"%>
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

                <h2 style="margin-left: 60px;">My Purchase History</h2>
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
                                <th>Customer</th>
                                <th>Total</th>
                                <th>Date & Time</th>
                                <th>Status</th>
                            </tr>
                        </thead>
                        <%  Session s = HibernateSession.getSession();
                            Account account = Login.getLoggedInAccount(request.getSession());
                            Account s1 = HibernateSession.Load(s, Account.class, account.getId().toString());
                            Set<Orders> or = s1.getOrderses();
                            for (Orders o : or) {

                                Criteria c = s.createCriteria(Orders.class);
                                c.add(Restrictions.eq("id", o.getId()));
                                c.add(Restrictions.eq("status", "Completed"));
                                List<Orders> r1 = c.list();
                                for (Orders e : r1) {
                        %>
                        <tbody>
                            <tr style="height: 50px;">
                                <td>  <a href="orderInformation.jsp?oid=<%=e.getId()%>"><h5><strong># <%=  e.getId()%></strong></h5></a>
                                </td>
                                <td>
                                    <h5><strong> <%=(e.getAddress().getFirstname() + " " + e.getAddress().getLastname())%></strong></h5>
                                    <h5><strong><%= e.getAccount().getEmail()%></strong></h5>
                                </td>
                                <td>
                                    <h5><strong>Rs :<%= (e.getTotal() + e.getShipping())%></strong></h5>
                                </td>
                                <td>
                                    <h5><strong><%= e.getDatetime()%></strong></h5>
                                </td>
                                <td>
                                    <h4><span class="label label-success"><%= e.getStatus()%></span></h4>
                                </td>
                            </tr>
                        </tbody>
                        <% }
                          }%>
                    </table>
                </div>
            </div>

        </div>






















        <script>

            function checklogin() {
                var req = new XMLHttpRequest();
                req.onreadystatechange = function () {
                    if (req.readyState === 4 && req.status === 200) {
                        if (req.responseText == "no") {
                            alert('Please Signin or Signup');
                            window.location.href = "/Wooly_Wonder/Login_Signup/Login.jsp";
                        } else {
                            window.location.href = "cart.checkout.jsp";
                        }
                    }

                };
                req.open("POST", "checkloginbeforecheckout", true);
                req.send();

            }
        </script>
    </body>
</html>
