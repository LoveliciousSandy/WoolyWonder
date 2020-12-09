<%-- 
    Document   : mybag
    Created on : 13-Jun-2018, 10:11:57
    Author     : Senani
--%>

<%@page import="Pojos.ProductImage"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="org.hibernate.Session"%>
<%@page import="Cart.DBBag"%>
<%@page import="Pojos.Product"%>
<%@page import="java.util.List"%>
<%@page import="Pojos.Bag"%>
<%@page import="Cart.SessionBag"%>
<%@page import="Pojos.Account"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="Servlet.Login"%>
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
        <title>My Bag</title>
        <jsp:include page="Links/Links.jsp"/>
        <link href="CSS/maincss.css" type="text/css" rel="stylesheet">
        <style>
            #pi{
                width: 120px;
                height: 120px;
            }
            #f{
                background-color: lightgrey;
                height: 90px;
            }
            #checkout{
                /*                width: 40px;*/
                height: 50px;
                background-color: red;
                color: white;
                font-size: 27px;
                margin-right: 115px;


            }
            #checkout:hover{
                background-color: black;
                color:red;
                font-size: 27px;
            }
        </style>
    </head>
    <body>
        <br><br> 
        <div class= container-fluid" id="f">
            <div class="wel well-lg">

                <h2 style="margin-left: 80px;">My Bag</h2>
            </div>
        </div>
        <br><br>
        <%
            Session s = HibernateSession.getSession();
            List<Bag> baglist = null;

            Account a = Login.getLoggedInAccount(request.getSession());
            if (a == null) {
                baglist = new SessionBag().getBag(request.getSession());
            } else {
                baglist = new DBBag().getBag(s, a);
            }

        %>



        <div class="container " >
            <a href="index.jsp" style="margin-left: 950px; margin-bottom: 30px; margin-top: 10px; color: black; font-size: 20px;"></a>
        </div>
        <br>

        <div class="container" style="margin-left: 120px;">
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
                                            <h5><span class=""></span>Total</h5>	
                                        </div>
                                        <div class="col-xs-2">
                                            <h5><span class=""></span>Shipping Cost</h5>	
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="panel-body">
                            <%  for (Bag bag : baglist) {
                                    Product p = bag.getProduct();
                                    ProductImage pi = (ProductImage) p.getProductImages().iterator().next();
                            %>
                            <div class="container">
                                <div class="row">
                                    <div class="col-xs-2">
                                        <img class="img-responsive" id="pi" src=<%= pi.getUrl()%> >
                                    </div>
                                    <div class="col-xs-2">
                                        <h4 class="product-name"><strong><%= p.getName()%></strong></h4><h4><small><%= p.getCode()%></small></h4>
                                    </div>
                                    <div class="col-xs-2">
                                        <h6><strong><%= p.getPrice()%></strong></h6>
                                    </div>
                                    <div class="col-xs-2">
                                        <h6 id="qty"><strong><%= bag.getQty()%></strong></h6>
                                    </div>
                                    <div class="col-xs-2">
                                        <h6><strong><%= bag.getQty() * p.getPrice()%></strong></h6>
                                    </div>
                                    <div class="col-xs-1">
                                        <h6><strong><%= p.getShipping()%></strong></h6>
                                    </div>

                                    <button type="button" class="btn btn-link btn-xs" onclick="removefrombag(<%= p.getId()%>)">
                                        <span class="glyphicon glyphicon-trash" style="padding-left: 10px;"></span>
                                    </button>
                                </div>
                            </div>
                            <div class="form-group"><hr /></div>
                                <% }%>
                            <div class="form-group">
                                <div class="col-sm-12">
                                    <h4> <strong class="pull-right">Sub Total</strong></h4><br>
                                    <h3>  
                                        <div class="pull-right">
                                            <span>Rs:</span>

                                            <%
                                                double d = 0.0;
                                                double sd = 0.0;

                                                for (Bag bag : baglist) {
                                                    Product p = bag.getProduct();
                                                    d += (bag.getQty() * p.getPrice());
                                                    sd += p.getShipping();
                                                }
                                            %>
                                            <span><%=d%></span>
                                        </div> </h3>

                                </div>

                            </div>
                            <div><hr /></div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <h4> <strong class="pull-right">Net Total</strong></h4><br>
                                    <h2> <div class="pull-right"><span>Rs:</span><span><%=d + sd%></span></div></h2>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <a href="<%= request.getContextPath() + "/cart.checkout.jsp"%>"><button class="btn btn-default pull-right" id="checkout">Checkout</button></a><br>


        <script>
            function removefrombag(id) {
                if (confirm("This will remove item " + id + " permanently from your bag.")) {
                    var request = new XMLHttpRequest();
                    request.onreadystatechange = function () {
                        if (request.readyState === 4 && request.status === 200) {
                            if (request.responseText = "OK") {
                                alert("remove it");
                                location.reload();
                            }
                        }
                    };
                    request.open("GET", "myBag?remove=0&pid=" + id, true);
                    request.send();
                }
            }

        </script>
    </body>
    
        <jsp:directive.include file="Footer.jsp"/>
   
</html>
