<%-- 
    Document   : selectproductview
    Created on : 06-Jun-2018, 23:22:45
    Author     : Senani
--%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Pojos.ProductRequest"%>
<%@page import="Pojos.ProductColour"%>
<%@page import="Servlet.Login"%>
<%@page import="Pojos.Account"%>
<%@page import="Pojos.ProductImage"%>
<%@page import="Pojos.ProductSize"%>
<%@page import="com.oracle.jrockit.jfr.Producer"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Set"%>
<%@page import="Pojos.Product"%>
<%@page import="org.hibernate.Session"%>
<%@page import="hibernate.HibernateSession"%>
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
        <link href="xzoom/xzoom.css" type="text/css" rel="stylesheet">
        <script src="xzoom/xzoom.min.js"></script>




        <style>

            /*****************globals*************/
            .line{
                width: 500px;
                height: 20px;
                border-bottom:1px solid black;
                position: absolute;
            }

            img {
                max-width: 100%; }

            .preview {
                display: -webkit-box;
                display: -webkit-flex;
                display: -ms-flexbox;
                display: flex;
                -webkit-box-orient: vertical;
                -webkit-box-direction: normal;
                -webkit-flex-direction: column;
                -ms-flex-direction: column;
                flex-direction: column; }
            @media screen and (max-width: 996px) {
                .preview {
                    margin-bottom: 20px; } }

            .preview-pic {
                -webkit-box-flex: 1;
                -webkit-flex-grow: 1;
                -ms-flex-positive: 1;
                flex-grow: 1; }

            .preview-thumbnail.nav-tabs{
                border: none;
                margin-top: 15px; }
            .preview-thumbnail.nav-tabs  li {
                width: 18%;
                margin-right: 2.5%; }
            .preview-thumbnail.nav-tabs.nav-stacked li img {
                max-width: 60px;
                display: block; }
            .preview-thumbnail.nav-tabs li a {
                padding: 0;
                margin: 0; }
            .preview-thumbnail.nav-tabs li:last-of-type {
                margin-right: 0; }

            .tab-content {
                overflow: hidden; }
            .preview-pic tab-content img {
                width: 100%;
                -webkit-animation-name: opacity;
                animation-name: opacity;
                -webkit-animation-duration: .3s;
                animation-duration: .3s; }



            @media screen and (min-width: 997px) {
                .wrapper {
                    display: -webkit-box;
                    display: -webkit-flex;
                    display: -ms-flexbox;
                    display: flex; } }


            .colors {
                -webkit-box-flex: 1;
                -webkit-flex-grow: 1;
                -ms-flex-positive: 1;
                flex-grow: 1; }

            .product-title, .price, .sizes, .colors {
                text-transform: UPPERCASE;
                font-weight: bold; }

            .checked, .price span {
                color: red;
            }

            .product-title, .price, .colour, .sizes {
                margin-bottom: 15px; }

            .product-title{
                margin-top: 0; 
                font-size: 50px;

            }
            .price {
                font-size: 30px;
            }
            .size {
                margin-right: 10px; }
            .size:first-of-type {
                margin-left: 40px; }

            .color {
                display: inline-block;
                vertical-align: middle;
                margin-right: 10px;
                height: 2em;
                width: 2em;
                border-radius: 2px; }
            .color:first-of-type {
                margin-left: 20px; }

            .add-to-cart, .like {
                background: #ff9f1a;
                padding: 1.2em 1.5em;
                border: none;
                text-transform: UPPERCASE;
                font-weight: bold;
                color: #fff;
                -webkit-transition: background .3s ease;
                transition: background .3s ease; }
            .add-to-cart:hover, .like:hover {
                background: #b36800;
                color: #fff; }

            .not-available {
                text-align: center;
                line-height: 2em; }
            .not-available:before {
                font-family: fontawesome;
                content: "\f00d";
                color: #fff; }

            .orange {
                background: #ff9f1a; }

            .green {
                background: #85ad00; }

            .blue {
                background: #0076ad; }

            .tooltip-inner {
                padding: 1.3em; }

            @-webkit-keyframes opacity {
                0% {
                    opacity: 0;
                    -webkit-transform: scale(3);
                    transform: scale(3); }
                100% {
                    opacity: 1;
                    -webkit-transform: scale(1);
                    transform: scale(1); } }

            @keyframes opacity {
                0% {
                    opacity: 0;
                    -webkit-transform: scale(3);
                    transform: scale(3); }
                100% {
                    opacity: 1;
                    -webkit-transform: scale(1);
                    transform: scale(1); } }

            /*# sourceMappingURL=style.css.map */
            .modal-body-image{
                width: 170px;
                height: 200px;            
            }
            #addtobag{
                width: 400px;
                height: 50px;
                background-color: red;
                color: white;
                font-size: 27px;
            }

            xoriginal{
                width: 100%;
                height: 100%;
            }
            #xzoom{
                max-width: 60px;
                display: block; 
            }

        </style>
    </head>
    <%
        Session ses = HibernateSession.getSession();
        Criteria c4 = ses.createCriteria(ProductColour.class);
        List<ProductColour> colo = c4.list();
        Criteria c2 = ses.createCriteria(ProductSize.class);
        List<ProductSize> psl1 = c2.list();

        Product p = HibernateSession.Load(ses, Product.class, request.getParameter("id"));// ak object aki
        ProductSize psize = p.getProductSize();
        ProductColour pcolour = p.getProductColour();
        Set<ProductImage> pimglist = p.getProductImages();
        String i1 = null;
        String i2 = null;
        String i3 = null;
        for (ProductImage pi : pimglist) {
            if (i1 == null) {
                i1 = pi.getUrl();

            } else if (i2 == null) {
                i2 = pi.getUrl();

            } else if (i3 == null) {
                i3 = pi.getUrl();
            }
        }
       

    %>
    <body>
        <jsp:include page="menubar.jsp"/><br><br><br>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12"><br><br>
                    <div class="col-sm-3">
                        <div class="preview-pic tab-content">
                            <div class="tab-pane active" id="pic-1"><img class="xzoom"  xoriginal="<%=i1%>" src="<%=i1%>"/></div>
                            <div class="tab-pane" id="pic-2"><img src="<%=i2%>"/></div>
                            <div class="tab-pane" id="pic-3"><img src="<%=i3%>" /></div>
                        </div>
                    </div>
                    <div class="col-sm-1 xzoom-thumbs">
                        <a id="xzoom" href="<%=i1%>"><img class="xzoom-gallery" src="<%=i1%>" /></a>
                        <a id="xzoom" href="<%=i2%>"><img class="xzoom-gallery"  src="<%=i2%>" /></a>
                        <a id="xzoom" href="<%=i3%>"><img class="xzoom-gallery" src="<%=i3%>" /></a>
                    </div>

                    <div class="col-sm-8">
                        <div class="container-fluid">
                            <h3 class="product-title"> <%= p.getName()%></h3>
                            <h5 class="pc">Product Code: <span><%= p.getCode()%></span></h5>
                            <h2 class="price">Rs:<span><%= p.getPrice()%></span></h2>
                            <div class="line"></div><br><br><br>
                        </div>
                        <div class="container-fluid">
                            <div class="col-sm-2">
                                <span>Colour</span><br><br>   
                                <span>Sizer</span><br><br>   
                                <span>Qty</span><br><br> 
                            </div> 
                            <div class="col-sm-4">
                                <span> <%= pcolour.getName()%></span><br><br> 
                                <span><%= psize.getName()%></span><br><br> 
                                <div class="col-sm-4">
                                    <input id="qty" class="form-control" type="number" max="<%= p.getQty()%>" min="1" value="1"/></div>
                            </div> 
                        </div><br><br>
                        <% if (p.getQty().equals(0)) { %>
                        <button class="btn btn-default" id="addtobag" onclick="addTobag();" disabled >Add to Bag</button>
                            <%} else{ %>
                        <button class="btn btn-default" id="addtobag" onclick="addTobag();">Add to Bag</button>
                        <% } %>
                       
                    </div>
                </div>     
            </div><br><br><br>
            <div class="container">
                <h2>We can make something just for you !!! <a style="cursor: pointer;" onclick="checkLogin()">Request a Custom Order</a></h2><br>
                <p><%= p.getProductRequest().getDescription()%></p><br><br>
            </div>
        </div>



        <!--                                 Modal -->
        <div class="modal fade" id="addtobagmodal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true" >
            <div class="modal-dialog modal-dialog-centered modal-lg" role="document">
                <div class="modal-content">

                    <div class="modal-header">
                        <h2 class="modal-title" id="addtobagmodalTitle" style="color:red;"><center>Added to your bag</center></h2>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="container" style="margin-left: 345px; ">

                            <img class="modal-body-image" src=<%= i1%>><br>

                            <h4><span class="control-label"><%=p.getName()%></span></h4>
                            <h4><span class="control-label">Product Price: <%= p.getPrice()%></span></h4>
<!--                            <h4> <span class="control-label">Product Qty: <%= p.getQty()%></span></h4><br><br>-->
                            <a href="ProductView.jsp"> <button style="background-color: black;" type="button" class="btn btn-default">Continue Shopping</button></a>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <center>
                            <br>
                            <form action="mybag.jsp">
                                <button style="background-color: red;" type="submit" class="btn btn-default" >Complete your order</button>
                            </form>
                        </center>
                    </div>
                    <Br>
                    <Br>
                </div>
            </div>
        </div>

                            
                            
                            
        <div class="container">
            <!-- Modal -->
            <div class="modal fade" id="requestModal" role="dialog">
                <div class="modal-dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <center><h3 class="modal-title" style="color: red;">Request a Custom Order</h3></center><br>
                            <h4><span class="control-label"><%=p.getName()%></span></h4>
                            <h3><span class="control-label">Rs:<%= p.getProductRequest().getPrice() %></span></h3><center>
                                <img class="modal-body-image" src=<%= i1%>></center><br>
                        </div>
                        <div class="modal-body">
                            <form action="save_cutom_order">
                                <input hidden="" type="text" name="productid" value= <%=p. getId()%>>
                                <input hidden="" type="text" name="produprice" value= <%=p.getProductRequest().getPrice()%>>
                                <h4><span class="control-label">Select Your colour</span></h4>
                                <select class="form-control" name="pcolour">
                                    <option value="0">- Select Colour -</option>
                                    <%
                                        for (ProductColour colour : colo) {
                                    %>
                                    <option value=<%= colour.getName()%> ><%= colour.getName()%></option>
                                    <% }%>
                                </select>
                                <h4><span class="control-label">Select Your Size</span></h4>
                                <select class="form-control" id="psize" name="psize">
                                    <option value="0">- Select Colour -</option>
                                    <%  for (ProductSize psize1 : psl1) {
                                    %>
                                    <option value="<%= psize1.getName()%>"><%=psize1.getName()%></option>
                                    <% }%>
                                </select><br>
                                <center>
                                    <button style="background-color: red; color: white;" type="submit" class="btn btn-default">Place  the Order</button>
                                </center>
                            </form>
                        </div>
                                <div class="modal-footer"></div>

                    </div>
                </div>
            </div>

        </div>





        <script>
            $(document).ready(function () {
                $(".xzoom, .xzoom-gallery").xzoom({tint: '#333', Xoffset: 15});
            });
            function addTobag() {
                var request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if (request.readyState === 4 && request.status === 200) {
                        if (request.responseText == "OK") {
                            $('#addtobagmodal').modal('show');
                            alert('ok');
                        } else {
                            alert('error:' + request.responseText);
                        }
                    }
                };

                request.open("GET", "myBag?add=1&pid=<%=p.getId()%>&qty=" + $(qty).val(), true);
                request.send();
                alert('send');
            }

            function checkLogin() {
            <% if (Login.getLoggedInAccount(session) == null) {%>
                window.location.href = "<%= request.getContextPath()%>/Login_Signup/Login.jsp";
            <% } else { %>
                $(requestModal).modal('show');
            <% }%>
            }
        </script>
    </body>



</html>
