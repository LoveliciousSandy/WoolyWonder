package org.apache.jsp.Admin_005fpanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Links/Links.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        /* Bordered form */\n");
      out.write("        form {\n");
      out.write("            border: 3px solid #f1f1f1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Full-width inputs */\n");
      out.write("        input[type=text], input[type=password] {\n");
      out.write("           \n");
      out.write("            padding: 12px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            display: inline-block;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Set a style for all buttons */\n");
      out.write("        button {\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add a hover effect for buttons */\n");
      out.write("        button:hover {\n");
      out.write("            opacity: 0.8;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Extra style for the cancel button (red) */\n");
      out.write("        .cancelbtn {\n");
      out.write("            width: auto;\n");
      out.write("            padding: 10px 18px;\n");
      out.write("            background-color: #f44336;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Center the avatar image inside this container */\n");
      out.write("        .imgcontainer {\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 24px 0 12px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        /* Add padding to containers */\n");
      out.write("        .container {\n");
      out.write("            padding: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* The \"Forgot password\" text */\n");
      out.write("        span.psw {\n");
      out.write("          \n");
      out.write("           \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Change styles for span and cancel button on extra small screens */\n");
      out.write("        @media screen and (max-width: 300px) {\n");
      out.write("            span.psw {\n");
      out.write("                display: block;\n");
      out.write("                float: none;\n");
      out.write("            }\n");
      out.write("            .cancelbtn {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("    <form action=\"action_page.php\">\n");
      out.write("        <div class=\"imgcontainer\">\n");
      out.write("            <i class=\"fa fa-fa-lock\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <label for=\"uname\"><b>Username</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required><br>\n");
      out.write("\n");
      out.write("            <label for=\"psw\"><b>Password</b></label>\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required><br>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Login</button><br>\n");
      out.write("            <label>\n");
      out.write("                <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\n");
      out.write("            </label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("</body>\n");
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
