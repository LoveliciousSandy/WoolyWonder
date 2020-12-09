<%-- 
    Document   : cart.checkout
    Created on : 21-Jun-2018, 16:39:20
    Author     : Senani
--%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Pojos.Address"%>
<%

    Account a = Login.getLoggedInAccount(request.getSession());
    if (a == null) {
        response.sendRedirect(request.getContextPath() + "/Login_Signup/Login.jsp");
        return;
    }

%>
<%@page import="Pojos.ProductImage"%>
<%@page import="Pojos.Product"%>
<%@page import="Cart.DBBag"%>
<%@page import="Cart.SessionBag"%>
<%@page import="Servlet.Login"%>
<%@page import="Pojos.Account"%>
<%@page import="java.util.List"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="Pojos.Bag"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Links/Links.jsp"/>
        <link href="CSS/maincss.css" type="text/css" rel="stylesheet">
        <style>
            #paybutton{
                height:50px; width: 500px; margin-left: 100px; margin-top: 50px; background-color: red; color: white;
            }
            #paybutton:hover{
                background-color: black;
            }
        </style>

    </head>

    <%        Session s = HibernateSession.getSession();
        List<Bag> baglist = null;
        if (a == null) {
            baglist = new SessionBag().getBag(request.getSession());
        } else {
            baglist = new DBBag().getBag(s, a);
        }
    %>
    <body>
        <div class="jumbotron"></div>
        <div class="cart-body">
            <!--            <form style="width: 100%" method="post" action="https://sandbox.payhere.lk/pay/checkout">   
                            <input hidden="true" type="hidden" name="merchant_id" value="1211111">
                            <input hidden="true" type="hidden" name="return_url" value="http://localhost:8080/NishanthaAM/Paymentsucces">
                            <input hidden="true" type="hidden" name="cancel_url" value="http://localhost:8080/NishanthaAM/EX505.jsp">
                            <input hidden="true" type="hidden" name="notify_url" value="http://localhost:8080/NishanthaAM/PaymentData">  
            
                            <input hidden="true" type="text" name="order_id" value="">
                                   <input hidden="true" type="text" name="items" value=""><br>
                            <input hidden="true" type="text" name="currency" value="LKR">
                            <input hidden="true" type="text" id='amount' name="amount" value="">  
            
                            <input hidden="true" type="text" name="first_name" value="">
                            <input hidden="true" type="text" name="last_name" value=" "><br>
                            <input hidden="true" type="text" name="email" value="">
                            <input hidden="true" type="text" name="phone" value=" "><br>
                            <input hidden="true" type="text" name="address" value="">
                            <input hidden="true" type="text" name="city" value="">
                            <input hidden="true" type="hidden" name="country" value="Sri Lanka"><br><br> 
            
                        </form>-->
            <form method="post" id="payForm" action="https://sandbox.payhere.lk/pay/checkout"> 
                <input type="hidden" name="merchant_id" value="1211283">
                <input type="hidden" name="return_url" value="http://localhost:8084/Wooly_Wonder/orderSave?pay=200">
                <input type="hidden" name="cancel_url" value="http://localhost:8084/Wooly_Wonder/orderSave?pay=500">
                <input type="hidden" name="notify_url" value="http://localhost:8084/Wooly_Wonder/orderSave?pay=200">
                <input type="hidden" name="order_id">
                <input type="hidden" name="items" value="Wooly Wonder"><br>
                <input type="hidden" name="currency" value="LKR">

                <div class="col-lg-6" style="padding-left: 80px;">
                    <!--SHIPPING METHOD-->
                    <div class="panel panel">
                        <div class="panel-heading">Delivery Address</div>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-md-12">
                                    <h4>Shipping Address</h4>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-6 col-xs-12"><br>
                                    <strong>First Name:</strong><br><br>
                                    <input required="" type="text" name="first_name" id="first_name" class="form-control" value=""  onkeypress="return isAlfa(event)"/>
                                    <span id="alertfirstname" class="text-danger" ></span>
                                </div>
                                <div class="span1"></div>
                                <div class="col-md-6 col-xs-12"><br>
                                    <strong>Last Name:</strong><br><br>
                                    <input required="" type="text" name="last_name" id="last_name" class="form-control" value="" onkeypress="return isAlfa(event)" />
                                    <span id="alertplastname" class="text-danger" ></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12">
                                    <br>
                                    <strong>Address:</strong><br><br></div>
                                <div class="col-md-12">
                                    <input required="" type="text" name="address" id="address" class="form-control" value="" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><br>
                                    <strong>Email</strong><br><br>
                                </div>
                                <div class="col-md-12">
                                    <input required="" type="email" name="email" id="email" class="form-control" value="" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><br>
                                    <strong>City:</strong><br><br></div>
                                <div class="col-md-12">
                                    <input required="" type="text" name="city" id="city" class="form-control" value="" onkeypress="return isAlfa(event)" />
                                    <span id="alertcity" class="text-danger" ></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12">
                                    <br><strong>District:</strong><br><br></div>
                                <div class="col-md-12">
                                    <input required="" type="text" name="district" id="district" class="form-control" value="" onkeypress="return isAlfa(event)"/>
                                    <span id="alertdistrict" class="text-danger" ></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><br>
                                    <strong>Country</strong><br><br>
                                </div>
                                <div class="col-md-12">
                                    <input required="" type="text" name="country" id="country" class="form-control" value="Sri Lanka" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><br>
                                    <strong>Phone Number:</strong><br><br></div>
                                <div class="col-md-12"><input required="" type="text" name="phone_number" id="phone_number" class="form-control" value="" onkeypress="return isNumber(event)" />
                                    <span id="alertphoneno" class="text-danger" ></span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-5"  style="padding-left: 40px;">
                    <!--REVIEW ORDER-->
                    <div class="panel pane-info">
                        <div class="panel-heading">
                            <h2> Order Summery & Payment</h2><div class="pull-right"><h4><a class="afix-1" href="mybag.jsp">Update My Bag</a></h4></div>
                        </div>
                        <br><br>
                        <%  for (Bag bag : baglist) {
                                Product p = bag.getProduct();

                        %>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-sm-6">
                                    <h5><div class="col-sm-12"><%= p.getName()%></div></h5><br>
                                    <h5><div class="col-sm-12">Quantity:<span><%=bag.getQty()%></span></h5></div>
                            </div>
                            <div class="col-sm-3">
                                <h5><span>Rs:</span><%= bag.getQty() * p.getPrice()%></h5>
                            </div>
                        </div>
                        <div><hr></div>
                            <% }%>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="form-group">
                        <div class="col-sm-6">
                            <strong><h3>Total</h3></strong>
                        </div>
                        <%      double d = 0.0;
                            double sd = 0.0;
                            for (Bag bag : baglist) {
                                Product p = bag.getProduct();
                                for (int i = 0; i < baglist.size(); i++) {
                                }
                                d += bag.getQty() * p.getPrice();
                                sd += p.getShipping();
                            }
                        %>
                        <div class="pull-right">
                            <span><h3>Rs:<%=d%></h3></span>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="form-group">
                        <div class="col-sm-6">
                            <strong><h3>Sub Total Including Delivery</h3></strong>
                        </div>
                        <div class="pull-right"><span><h3>Rs:<%=d + sd%></h3> </span></div>
                    </div>
                </div>
                <input type="hidden" name="amount" id="payAmount" value="<%= d + sd%>">
                <div class="col-sm-6">
                    <button id="paybutton" class="btn btn-default" type="button" onclick="preordersave()">Pay</button>
                </div>
            </form>
        </div>


        <!--    <br><br>Item Details<br>
            <input type="text" name="order_id" value="ItemNo12345">
            <input type="text" name="items" value="Door bell wireless"><br>
            <input type="text" name="currency" value="LKR">
            <input type="text" name="amount" value="1000">  
            <br><br>Customer Details<br>
            <input type="text" name="first_name" value="Saman">
            <input type="text" name="last_name" value="Perera"><br>
            <input type="text" name="email" value="samanp@gmail.com">
            <input type="text" name="phone" value="0771234567"><br>
            <input type="text" name="address" value="No.1, Galle Road">
            <input type="text" name="city" value="Colombo">
            <input type="hidden" name="country" value="Sri Lanka"><br><br> -->
        <!--    <input type="submit" value="Buy Now">   -->

        <script>
            function isAlfa(evt) {
                evt = (evt) ? evt : window.event;
                var charCode = (evt.which) ? evt.which : evt.keyCode;
                if (charCode > 31 && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122)) {
                    document.getElementById('alertfirstname').innerHTML = "**Please enter character**";
                    document.getElementById('alertplastname').innerHTML = "**Please enter character**";
                    document.getElementById('alertcity').innerHTML = "**Please enter character**";
                    document.getElementById('alertdistrict').innerHTML = "**Please enter character**";
                    document.getElementById('alertphoneno').innerHTML = "**Please enter character**";
                    return false;
                }
                document.getElementById('alertfirstname').innerHTML = "";
                document.getElementById('alertplastname').innerHTML = "";
                document.getElementById('alertcity').innerHTML = "";
                document.getElementById('alertdistrict').innerHTML = "";
                document.getElementById('alertphoneno').innerHTML = "";
                return true;
            }

            function isNumber(evt) {
                evt = (evt) ? evt : window.event;
                var charCode = (evt.which) ? evt.which : evt.keyCode;
                if (charCode > 31 && (charCode < 48 || charCode > 57)) {
                    document.getElementById('alertphoneno').innerHTML = "**Please enter Number**";
                    return false;
                }
                document.getElementById('alertphoneno').innerHTML = "";
                return true;
            }

            function preordersave() {

                if (!$(first_name).val()
                        || !$(last_name).val()
                        || !$(address).val()
                        || !$(email).val()
                        || !$(city).val()
                        || !$(district).val()
                        || !$(country).val()
                        || !$(phone_number).val()) {
                    alert("All fields are mandatory.");
                    return;
                }

                var req = new XMLHttpRequest();
                req.onreadystatechange = function () {
                    if (req.readyState == 4 && req.status == 200) {
                        if (req.responseText == "OK") {
                            $(payForm).submit();
                        } else {
                            alert("Error. Try again.");
                        }
                    }
                };
                req.open("POST", "orderSave", true);
                req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                var paras = "pay=pre"
                        + "&first_name=" + $(first_name).val()
                        + "&last_name=" + $(last_name).val()
                        + "&address=" + $(address).val()
                        + "&email=" + $(email).val()
                        + "&city=" + $(city).val()
                        + "&district=" + $(district).val()
                        + "&country=" + $(country).val()
                        + "&phone_number=" + $(phone_number).val()
                        + "&total=<%= d%>"
                        + "&subtotal=<%= d + sd%>";
                console.log(paras);
                req.send(paras);
            }
        </script>
    </body>
</html>
