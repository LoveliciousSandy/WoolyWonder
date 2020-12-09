<%-- 
    Document   : index
    Created on : 28-Mar-2018, 16:41:42
    Author     : Senani
--%>
<%@page import="Servlet.Login"%>
<%@page import="Pojos.Account"%>
<%@page import="Model.Email"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC</title>
        <jsp:include page="Links/Links.jsp"/>
        <link href="CSS/maincss.css" type="text/css" rel="stylesheet">
        <%
            Account acc = Login.getLoggedInAccount(request.getSession());
            if (acc == null) {
//                response.sendRedirect(request.getContextPath() + "/");
//                return;
        %>
        <jsp:include page="defaultnavbar.jsp"/>  
        <%
        } else {
        %>
        <jsp:include page="FixedTopNavBar.jsp"/>
        <% }
        %>
        <style>

            #divbody{
                margin:auto;
            }
            .card{
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
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
                margin-bottom: 30px;

            }
            .btn:hover {
                background-color:black;
                color: red;
            }
            img{
                transition: transform .2s;
                width:250px; 
                height :300px; 

            }
            img:hover{
                transform: scale(1.08);
            }
        </style>

  <!-- <jsp:include page="logobar.jsp"/>-->

    <jsp:include page="indexcarousel.jsp"/><br><br>
        <jsp:include page="menubar.jsp"/>
    </head>
    <br><br>

    <body id="main" onload="viewproduchomepage();">
        <div class="container-fluid" id="divbody">
            <div class="row" id="row1">
                <div class="col-sm-1"></div>
                <div id="proload" class="col-sm-9" >
                    <div id="pcontainer"  class="container" >
                    </div>
                </div>

            </div>
        </div>
         
        <br><br>
         
        <script type="text/javascript">
            var productview;
            function viewproduchomepage() {
                //                document.getElementById('proload').innerHTML = "";
                var request = new XMLHttpRequest();
                request.onreadystatechange = function () {

                    if (request.readyState === 4 && request.status === 200) {

                        var jsonstring = request.responseText;

                        var jsonparse = JSON.parse(jsonstring);


                        for (var i = 0; i < jsonparse.length; i++) {

                            productview = jsonparse[i];

                            var mainbody = document.getElementById("main");
                            var divbody = document.getElementById("divbody");
                            var row1 = document.getElementById("row1");
                            var proload = document.getElementById("proload");
                            var container = document.getElementById("pcontainer");

                            var d2 = document.createElement("div");
                            d2.setAttribute("class", "col-sm-3");


                            var l1 = document.createElement("label");
                            d2.appendChild(l1);

                            var d3 = document.createElement("div");
                            d3.setAttribute("class", "card");
                            d2.appendChild(d3);

                            var a1 = document.createElement("a");
                            a1.setAttribute("href", "selectproductview.jsp");

                            d3.appendChild(a1);
                            var image1 = document.createElement("img");
                            image1.setAttribute("src", productview.image);
                            a1.appendChild(image1);

                            var s1 = document.createElement("span");
                            s1.setAttribute("id", "pricetag");
                            s1.innerHTML = "Rs: " + productview.price;
                            d3.appendChild(s1);
                            br1 = document.createElement("br");
                            d3.appendChild(br1);
                            var s2 = document.createElement("span");
                            s2.innerHTML = productview.name;
                            d3.appendChild(s2);
                            br2 = document.createElement("br");
                            d3.appendChild(br2);

                            var b1 = document.createElement("button");
                            b1.setAttribute("class", "btn btn-default");
                            b1.setAttribute("onclick", "viewdetails(" + productview.id + ")");

                            b1.innerHTML = "View Details";
                            d3.appendChild(b1);

                            var l2 = document.createElement("label");
                            d3.appendChild(l2);

                            container.appendChild(d2);
                            proload.appendChild(container);
                            row1.appendChild(proload);
                            divbody.appendChild(row1);
                            mainbody.appendChild(divbody);
                        }

                    }

                };
                request.open("GET", "view_product", true);
                request.send();
            }

            function viewdetails(id) {
                window.location.href = "selectproductview.jsp?id=" + id;
            }

        </script>


         
</body>
</html>
