<%-- 
    Document   : customorder
    Created on : Nov 28, 2018, 8:51:54 PM
    Author     : Senani
--%>

<%@page import="org.hibernate.criterion.Order"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="java.util.Set"%>
<%@page import="Pojos.Request"%>
<%@page import="Pojos.ProductSize"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="org.hibernate.Session"%>
<%@page import="Pojos.ProductRequest"%>
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

                <h2 style="margin-left: 60px;">My Custom Orders</h2>
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
                                <th>Product Name</th>
                                <th>Request Colour</th>
                                <th>Request Size</th>
                                <th>Total</th>
                                <th>Date & Time</th>
                                <th>Status</th>
                            </tr>
                        </thead>
                        <%  Session s = HibernateSession.getSession();
                            Account account = Login.getLoggedInAccount(request.getSession());
                            Account s1 = HibernateSession.Load(s, Account.class, account.getId().toString());
                           Set <Request> customorder =s1.getRequests();
                           for (Request rco  : customorder) {
                                   Criteria c = s.createCriteria(Request.class);
                                     c.add(Restrictions.eq("id", rco.getId()));
                                     List <Request> r1= c.list();
                                     for (Request r : r1) {
                               
                        %>
                        <tbody>
                            <tr style="height: 50px;">
                                <td>  <a href="orderInformation.jsp?oid=<%=r.getId() %>"><h5><strong>#<%= r.getId()%></strong></h5></a>
                                </td>
                                <td>
                                    <h5><strong> <%=r.getProduct().getCode()%></strong></h5>
                                    <h5><strong><%= r.getProduct().getName()%></strong></h5>
                                </td>
                                <td>
                                    <h5><strong><%=r.getColour() %></strong></h5>
                                </td>
                                <td>
                                    <h5><strong><%=r.getSize() %></strong></h5>
                                </td>
                                <td>
                                    <h5><strong><%=r.getPrice() %></strong></h5>
                                </td>
                                <td>
                                    <h5><strong><%= r.getDateTime() %></strong></h5>
                                </td>
                                <td>
                                    <h4><span class="label label-success"><%= r.getStatus()%></span></h4>
                                </td>
                            </tr>
                        </tbody>
                        <% }
                          }%>
                    </table>
                </div>
            </div>

        </div>



    </body>
</html>
