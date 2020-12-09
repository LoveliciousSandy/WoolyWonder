<%-- 
    Document   : Login
    Created on : 03-May-2018, 12:39:44
    Author     : Senani
--%>
<%@page import="Servlet.Login"%>
<%
  
    if (Login.getLoggedInAccount(request.getSession()) != null) {
        response.sendRedirect(request.getContextPath() + "/");
        return;
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="google-signin-client_id" content="767677978937-ue5j0ocda776h89high9hf6kp76co7da.apps.googleusercontent.com">
        <title>Login/SignUp</title>
        <jsp:include page="../Links/Links.jsp"/>        
        <link href="../CSS/maincss.css" type="text/css" rel="stylesheet">
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <style>

            .input-container {
                display: -ms-flexbox; /* IE10*/ 
                display: flex;
                width: 100%;
                margin-bottom: 15px;
                align-items: center;

            }
            li,a{
                color: #333333;
                cursor: pointer;

            }
            li,a:hover{
                color: red;
            }
            .input-field {
                width: 70%;
                padding: 10px;
                outline: none;
                border: none;
                border-bottom:2px solid #ccc;

            }
            #tabcontainer{
                padding-top: 50px;
                padding-left: 350px;
                padding-right: 200px;

            }

            .input-field:focus {
                border-bottom: 2px solid red;
            }
            .btn {
                background-color: lightskyblue;
                color: white;
                padding: 15px 20px;
                border: none;
                cursor: pointer;
                width: 70%;
                margin: 20px 0px 30px 30px;

            }
            .btn:hover {
                background-color:black;
                color: red;
            }
            ul {
                list-style-type: none;
            }

            article[role="login"] {
                background: #fff;
                transition: all 400ms cubic-bezier(0.4, 0, 0.2, 1);
                padding: 30px 0px 20px 140px;
                /*                font-family: Comic Sans MS;*/
            }

            hr{
                display: inline-block;
                border: 1px solid black;
                margin: 8px 350px 15px 0px;
                width:80%;

            }
            #forgotpassword{ 
                color:black;
                border: none;
                padding: 10px 0px 20px 80px;

            }
            #forgotpassword:hover{
                color:red;
            }
            .circle{
                height:30px;
                width: 30px;
                border-radius: 50%;
                background-color:black;
                text-align: center;
                color: white;
                margin:  5px 0px -20px 200px;
                font-size:  16px;
            }
            .switch{
                color: black;
                border: none;
                padding: 10px 0px 20px 50px;
                font-style: normal;
                /*                display: none;*/
            }
            .g-signin2{


            }


        </style>
    </head>
    <body>
        <div class="wel well-lg"></div>

        <div class="container" id="tabcontainer">

            <ul class="nav nav-tabs nav-justified">

                <li id="signinformTab" class="active" onclick="toggle('SI')"><a>Sign In</a></li>
                <li id="registerformTab" onclick="toggle('CA')"><a>Create Account</a></li>

            </ul>

            <div class="tab-content">

                <form id="signinform" action="../Login?action=signin" method="POST" onsubmit="return loginvalidation();">

                    <div id="signin">

                        <h3><center>Sign In</center></h3>

                        <% if (request.getParameter("error") != null) {%>             
                        <div class="alert alert-danger alert-dismissible" id="signinErr">
                            <a href="#" class="close" data-dismiss="alert" aria-label="close" onclick="$(signinErr).hide()">&times;</a>
                            <center>invalid username or password</center>
                        </div>
                        <% }%>

                        <article role="login">
                            <div class="form-group">
                                <i class="fa fa-envelope fa-fw fa-2x"></i>
                                <input  class="input-field" type="text" placeholder="enter your email"  name="email" id="email2" title="Username should only contain lowercase letters. e.g. john" onfocus="clearmsg();"><br>
                                <span id="email2s" class="text-danger" ></span>
                            </div>

                            <div class="form-group">
                                <i class="fa fa-key fa-fw fa-2x"></i>
                                <input class="input-field" type="password" placeholder="enter your password"  name="password" id="password2" onfocus="clearmsg();"><br>
                                <span id="password2s" class="text-danger" ></span>
                            </div>

                            <button type="submit" class="btn">Sign In</button>
                            <input type="hidden" name="gsignin" id="gsignin" value="0">

                            <label class="switch">
                                <input type="checkbox" name="re">Remember me 
                                <span class="checkmark"></span>
                            </label>

                            <a href="forgotpassword.jsp" id="forgotpassword">Forgot Your Password?</a>
<!--                            <div class="circle" >
                                or
                            </div>
                            <hr>-->
                        </article>
                    </div>
<!--                    <div class="g-signin2" data-onsuccess="onSignIn" style="padding: 10px 10px 20px 150px; "></div>-->
                </form>


                <form id="registerform" style="display: none;" action="../Register" method="POST" onsubmit="return validation();" >

                    <div id="register">

                        <h3><center>Create Your Account</center></h3>

                        <article role="login">

                            <div class="form-group">
                                <i class="fa fa-user fa-fw fa-2x"></i>
                                <input class="input-field" type="text" placeholder="your username" name="username" id="username" onfocus="clearmsg();"><br>
                                <span id="username1" class="text-danger" ></span>
                            </div>
                            <div class="form-group">
                                <i class="fa fa-envelope fa-fw fa-2x"></i>
                                <input class="input-field" type="text" placeholder="your email" name="email" id="email" onfocus="clearmsg();"><br>
                                <span id="email1" class="text-danger"></span>
                            </div>

                            <div class="form-group">
                                <i class="fa fa-lock fa-fw fa-2x"></i>
                                <input class="input-field" type="password" placeholder="create your password(min 6 char)" name="password" id="password" onfocus="clearmsg();"><br>
                                <span id="password1" class="text-danger"></span>
                            </div>

                            <button type="submit" class="btn">Create Account</button>
<!--                            <input type="hidden" name="gsignin" id="gsignin2" value="0">-->
<!--                            <div class="circle" >
                                or
                            </div>-->
<!--                            <hr>-->
                        </article>
                    </div>
<!--                    <div class="g-signin2" data-onsuccess="onSignIn" style="padding: 10px 10px 20px 150px; "></div>-->
                </form>
            </div>

        </div>

        <!--    </div>-->
        <script>
            function toggle(x) {
                if (x == "SI") {
                    $(registerform).hide();
                    $(signinform).fadeIn();
                    $(signinformTab).addClass("active");
                    $(registerformTab).removeClass("active");
                } else {
                    $(signinform).hide();
                    $(registerform).fadeIn();
                    $(registerformTab).addClass("active");
                    $(signinformTab).removeClass("active");
                }
            }

            function onSignIn(googleUser) {
                var profile = googleUser.getBasicProfile();
                $(email2).val(profile.getEmail());
                $(password2).val(profile.getId());
                $(gsignin).val("1");
                signOut();
                $(signinform).submit();
            }

            function signOut() {
                var auth2 = gapi.auth2.getAuthInstance();
                auth2.signOut();
            }

            ///// create accoutnt /////
            function validation() {
                var un = document.getElementById("username").value;
                var em = document.getElementById("email").value;
                var pw = document.getElementById("password").value;
                if (un == "") {
                    document.getElementById("username1").innerHTML = "**Please fill the username**";
                    return false;
                }
                if ((un.length < 3) || (un.length > 10)) {
                    document.getElementById("username1").innerHTML = "**Please fill the username between 3 & 10 **";
                    return false;
                }
                if (!isNaN(un)) {
                    document.getElementById("username1").innerHTML = "**Please enter character**";
                    return false;
                } else
                    (true);
                if (em == "") {
                    document.getElementById("email1").innerHTML = "**Please fill the email**";
                    return false;
                }
                var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                if (!em.match(mailformat)) {
                    document.getElementById("email1").innerHTML = "**Invalid email**";
                    return false;
                } else
                    (true);
                if (pw == "") {
                    document.getElementById("password1").innerHTML = "**Please fill the password**";
                    return false;
                }
                if (pw.length < 5) {//not working
                    document.getElementById("password1").innerHTML = "**Please fill the password minimum 6 characters**";
                    return false;
                } else
                    (true);
            }
///// create accoutnt /////

////login account////

            function loginvalidation() {
                var em2 = document.getElementById('email2').value;
                var pw2 = document.getElementById('password2').value;
                if (em2 == "") {
                    document.getElementById('email2s').innerHTML = "**Please fill the email**";
                    return false;
                }
                var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                if (!em2.match(mailformat)) {
                    document.getElementById("email2s").innerHTML = "**Invalid email**";
                    return false;
                } else {
                    (true);
                }

                if (pw2 == "") {
                    document.getElementById("password2s").innerHTML = "**Please fill the password**";
                    return false;
                }
                if (pw2.length < 5) {
                    document.getElementById("password2s").innerHTML = "**Please fill the password minimum 6 characters**";
                    return false;
                } else {
                    $(signinform).submit();
                }
            }
            ////login account////

////// clear messages//////
            function clearmsg() {
                document.getElementById("username1").innerHTML = "";
                document.getElementById("email1").innerHTML = "";
                document.getElementById("password1").innerHTML = "";
                document.getElementById("email2s").innerHTML = "";
                document.getElementById("password2s").innerHTML = "";
            }
////// clear messages//////

        </script>
    </body>
</html>
