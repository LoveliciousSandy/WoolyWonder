<%-- 
    Document   : forgotpassword
    Created on : 13-Jun-2018, 19:57:13
    Author     : Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../Links/Links.jsp"></jsp:include>
        <link href="../CSS/maincss.css" type="text/css" rel="stylesheet">
        <style>
            body{
             margin: 110px;;
            }
            .input-field {
                width: 70%;
                padding: 10px;
                outline: none;
                border: none;
                border-bottom:2px solid #ccc;

            }
            .input-field:focus {
                border-bottom: 2px solid red;
            }
            
            .btn {
                 background-color:  red;
                color: white;

            }
            
                 .btn:hover {
                background-color:black;
                color: red;
            
            }
        </style>
    </head>
    <body>
      <div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
              <div class="panel-body">
                <div class="text-center">
                  <h3><i class="fa fa-lock fa-4x"></i></h3>
                  <h2 class="text-center" style="color: red">Forgot Password?</h2>
                  <p>Enter your email address we will sent you the password reset link.</p>
                  <div class="panel-body">
    
                      <form action="../formForgotPassword" id="register-form" role="form" autocomplete="off" class="form" method="post">
    
                      <div class="form-group">
                        <i class="fa fa-envelope fa-fw "></i>
                        <input class="input-field" type="text" placeholder="enter your email"  name="inputEmail" id="email2">
                                <span id="email2" class="text-danger" ></span>
                      </div>
                      <div class="form-group">
                          <input name="recover-submit" class="btn btn-lg btn-default btn-block" value="Reset Password" type="submit">
                      </div>
                      
                      <input type="hidden" class="hide" name="token" id="token" value=""> 
                    </form>
                  </div>
                </div>
              </div>
            </div>
                    <div class="alert alert-danger">
                          <p>We have e-mailed your password reset link!</p>
                      </div>
          </div>
	</div>
      </div>
    </body>
</html>
