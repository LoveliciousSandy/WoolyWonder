<%-- 
    Document   : details_bar
    Created on : 23-May-2018, 21:41:37
    Author     : Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../Links/Links.jsp"/>
    </head>
    <style>
        body{
            font-family: Comic Sans MS;
            background-image: url("../img/b1.jpg");
           

        }
        #detailsbar{
            /*                background-color: #cccccc;*/
            margin-top: 25px;
            position: fixed;
            width: 100%;
            height: 70px;
            border: none;

        }
        #apname{
            padding: 30px;
            font-size: x-large;
            font-style: normal;
        }


    </style>
    <body>
    <div class="container" id="detailsbar">
       <button  class="btn btn-default">Save
                            </button>&emsp;<button  class="btn btn-default">Save
                            </button>&emsp;
            <div class="container-fluid">
                <div class="nav navbar-left" style="padding: 0px 0px 30px 30px;">
                    <button class=" btn btn-default btn-sm" data-toggle="tooltip" data-placement="bottom" title="back">
                        <i class="fa fa-arrow-left fa-fw " ></i>
                    </button>
                    <label id="apname">Products</label>
                </div>
                <div class="nav navbar-right" style="padding: 30px 110px 0px 0px;">
                    <a href="products.add.jsp">
                        <button class="btn btn-default btn-sm" id="addbtn" data-toggle="tooltip" data-placement="bottom" title="Add Products">
                            <i class="fa fa-plus fa-fw "></i>
                        </button>
                    </a>

                    <button class="btn btn-default btn-sm" id="addbtn" data-toggle="tooltip" data-placement="bottom" title="Add Products">
                        <i class="fa fa-plus fa-fw "></i>
                    </button>


                    <label>
                        <form action="index.jsp" method="POST">
                            <button class="btn btn-default">Save
                            </button>
                        </form>
                    </label>  
                </div>
            </div>
        </div>


        <script type="text/javascript">
            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
            });
        </script>
    </body>
</html>
