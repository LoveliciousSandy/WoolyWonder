package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Servlet.Login;
import Pojos.Account;

public final class userprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    Account acc = Login.getLoggedInAccount(request.getSession());
    if (acc == null) {
        response.sendRedirect(request.getContextPath() + "/Login_Signup/Login.jsp");
        return;
    } else {
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FixedTopNavBar.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Links/Links.jsp", out, false);
      out.write("\n");
      out.write("        <link href=\"CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            /*                accordian*/\n");
      out.write("            /* Style the buttons that are used to open and close the accordion panel */\n");
      out.write("            .accordion {\n");
      out.write("                background-color: #eee;\n");
      out.write("                color: #444;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 18px;\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: left;\n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                transition: 0.4s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add a background color to the button if it is clicked on (add the .active class with JS), and when you move the mouse over it (hover) */\n");
      out.write("            .active, .accordion:hover {\n");
      out.write("                background-color: #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the accordion panel. Note: hidden by default */\n");
      out.write("            .panel {\n");
      out.write("                padding: 0 18px;\n");
      out.write("                background-color: white;\n");
      out.write("                display: none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #pagebody{\n");
      out.write("                margin: 0px 50px 50px 50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #update,#update2{\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            #f{\n");
      out.write("                background-color: lightgrey;\n");
      out.write("                height: 90px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br> \n");
      out.write("        <div class= container-fluid\" id=\"f\">\n");
      out.write("            <div class=\"wel well-lg\">\n");
      out.write("                <center>\n");
      out.write("                    <h2 style=\"margin-left: 60px;\">My Account</h2></center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        ");
if (request.getParameter("msg") != null && request.getParameter("msg").equals("1")) {
      out.write("\n");
      out.write("        <div class=\"alert alert-danger alert-dismissible\" id=\"ui\">\n");
      out.write("            <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\" onclick=\"$(ui).hide()\">&times;</a>\n");
      out.write("            <center>User Information Updated</center>\n");
      out.write("        </div>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("        ");
if (request.getParameter("msg") != null && request.getParameter("msg").equals("0")) {
      out.write("\n");
      out.write("        <div class=\"alert alert-danger alert-dismissible\" id=\"ui\">\n");
      out.write("            <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\" onclick=\"$(ui).hide()\">&times;</a>\n");
      out.write("            <center>Invalid password</center>\n");
      out.write("        </div>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("        ");
if (request.getParameter("msg") != null && request.getParameter("msg").equals("2")) {
      out.write("\n");
      out.write("        <div class=\"alert alert-danger alert-dismissible\" id=\"ui\">\n");
      out.write("            <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\" onclick=\"$(ui).hide()\">&times;</a>\n");
      out.write("            <center>Password Updated</center>\n");
      out.write("        </div>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\" id=\"pagebody\">\n");
      out.write("            <button class=\"accordion\"><h4>My Personal Info<i class=\"fa fa-angle-down fa-fw fa-lg\"></i></h4></button>\n");
      out.write("            <div class=\"panel\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <form action=\"userprofile?action=in\" method=\"POST\" onsubmit=\"return validation();\">\n");
      out.write("\n");
      out.write("                    <span>It's all about you!</span><br><br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"name\">Username:</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <label id=\"username\" type=\"text\" class=\"form-control\" required=\"\" name=\"uname\">");
      out.print(acc.getUsername());
      out.write("</label>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"name\">Email:</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <label id=\"email\" type=\"text\" class=\"form-control\" name=\"email\" >");
      out.print(acc.getEmail());
      out.write("</label>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"name\">Telephone:</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <input id=\"telephone\" type=\"text\" class=\"form-control\"  name=\"tp\" value=\"");
      out.print( acc.getPhone());
      out.write("\">\n");
      out.write("                            <span id=\"telephone1\" class=\"text-danger\"></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br><br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\"></label>\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <button  type=\"submit\" class=\"btn btn-danger form-control\" id=\"update\" >Update</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"userprofile?action=pw\" method=\"POST\" onsubmit=\"return  validation();\">\n");
      out.write("                <button class=\"accordion\"><h4>My Password<i class=\"fa fa-angle-down fa-fw fa-lg\"></i></h4></button>\n");
      out.write("                <div class=\"panel\">\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <span>It's all about you!</span><br><br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"name\">Email:</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <label type=\"text\" class=\"form-control\" name=\"email\" va>");
      out.print(acc.getEmail());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"sstatus\">Current Password</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\"  name=\"p1\">\n");
      out.write("                            <span id=\"p1\" class=\"text-danger\"></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"sstatus\">New Password</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\"  name=\"p2\">\n");
      out.write("                            <span id=\"p2\" class=\"text-danger\"></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div><br><br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\"></label>\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-danger\" id=\"update2\">Update</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var acc = document.getElementsByClassName(\"accordion\");\n");
      out.write("            var i;\n");
      out.write("\n");
      out.write("            for (i = 0; i < acc.length; i++) {\n");
      out.write("                acc[i].addEventListener(\"click\", function () {\n");
      out.write("                    /* Toggle between adding and removing the \"active\" class,\n");
      out.write("                     to highlight the button that controls the panel */\n");
      out.write("                    this.classList.toggle(\"active\");\n");
      out.write("\n");
      out.write("                    /* Toggle between hiding and showing the active panel */\n");
      out.write("                    var panel = this.nextElementSibling;\n");
      out.write("                    if (panel.style.display === \"block\") {\n");
      out.write("                        panel.style.display = \"none\";\n");
      out.write("                    } else {\n");
      out.write("                        panel.style.display = \"block\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            acc[0].click();\n");
      out.write("            acc[1].click();\n");
      out.write("         \n");
      out.write("\n");
      out.write("            function validation() {\n");
      out.write("                var tp = document.getElementById(\"telephone\").value;\n");
      out.write("                var p1 = document.getElementById(\"p1\").value;\n");
      out.write("                var p2 = document.getElementById(\"p2\").value;\n");
      out.write("\n");
      out.write("                if (tp == \"\") {\n");
      out.write("                    document.getElementById(\"telephone1\").innerHTML = \"**Please fill the telephone no**\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if ((tp.length < 10) || (tp.length > 10)) {\n");
      out.write("                    document.getElementById(\"telephone1\").innerHTML = \"**Please fill the valid telephone no **\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (isNaN(tp)) {\n");
      out.write("                    document.getElementById(\"telephone1\").innerHTML = \"**Please enter numbers**\";\n");
      out.write("                    return false;\n");
      out.write("                } else\n");
      out.write("                    (true);\n");
      out.write("\n");
      out.write("                if (p1) {\n");
      out.write("                    document.getElementById(\"p1\").innerHTML = \"**Please fill the current password**\";\n");
      out.write("                    document.getElementById(\"p2\").innerHTML = \"**Please fill the new password**\";\n");
      out.write("                    return false;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                if ((p1.length || p2.length) <= 5) {\n");
      out.write("                    document.getElementById(\"p1\").innerHTML = \"**Please fill the correct password**\";\n");
      out.write("                    document.getElementById(\"p2\").innerHTML = \"**Please fill the password minimum 6 characters**\";\n");
      out.write("                    return false;\n");
      out.write("\n");
      out.write("                } else\n");
      out.write("                    (true);\n");
      out.write("//               \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
