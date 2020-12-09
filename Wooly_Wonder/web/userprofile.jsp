<%-- 
    Document   : userprofile
    Created on : 25-Jun-2018, 02:42:27
    Author     : Senani
--%>
<%@page import="Servlet.Login"%>
<%@page import="Pojos.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Account acc = Login.getLoggedInAccount(request.getSession());
    if (acc == null) {
        response.sendRedirect(request.getContextPath() + "/Login_Signup/Login.jsp");
        return;
    } else {%>
<jsp:include page="FixedTopNavBar.jsp"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Links/Links.jsp"/>
        <link href="CSS/maincss.css" type="text/css" rel="stylesheet">
        <style>

            /*                accordian*/
            /* Style the buttons that are used to open and close the accordion panel */
            .accordion {
                background-color: #eee;
                color: #444;
                cursor: pointer;
                padding: 18px;
                width: 100%;
                text-align: left;
                border: none;
                outline: none;
                transition: 0.4s;
            }

            /* Add a background color to the button if it is clicked on (add the .active class with JS), and when you move the mouse over it (hover) */
            .active, .accordion:hover {
                background-color: #ccc;
            }

            /* Style the accordion panel. Note: hidden by default */
            .panel {
                padding: 0 18px;
                background-color: white;
                display: none;

            }

            #pagebody{
                margin: 0px 50px 50px 50px;
            }

            #update,#update2{
                background-color: black;
                color: white;
                border: none;
            }
            #f{
                background-color: lightgrey;
                height: 90px;
            }
        </style>
    </head>
    <body>
        <br><br> 
        <div class= container-fluid" id="f">
            <div class="wel well-lg">
                <center>
                    <h2 style="margin-left: 60px;">My Account</h2></center>
            </div>
        </div>
        <br><br>
        <%if (request.getParameter("msg") != null && request.getParameter("msg").equals("1")) {%>
        <div class="alert alert-danger alert-dismissible" id="ui">
            <a href="#" class="close" data-dismiss="alert" aria-label="close" onclick="$(ui).hide()">&times;</a>
            <center>User Information Updated</center>
        </div>
        <% }%>

        <%if (request.getParameter("msg") != null && request.getParameter("msg").equals("0")) {%>
        <div class="alert alert-danger alert-dismissible" id="ui">
            <a href="#" class="close" data-dismiss="alert" aria-label="close" onclick="$(ui).hide()">&times;</a>
            <center>Invalid password</center>
        </div>
        <% }%>
        <%if (request.getParameter("msg") != null && request.getParameter("msg").equals("2")) {%>
        <div class="alert alert-danger alert-dismissible" id="ui">
            <a href="#" class="close" data-dismiss="alert" aria-label="close" onclick="$(ui).hide()">&times;</a>
            <center>Password Updated</center>
        </div>
        <% }%>

        <div class="container-fluid" id="pagebody">
            <button class="accordion"><h4>My Personal Info<i class="fa fa-angle-down fa-fw fa-lg"></i></h4></button>
            <div class="panel">
                <br>
                <br>
                <form action="userprofile?action=in" method="POST" onsubmit=" return  validation();">

                    <span>It's all about you!</span><br><br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="name">Username:</label>
                        <div class="col-sm-5">
                            <label id="username" type="text" class="form-control" required="" name="uname"><%=acc.getUsername()%></label>

                        </div>
                    </div>

                    <br>
                    <br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="name">Email:</label>
                        <div class="col-sm-5">
                            <label id="email" type="text" class="form-control" name="email" ><%=acc.getEmail()%></label>

                        </div>
                    </div>

                    <br>
                    <br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="name">Telephone:</label>
                        <div class="col-sm-5">
                            <input id="telephone" type="text" class="form-control"  name="tp" value="<%= acc.getPhone()%>">
                            <span id="telephone1" class="text-danger"></span>
                        </div>
                    </div>
                    <br><br>
                    <div class="form-group">
                        <label class="control-label col-sm-2"></label>
                        <div class="col-sm-1">
                            <button  type="submit" class="btn btn-danger form-control" id="update" >Update</button>
                        </div>
                    </div>
                    <br>
                    <br>
                </form>
            </div>

            <form action="userprofile?action=pw" method="POST" onsubmit=" return validation();">
                <button type="button" class="accordion"><h4>My Password<i class="fa fa-angle-down fa-fw fa-lg"></i></h4></button>
                <div class="panel">
                    <br>
                    <br>
                    <span>It's all about you!</span><br><br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="name">Email:</label>
                        <div class="col-sm-5">
                            <label type="text" class="form-control" name="email" va><%=acc.getEmail()%></label>
                        </div>
                    </div>

                    <br>
                    <br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="sstatus">Current Password</label>
                        <div class="col-sm-5">
                            <input type="password" class="form-control"  name="p1">
                            <span id="p1" class="text-danger"></span>
                        </div>
                    </div>

                    <br>
                    <br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="sstatus">New Password</label>
                        <div class="col-sm-5">
                            <input type="password" class="form-control"  name="p2">
                            <span id="p2" class="text-danger"></span>
                        </div>
                    </div><br><br>
                    <div class="form-group">
                        <label class="control-label col-sm-2"></label>
                        <div class="col-sm-1">
                            <button type="submit" class="btn btn-danger" id="update2">Update</button>
                        </div>
                    </div>
                    <br>
                    <br>
                </div>
                <% }%>
            </form>
        </div>
        <script>
            var acc = document.getElementsByClassName("accordion");
            var i;

            for (i = 0; i < acc.length; i++) {
                acc[i].addEventListener("click", function () {
                    /* Toggle between adding and removing the "active" class,
                     to highlight the button that controls the panel */
                    this.classList.toggle("active");

                    /* Toggle between hiding and showing the active panel */
                    var panel = this.nextElementSibling;
                    if (panel.style.display === "block") {
                        panel.style.display = "none";
                    } else {
                        panel.style.display = "block";
                    }
                });
            }
            acc[0].click();
           
         

            function validation() {
                var tp = document.getElementById("telephone").value;
                var p1 = document.getElementById("p1").value;
                var p2 = document.getElementById("p2").value;

                if (tp == "") {
                    document.getElementById("telephone1").innerHTML = "**Please fill the telephone no**";
                    return false;
                }
                else if ((tp.length < 10) || (tp.length > 10)) {
                    document.getElementById("telephone1").innerHTML = "**Please fill the valid telephone no **";
                    return false;
                }
                if (isNaN(tp)) {
                    document.getElementById("telephone1").innerHTML = "**Please enter numbers**";
                    return false;
                } else
                    (true);

                if (p1) {
                    document.getElementById("p1").innerHTML = "**Please fill the current password**";
                    document.getElementById("p2").innerHTML = "**Please fill the new password**";
                    return false;

                }
                if ((p1.length || p2.length) <= 5) {
                    document.getElementById("p1").innerHTML = "**Please fill the correct password**";
                    document.getElementById("p2").innerHTML = "**Please fill the password minimum 6 characters**";
                    return false;

                } else
                    (true);
            }
        </script>
    </body>
</html>
