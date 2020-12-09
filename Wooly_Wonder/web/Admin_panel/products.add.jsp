<%-- 
    Document   : products.add
    Created on : 23-May-2018, 21:29:04
    Author     : Senani
--%>

<%@page import="Pojos.ProductColour"%>
<%@page import="Pojos.ProductSubcategory"%>
<%@page import="org.hibernate.Hibernate"%>
<%@page import="Pojos.ProductSize"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Pojos.ProductCategory"%>
<%@page import="org.hibernate.Session"%>
<%@page import="hibernate.HibernateSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.Login"%>
<%
    Session s = HibernateSession.getSession();
    Criteria c1 = s.createCriteria(ProductCategory.class);

    c1.add(Restrictions.eq("status", "active"));
    List<ProductCategory> pcl = c1.list();

    Criteria c2 = s.createCriteria(ProductSize.class);
    List<ProductSize> psl = c2.list();

    ProductCategory pc = null;
    if (request.getParameter("catid") != null) {
        pc = HibernateSession.Load(s, ProductCategory.class, request.getParameter("catid"));
    }

    Criteria c4 = s.createCriteria(ProductColour.class);
    List<ProductColour> colo = c4.list();
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
            #createbutton{
                background-color:red;
                color: white;
                width: 150px;
            }
            #productsavebutton{
                float: right;
                margin-right: -40px;
            }
            #textarea{
                resize: none;
                width: 250px;
                height: 80px;
            }
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
                <h2 style="margin-left: 60px;">Product Add</h2>
            </div>
        </div><br>
        <form action="../save_product" method="POST" enctype="multipart/form-data">
            <div class="container row">
                <div id="productsavebutton">
                    <button class="btn btn-success" type="submit"><i class="fa fa-save fa-2x"></i></button>
                </div>
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#General"><h4>General</h4></a></li>
                        <li><a data-toggle="tab" href="#Cost"><h4>Cost</h4></a></li>
                        <li><a data-toggle="tab" href="#Image"><h4>Image</h4></a></li>
                        <li><a data-toggle="tab" href="#Request"><h4>Request</h4></a></li>
                    </ul>
                </div>
            </div>
            <div class=" container row">
                <div class="col-sm-3"></div>
                <div class="col-sm-9">
                    <div class="tab-content">
                        <div id="General" class="tab-pane fade in active"><br><br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="Category">Categories</label>
                                <div class="col-sm-4">
                                    <select class="form-control" id="pcategory" name="pcategory" onchange="getproductsub();">
                                        <option value="0"> - Select Product Category -</option>
                                        <% for (ProductCategory pcat : pcl) {
                                        %>
                                        <option value="<%= pcat.getId()%>"<%= pc != null && pc.getId().equals(pcat.getId()) ? " selected" : ""%>><%= pcat.getName()%></option>
                                        <% }%>
                                    </select>
                                </div>
                            </div>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="Category">Sub Categories</label>
                                <div class="col-sm-4">
                                    <select class="form-control" id="psubcategory" name="psubcategory">
                                        <option value="0"> - Select Product Sub Category -</option>
                                        <%
                                            if (pc != null) {
                                                Criteria c3 = s.createCriteria(ProductSubcategory.class);
                                                c3.add(Restrictions.eq("productCategory", pc));
                                                List<ProductSubcategory> psc = c3.list();
                                                for (ProductSubcategory c : psc) {
                                        %>
                                        <option value="<%= c.getId()%>"><%= c.getSubcategory()%></option>
                                        <%
                                                }
                                            }
                                        %>
                                    </select>
                                </div>
                            </div>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pname">Name*</label>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="pname" id="pname" required="" >
                                    <span id="alertpname" class="text-danger" ></span>
                                </div>
                            </div>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pcolour">Colour</label>
                                <div class="col-sm-4"> 
                                    <select class="form-control" name="pcolour">
                                        <option value="0">- Select Colour -</option>
                                        <% for (ProductColour colour : colo) {
                                        %>
                                        <option value=<%=colour.getId()%>><%=colour.getName()%></option>
                                        <% }%>
                                    </select>
                                </div>
                            </div>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="psize">Size</label>
                                <div class="col-sm-4"> 
                                    <select class="form-control" id="psize" name="psize">
                                        <option value="0">-Select Product Size-</option>
                                        <%  for (ProductSize psize : psl) {
                                        %>
                                        <option value="<%= psize.getId()%>"><%=psize.getName()%></option>
                                        <% }
                                        %>
                                    </select>
                                </div>
                            </div>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pqty">Quantity</label>
                                <div class="col-sm-4"> 
                                    <input type="number" class="form-control" name="pqty">
                                </div>
                            </div>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pqty">Status</label>
                                <div class="col-sm-4">

                                    <input type="radio" name="status" checked="" value="Active">Active
                                    <input type="radio" name="status" value="Disable">Disable
                                </div>
                            </div><br><br><br><br>
                        </div>
                        <div id="Cost" class="tab-pane fade"><br><br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pprice">Price:</label>
                                <div class="col-sm-4"> 
                                    <input type="text" class="form-control" placeholder="0.00" name="pprice" onkeypress="return isNumber(event)"/>
                                    <span id="alertpprice" class="text-danger" ></span>
                                </div>
                            </div>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pcode">Shipping Cost*</label>
                                <div class="col-sm-4"> 
                                    <input type="text" class="form-control" placeholder="0.00" name="pshipping" onkeypress="return isNumber(event)"/>
                                    <span id="alertpshipping" class="text-danger" ></span>
                                </div>
                                <a href="http://slpost.gov.lk/tariffcal/index.php" target="blank" style="color: red;">Shipping Cost Calculator</a>
                            </div>
                            <br>
                            <br>
                            <br>
                        </div>
                        <div id="Image" class="tab-pane fade"><br><br>
                            <label class="control-label col-sm-2" for="pqty">Images</label><br><br>
                            <div class="form-group">
                                <div class="col-sm-4">
                                    <label class="newbtn">
                                        <img src="http://placehold.it/120x120" alt="imge" width="220" height="200" id="img1">
                                        <input id="pic1" type="file" onchange="changePic(this, document.getElementById('img1'))" name="pic1"/>
                                    </label>
                                </div>
                                <div class="col-sm-4"> 
                                    <label class="newbtn">
                                        <img src="http://placehold.it/120x120" alt="imge" width="220" height="200" id="img2">
                                        <input id="pic2" type="file" onchange="changePic(this, document.getElementById('img2'))" name="pic2"/>
                                    </label>
                                </div>
                                <div class="col-sm-4"> 
                                    <label class="newbtn">
                                        <img src="http://placehold.it/120x120" alt="imge" width="220" height="200" id="img3">
                                        <input id="pic" type="file" onchange="changePic(this, document.getElementById('img3'))" name="pic3"/>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div id="Request" class="tab-pane fade">
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pname">Description</label>
                                <div class="col-sm-4">
                                    <textarea id="textarea" class="form-control" rows="4" name="rdescription"></textarea>
                                </div>
                            </div>
                            <br><br><br><br><br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="pqty">Prices</label>
                                <div class="col-sm-4"> 
                                    <input type="text" class="form-control" name="rprice" onkeypress="return isNumber(event)"/>
                                    <span id="alertrprice" class="text-danger" ></span>
                                </div>
                            </div><br><br><br>

                            <br>
                            <br>
                            <br>
                            <br>
                        </div>
                    </div>
                </div> 
            </div>

        </form>

        <script>
            function isNumber(evt) {
                evt = (evt) ? evt : window.event;
                var charCode = (evt.which) ? evt.which : evt.keyCode;
                if (charCode > 31 && (charCode < 48 || charCode > 57)) {
                    document.getElementById('alertpprice').innerHTML = "**Please enter Number**";
                    document.getElementById('alertpshipping').innerHTML = "**Please enter Number**";
                    document.getElementById('alertrprice').innerHTML = "**Please enter Number**";
                    return false;
                }
                document.getElementById('alertpprice').innerHTML = "";
                document.getElementById('alertpshipping').innerHTML = "";
                document.getElementById('alertrprice').innerHTML = "";
                return true;
            }

            function isAlfa(evt) {
                evt = (evt) ? evt : window.event;
                var charCode = (evt.which) ? evt.which : evt.keyCode;
                if (charCode > 31 && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122)) {
                    document.getElementById('alertpname').innerHTML = "**Please enter character**";
                    return false;
                }
                document.getElementById('alertpname').innerHTML = "";
                return true;
            }
            $(document).ready(function () {
                $(formsave1).on("click", function (e) {
                    alert('CLICKED 1');
                    $('#formsave2').click();
                    alert('CLICKED 2');
                });
            });
            function changePic(input, img) {
                if (input.files && input.files[0]) {
                    var reader = new FileReader();
                    reader.onload = function (e) {
                        $(img).attr('src', e.target.result)
                    }
                    reader.readAsDataURL(input.files[0]);
                }
            }


            function getproductsub() {
                var catid = document.getElementById('pcategory').value;
                var url = window.location.href.pathname;
                var r = new XMLHttpRequest();
                r.onreadystatechange = function () {
                    if (r.readyState === 4 && r.status === 200) {

                    }
                };
                window.location.href = "<%= request.getRequestURL()%>?catid=" + catid;
                r.open("GET", "<%= request.getRequestURL()%>?catid=" + catid, true);
                // r.open("GET",url+"?catid=" + catid,true);
                r.send();
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
<%
    s.close();
%>
