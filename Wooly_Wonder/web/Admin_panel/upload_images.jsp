<%-- 
    Document   : upload_images
    Created on : 24-May-2018, 20:04:45
    Author     : Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../Links/Links.jsp"></jsp:include>
            <style>

                #image{
                    padding:0px;
                }
                .inputfile {
                    width: 0.1px;
                    height: 0.1px;
                    opacity: 0;
                    overflow: hidden;
                    position: absolute;
                    z-index: -1;
                }
                .inputfile + label {
                    font-size: 1.25em;
                    font-weight: 700;
                    color: white;
                    background-color: black;
                    display: inline-block;
                }

                .inputfile:focus + label,
                .inputfile + label:hover {
                    background-color: red;
                }
                .inputfile + label {
                    cursor: pointer; /* "hand" cursor */
                }
                .inputfile:focus + label {
                    outline: 1px dotted #000;
                    outline: -webkit-focus-ring-color auto 5px;
                }
            </style>
        </head>
        <body>
            <br>
            <br>
            <br>
        <jsp:include page="../Component/leftdrop_menu.jsp"></jsp:include>
        <jsp:include page="../Component/details_bar.jsp"></jsp:include>
        <form action="" method="POST" enctype="mutipart/form-data">
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <h1>yhfhd</h1>
            <div class="container">
                <div class="row ">
                    <!--                    
                    -->                        <img src="http://placehold.it/120x120" alt="imge" style="margin: 0;"/>  <br>
                    <div class="col-sm-3" style="background-color: red">
                        <input  type="file"  multiple="">
                    </div>

                </div>
            </div>



        </form>
        <script>

        </script>
    </body>
</html>
