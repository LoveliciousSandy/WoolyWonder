<%-- 
    Document   : ProductView
    Created on : 04-Jun-2018, 16:39:11
    Author     : Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../Links/Links.jsp"/>
        <link href="CSS/maincss.css" type="text/css" rel="stylesheet">
        <style>
            #divbody{
                margin:auto;
            }
           
            #pricetag{
                color:#ff0099;
                font-size: large;
                margin-left: 70px;
                padding-top: 20px;
            }
            #viewdetails{
                margin-left: 60px;  
            }
/*            img{
                transition: transform .2s;
                width:250px; height :270px; border:1px solid gray
            }
            img:hover{
                transform: scale(1.08);
            }*/
        </style>
    </head>
    <body id="mainbody" onload="viewproduchomepage();">

        <div class="well well-lg">

        </div>
        <br>
        <div class="container" id="divbody">
            <div class="row" id="row1">

                <div id="proload" class="col-sm-10">
                    <div id="pcontainer"  class="container">

                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            var productview;
            function viewproduchomepage() {
//                document.getElementById('proload').innerHTML = "";
                var request = new XMLHttpRequest();
                request.onreadystatechange = function () {

                    if (request.readyState === 4 && request.status === 200) {

                        var jsonstring = request.responseText;
                        alert(jsonstring);
                        var jsonparse = JSON.parse(jsonstring);
                        alert(jsonparse);

                        for (var i = 0; i < jsonparse.length; i++) {

                            productview = jsonparse[i];


                            var mainbody = document.getElementById("mainbody");
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
                            b1.setAttribute("id", "viewdetails");
                            b1.innerHTML = "View Details";
                            b1.addEventListener("click", viewdetails);
                            d3.appendChild(b1);

                            var l2 = document.createElement("label");
                            d3.appendChild(l2);

//                           
                            container.appendChild(d2);
                            proload.appendChild(container);
                            row1.appendChild(proload);
                            divbody.appendChild(row1);
                            mainbody.appendChild(divbody);

                        }

                    }

                };
                request.open("GET", "../view_product", true);

                request.send();

            }
            function viewdetails() {

//                alert(productview.id);
                window.location.href = "selectproductview.jsp?id=" + productview.id;

            }

        </script>
        
    </body>
</html>
