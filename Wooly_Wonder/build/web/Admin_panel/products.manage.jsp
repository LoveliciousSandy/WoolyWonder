<%-- 
    Document   : products.manage
    Created on : 23-May-2018, 21:33:11
    Author     : Senani
--%>

<%@page import="java.util.List"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Session"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="Pojos.Product"%>
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
        <link href="../CSS/maincss.css" type="text/css" rel="stylesheet">
        <link href="../CSS/adminpanelnavbar.css" type="text/css" rel="stylesheet">
        <style>
            #productcheck{
                width: 18px;
                height: 18px;
                margin-right: 15px;
            }
            #controls{
             float: right; margin-right: 10px;  
            }
            #f{
                background-color: lightgrey;
                height: 90px;
            }
        </style>

    </head>
    <body>
         <jsp:directive.include file="adminpanelnavbar.jsp"/>
        <br><br><br><br>
        <div class= container-fluid" id="f">
            <div class="wel well-lg">
                <h2 style="margin-left: 60px;">Product Manage</h2>
            </div>
        </div><br>
        <div class="container">
            <button  id="controls" onclick="window.location = 'products.add.jsp'" id="addcategory" class="btn btn-success" data-toggle="tooltip" title="Add New Product"><i class="fa fa-plus fa-lg fa-fw"></i></button>
            <button  id="controls" onclick="window.location.reload()"  id="addcategory" class="btn btn-info" data-toggle="tooltip" title="Refresh"><i class="fa fa-retweet fa-fw"></i></button>
        </div>
        <div class="container">
            <div class="row">
        
                <div class="col-sm-9" style="margin-left: 80px;">
                    <table class="table table-hover" id="tableproduct">
                        <thead>
                            <tr>
                                <th>Product</th>
                                <th>Category </th>
                                <th>Sub category </th>
                                <th>Price</th>
                                <th>Qty</th>
                                <th>Status</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <%  Criteria c1 = s.createCriteria(Product.class);
                            List<Product> l1 = c1.list();
                            for (Product p : l1) {
                        %>
                        <tbody>
                            <tr style="height: 50px;">
                                <td>
<!--                                    <input type="checkbox"  id="productcheck">-->
                                    <%= p.getName()%>
                                </td>
                                <td>
                                    <%=p.getProductCategory().getName()%>
                                </td>
                                <td>
                                    <%= p.getProductSubcategory().getSubcategory()%>
                                </td>
                                <td>
                                    <%=p.getPrice()%>
                                </td>
                                <td>
                                    <%=p.getQty()%>
                                </td>
                                <td>
                                    <%=p.getStatus()%>
                                </td>
                                <td>   
                                    <a href="../productmanage?action=active&v1=<%=p.getId()%>">
                                        <button id="activecolour" class="btn btn-success" data-toggle="tooltip" title="Active"><i class="fa fa-unlock fa-1x fa-fw"></i></button>
                                    </a>
                                    <a href="../productmanage?action=disable&v2=<%=p.getId()%>">
                                        <button id="disablecolour" class="btn btn-danger" data-toggle="tooltip" title="Disable"><i class="fa fa-lock fa-1x fa-fw"></i></button>
                                    </a>
                                        <a href="../Admin_panel/products.update.jsp?update=<%=p.getId()%>">
                                        <button id="editcolour" class="btn btn-warning" data-toggle="tooltip" title="Edit"><i class="fa fa-pencil fa-1x fa-fw"></i></button>
                                    </a>
                                </td>
                            </tr>
                        </tbody>
                        <% }%>
                    </table>
                </div>
            </div>
            
        </div>
        <script type="text/javascript">
            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
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
</body>
</html>


