<%-- 
    Document   : Productsearch
    Created on : 01-Jul-2018, 14:51:11
    Author     : Senani
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Pojos.ProductColour"%>
<%@page import="Pojos.ProductSize"%>
<%@page import="org.hibernate.Hibernate"%>
<%@page import="Servlet.Login"%>
<%@page import="Pojos.Account"%>
<%@page import="java.util.Set"%>
<%@page import="Pojos.ProductCategory"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Pojos.ProductSubcategory"%>
<%@page import="Pojos.ProductSubcategory"%>
<%@page import="Pojos.ProductImage"%>
<%@page import="java.util.List"%>
<%@page import="Pojos.Product"%>
<%@page import="Pojos.Product"%>
<%@page import="org.hibernate.SQLQuery"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="hibernate.HibernateSession"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  Session s = HibernateSession.getSession(); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Links/Links.jsp"/>
        <link href="CSS/maincss.css" type="text/css" rel="stylesheet">
        <%
            Account acc = Login.getLoggedInAccount(request.getSession());
            if (acc == null) {

        %>
        <jsp:include page="defaultnavbar.jsp"/>  
        <%        } else {
        %>
        <jsp:include page="FixedTopNavBar.jsp"/>  

        <% }
        %>
        <style>
            .clickable{

                cursor: pointer;   
            }
            .panel-heading span {
                margin-top: -20px;
                font-size: 15px;
            }
            #pricetag{
                color:black;
                font-size: large;
                margin-left: 70px;
                padding-top: 20px;

            }
            .btn {
                margin-left: 70px;  
                background-color: red;
                color: white;

            }
            .btn:hover {
                background-color:black;
                color: red;
            }
            #imgcard{
                width: 200px;
                height: 270px;
                margin-left: 10px;
                 transition: transform .2s;
/*                width:250px; 
                height :300px; */
                 box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
                
            }
            #imgcard:hover{
                transform: scale(1.08);
            }
            #pricefilter,#id5{
                width: 17px;
                height: 17px;
                cursor: pointer;
            }

            body{
                margin-left: 0;
                margin-left: 20px;
                margin-right: 0;
                padding-right: 0;
            }

        </style>
    </head>
    <body>
        <br><br>
        <br><br>
        <br><br>
        <jsp:include page="menubar.jsp"/>
        <br>
        <br>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3">
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            <%
                                ProductCategory pc = null;
                                if (request.getParameter("id") != null) {
                                    pc = HibernateSession.Load(s, ProductCategory.class, request.getParameter("id"));
                                }
                            %>
                            <h3 class="panel-title"><%=pc != null ? pc.getName() : "Sub Category"%></h3>
                            <span class="pull-right clickable" ><i class="glyphicon glyphicon-chevron-up "></i></span>
                        </div>
                        <div class="panel-body">
                            <select class="form-control" onchange="adsearch()" id="subCat">
                                <option value="0">Select</option>
                                <%
                                    List<ProductSubcategory> psc;
                                    if (pc != null) {
                                        Criteria c1 = HibernateSession.createCriteria(s, ProductSubcategory.class);
                                        c1.add(Restrictions.eq("productCategory", pc));
                                        psc = c1.list();
                                    } else {
                                        psc = new ArrayList();
                                    }
                                    for (ProductSubcategory sc : psc) {
                                %>
                                <option value='<%= sc.getId()%>'><%=sc.getSubcategory()%></option>
                                <% } %>
                            </select>
                        </div>
                    </div>
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            <h3 class="panel-title">Price</h3>
                            <span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
                        </div>
                        <div class="panel-body">
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label>Min Rs:</label>
                                    <input type="number" class="form-control" placeholder="Min" min="0" onchange="adsearch()" id="minP" >
                                </div>
                                <div class="form-group col-md-6 text-right">
                                    <label>Max Rs:</label>
                                    <input type="number" class="form-control" placeholder="Max" min="0" onchange="adsearch()" id="maxP">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            <h3 class="panel-title">Sizes</h3>
                            <span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
                        </div>
                        <div class="panel-body">
                            <div class="form-row">
                                <%
                                    Criteria c3 = HibernateSession.createCriteria(s, ProductSize.class);
                                    List<ProductSize> psize = c3.list();
                                    for (ProductSize pz : psize) {
                                %>
                                <input type="radio" name="size" id="size" onchange="adsearch()" value="<%=pz.getId()%>"> <%=pz.getName()%>
                                <br>
                                <% }%>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            <h3 class="panel-title">Colours</h3>
                            <span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
                        </div>
                        <div class="panel-body">
                            <div class="form-row">
                                <%
                                    Criteria c2 = HibernateSession.createCriteria(s, ProductColour.class);
                                    List<ProductColour> pcolour = c2.list();
                                    for (ProductColour pco : pcolour) {
                                %>
                                <button onclick="adsearch('<%= pco.getId()%>')"><img src="<%=pco.getImage()%>" width="50" height="50"/></button>
                                    <% }%>
                                <hr>
                            </div>
                        </div>
                    </div>
                                <button style="width: 100px; height: 30px; margin-left: 80px;" class="btn btn-danger" onclick="clearpaneldata();"> Clear All</button>
                </div>
                                
                <div class="col-sm-9" id="resultContent">

                </div>
            </div>
        </div>



        <script>
            function clearpaneldata(){
                 var subcategory = "";
                var min = "";
                var max = "";
                var size = "";
                
                
                
            }
            function viewdetails(id) {
                window.location.href = "selectproductview.jsp?id=" + id;
            }

            $(document).on('click', '.panel-heading span.clickable', function (e) {
                var $this = $(this);
                if (!$this.hasClass('panel-collapsed')) {
                    $this.parents('.panel').find('.panel-body').slideUp();
                    $this.addClass('panel-collapsed');
                    $this.find('i').removeClass('glyphicon-chevron-up').addClass('glyphicon-chevron-down');
                } else {
                    $this.parents('.panel').find('.panel-body').slideDown();
                    $this.removeClass('panel-collapsed');
                    $this.find('i').removeClass('glyphicon-chevron-down').addClass('glyphicon-chevron-up');
                }
            });




            function adsearch(colour = "") {

                var subcategory = "";
                var min = "";
                var max = "";
                var size = "";

                subcategory = document.getElementById("subCat").value;
                min = document.getElementById('minP').value;
                max = document.getElementById('maxP').value;
                if (document.querySelector('input[name=size]:checked'))
                    size = document.querySelector('input[name=size]:checked').value;

                var req = new XMLHttpRequest();
                req.onreadystatechange = function () {
                    if (req.readyState === 4 && req.status === 200) {
                        $(resultContent).html(req.responseText);
                    }
                };
                req.open("GET", "searchResult.jsp?cat=${param.id}&subCat=" + subcategory + "&minP=" + min + "&maxP=" + max + "&size=" + size + "&colour=" + colour + "&q=${param.q}");
                req.send();
            }

            $(document).ready(function () {
                adsearch();
            });
        </script>


    </body>
</html>
