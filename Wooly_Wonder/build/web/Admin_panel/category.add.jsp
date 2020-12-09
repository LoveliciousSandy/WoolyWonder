<%-- 
    Document   : category.add
    Created on : 25-May-2018, 16:42:50
    Author     : Senani
--%>

<%@page import="org.hibernate.Session"%>
<%@page import="java.util.Set"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.criterion.Order"%>
<%@page import="org.hibernate.FetchMode"%>
<%@page import="Pojos.ProductSubcategory"%>
<%@page import="java.util.List"%>
<%@page import="Pojos.ProductCategory"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="org.hibernate.Criteria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.Login"%>
<%
    Session s = HibernateSession.getSession();
    Criteria c1 = s.createCriteria(ProductCategory.class);
    c1.addOrder(Order.asc("id"));
    c1.add(Restrictions.eq("status", "Active"));
    List<ProductCategory> pcl = c1.list();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../Links/Links.jsp"></jsp:include>
            <link href="../CSS/maincss.css" type="text/css" rel="stylesheet">
            <style>
                #createbutton{
                    background-color:red;
                    color: white;
                    width: 150px;
                }
                .newbtn{
                    cursor: pointer;
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
                <h2 style="margin-left: 60px;">Category Add</h2>
            </div>
        </div><br>
        <div class=" container row">
            <div class="col-sm-3">
            </div>
            <div class="col-sm-6">
                <ul class="nav nav-tabs">
                    <li class="active"><a data-toggle="tab" href="#Categories"><h4>Categories</h4></a></li>
                    <li><a data-toggle="tab" href="#Sizers"><h4>Sizers</h4> </a></li>
                    <li><a data-toggle="tab" href="#Colours"><h4>Colours</h4></a></li>
                </ul>
            </div>
        </div>
        <div class=" container row">
            <div class="col-sm-3">
            </div>
            <div class="col-sm-9">

                <div class="tab-content">
                    <div id="Categories" class="tab-pane fade in active" style="background-color: white"><br>
                        <h2>Add Category</h2>
                        <% if (request.getParameter("msg") != null && request.getParameter("msg").equals("0")) {%>
                        <div class="alert alert-danger alert-dismissible" id="co">
                            <a href="#" class="close" data-dismiss="alert" aria-label="close" onclick="$(co).hide()">&times;</a>
                            <center>Same Categories</center>
                        </div>
                        <% } else if (request.getParameter("msg") != null && request.getParameter("msg").equals("rootnull")) {%>
                        <div class="alert alert-danger alert-dismissible" id="co">
                            <a href="#" class="close" data-dismiss="alert" aria-label="close" onclick="$(co).hide()">&times;</a>
                            <center>Invalid Category. Choose a main Category or Root.</center>
                        </div>
                        <% }%> 
                        <form action="../category_save?action=category" method="POST">
                            <br>
                            <br>

                            <div class="form-group">
                                <label class="control-label col-sm-3" for="name">Category Name:</label>
                                <div class="col-sm-5">
                                    <input id="cname" type="text" class="form-control" required="" name="cname" onkeypress="return isAlfa(event)"/>
                                    <span id="alertcname" class="text-danger" ></span>
                                </div>
                            </div>
                            <br>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="sel1">Category Location:</label>
                                <div class="col-sm-3">
                                    <select class="form-control" id="ccategory" name="rootlevel">
                                        <option value="0">-Select Category-</option>
                                        <%for (ProductCategory pc : pcl) {%>
                                        <option value="<%= pc.getId()%>"><%= pc.getName()%></option>
                                        <%
                                            Set<ProductSubcategory> pscs = pc.getProductSubcategories();
                                            for (ProductSubcategory psc : pscs) {
                                        %>
                                        <option>&emsp;- <%= psc.getSubcategory()%></option>
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
                                <label class="control-label col-sm-3" for="cstatus">Status</label>
                                <div class="col-sm-4" >

                                    <input  type="radio" name="status" value="Active" required="" checked>Active
                                    <input type="radio" name="status" value="Disable" required="">Disable
                                </div>
                            </div>

                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3"></label>
                                <div class="col-sm-1">
                                    <button id="createbutton" class="btn btn-default-create  form-control">Create</button>
                                </div>
                            </div>
                            <br>
                            <br>
                        </form>
                    </div>

                    <div id="Sizers" class="tab-pane fade" style="background-color: white"><br>
                        <h2>Add Size</h2>
                        <% if (request.getParameter("msg") != null && request.getParameter("msg").equals("00")) {%>
                        <div class="alert alert-danger alert-dismissible" id="co">
                            <a href="#" class="close" data-dismiss="alert" aria-label="close" onclick="$(co).hide()">&times;</a>
                            <center>Same Size</center>
                        </div>
                        <% }%> 
                        <form action="../category_save?action=size" method="POST">
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="name">Name:</label>
                                <div class="col-sm-5">
                                    <input type="text" class="form-control" required="" name="sname" onkeypress="return isAlfa(event)">
                                    <span id="alertsname" class="text-danger" ></span>
                                </div>
                            </div>
                            <br>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="sstatus">Status</label>
                                <div class="col-sm-4" >

                                    <input type="radio" name="status" value="Active" checked required="">Active
                                    <input type="radio" name="status" value="Hidden"required="">Disable

                                </div>
                            </div>

                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3"></label>
                                <div class="col-sm-1">
                                    <button id="createbutton" class="btn btn-default-create form-control">Create</button>
                                </div>
                            </div>
                            <br>
                            <br>
                        </form>
                    </div>

                    <div id="Colours" class="tab-pane fade" style="background-color: white"><br>
                        <h2>Add Colour</h2>
                        <% if (request.getParameter("msg") != null && request.getParameter("msg").equals("000")) {%>
                        <div class="alert alert-danger alert-dismissible" id="co">
                            <a href="#" class="close" data-dismiss="alert" aria-label="close" onclick="$(co).hide()">&times;</a>
                            <center>Same Colour</center>
                        </div>
                        <% }%> 
                        <form action="../category_save?action=colour" method="POST" enctype="multipart/form-data">

                            <br>
                            <br>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="name">Name:</label>
                                <div class="col-sm-4">
                                    <input class="form-control" type="text" name="cname" required="" onkeypress="return isAlfa(event)">
                                    <span id="alertccname" class="text-danger" ></span>
                                </div>
                                <div class="col-sm-4">
                                    <label class="newbtn">
                                        <img src="http://placehold.it/120x120" alt="imge" width="120" height="120" id="img1">
                                        <input style="display: none;" id="pic1" type="file"  onchange="changePic(this, document.getElementById('img1'))" name="pic1"/>
                                    </label>
                                </div>
                            </div>

                            <br>
                            <br>

                            <br>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="cstatus">Status</label>
                                <div class="col-sm-4" >
                                    <input type="radio" name="status" value="Active" checked required="">Active
                                    <input type="radio" name="status" value="Hidden"required="">Disable
                                </div>
                            </div>
                            <br>
                            <br>
                            <div class="form-group">
                                <label class="control-label col-sm-3"></label>
                                <div class="col-sm-1">
                                    <button id="createbutton" class="btn btn-default-create form-control">Create</button>

                                </div>
                            </div>

                            <br>
                            <br>
                        </form>

                    </div>
                </div>
            </div>
        </div>

        <script>

            function isAlfa(evt) {
                evt = (evt) ? evt : window.event;
                var charCode = (evt.which) ? evt.which : evt.keyCode;
                if (charCode > 32 && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122)) {
                    document.getElementById('alertcname').innerHTML = "**Please enter character**";
                    document.getElementById('alertccname').innerHTML = "**Please enter character**";
                    document.getElementById('alertsname').innerHTML = "**Please enter character**";
                    return false;
                }
                document.getElementById('alertcname').innerHTML = "";
                document.getElementById('alertccname').innerHTML = "";
                document.getElementById('alertsname').innerHTML = "";
                return true;
            }
            function changePic(input, img) {
                if (input.files && input.files[0]) {
                    var reader = new FileReader();
                    reader.onload = function (e) {
                        $(img).attr('src', e.target.result)
                    }
                    reader.readAsDataURL(input.files[0]);
                }
            }
            function update(jscolor) {
                document.getElementById('rect').style.backgroundColor = '#' + jscolor
            }

            function changeTab(tab) {
                if (!tab)
                    return;
                $('.nav-tabs a[href="#' + tab + '"]').tab('show');
            }

            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
                changeTab('${param.tab}');
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

    <!--                                    <input class="jscolor form-control"  onchange="update(this.jscolor)" value="" type="text" required="" name="cname">-->
</html>
<%
    s.close();
%>