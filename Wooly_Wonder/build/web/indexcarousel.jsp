<%-- 
    Document   : indexcarousel
    Created on : 19-Jun-2018, 15:52:31
    Author     : Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    body{
       
    }
    .container {
        margin-top: 0px;
    }


    /* Carousel Styles */

    .carousel-indicators .active {
        background-color: #2980b9;
    }
    .carousel slide{
        width: 1366px;
        height: 300px;

    }
    .carousel-inner img {
        width: 1800px;


    }

    .carousel-control {
        width: 0;
    }

    .carousel-control.left,
    .carousel-control.right {
        opacity: 1;
        filter: alpha(opacity=100);
        background-image: none;
        background-repeat: no-repeat;
        text-shadow: none;
    }



    .carousel-control .glyphicon-chevron-left,
    .carousel-control .glyphicon-chevron-right,
    .carousel-control .icon-prev,
    .carousel-control .icon-next {
        position: absolute;
        top: 45%;
        z-index: 5;
        display: inline-block;
    }

    .carousel-control .glyphicon-chevron-left,
    .carousel-control .icon-prev {
        left: 0;
    }

    .carousel-control .glyphicon-chevron-right,
    .carousel-control .icon-next {
        right: 0;
    }



    .carousel-control.left span:hover,
    .carousel-control.right span:hover {
        opacity: .7;
        filter: alpha(opacity=70);
    }

    #c{
        width: 100%;
    }
</style>
<br><br><br>&nbsp;
<div class="container-fluid" id="c">
    <div class="row">
        <!-- Carousel -->
        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                <li data-target="#carousel-example-generic" data-slide-to="3"></li>
            </ol>
            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                <div class="item ">
                    <img src="img/c5.jpg" alt="First slide">
                </div>
                <div class="item active">
                    <img src="img/c2.jpg" alt="Second slide">
                </div>
                <div class="item">
                    <img src="img/c3.jpg" alt="Third slide">
                </div>
                <div class="item">
                    <img src="img/c4.jpg" alt="Third slide">
                </div>
            </div>
            <!-- Controls -->
            <a class="left carousel-control-left" href="#carousel-example-generic" data-slide="prev">

            </a>
            <a class="right carousel-control-right" href="#carousel-example-generic" data-slide="next">

            </a>
        </div><!-- /carousel -->
    </div>
</div>