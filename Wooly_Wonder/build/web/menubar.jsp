<%--
    Document   : menubar
    Created on : 20-Jun-2018, 12:18:56
    Author     : Senani
--%>

<%@page import="java.util.List"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Pojos.ProductCategory"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <div class="container" id="menubar">
        <ul  style="margin-left: 470px;" class="nav nav-pills">
            <%
                Session s = HibernateSession.getSession();
                Criteria c = HibernateSession.createCriteria(s, ProductCategory.class);
                List<ProductCategory> productcategory = c.list();
                for (ProductCategory pc : productcategory) {
            %>
            <li class="tab"><a  class="tabname" href="Productsearch.jsp?id=<%= pc.getId()%>"><h3 style="color: red;"><%= pc.getName()%></h3></a></li>
          <%  } %>
        </ul>

    </div>
