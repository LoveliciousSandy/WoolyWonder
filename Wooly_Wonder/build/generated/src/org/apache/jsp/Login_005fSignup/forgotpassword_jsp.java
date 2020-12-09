package org.apache.jsp.Login_005fSignup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"../CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("             margin: 110px;;\n");
      out.write("            }\n");
      out.write("            .input-field {\n");
      out.write("                width: 70%;\n");
      out.write("                padding: 10px;\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("                border-bottom:2px solid #ccc;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .input-field:focus {\n");
      out.write("                border-bottom: 2px solid red;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn {\n");
      out.write("                 background-color:  red;\n");
      out.write("                color: white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("                 .btn:hover {\n");
      out.write("                background-color:black;\n");
      out.write("                color: red;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("              <div class=\"panel-body\">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                  <h3><i class=\"fa fa-lock fa-4x\"></i></h3>\n");
      out.write("                  <h2 class=\"text-center\" style=\"color: red\">Forgot Password?</h2>\n");
      out.write("                  <p>Enter your email address we will sent you the password reset link.</p>\n");
      out.write("                  <div class=\"panel-body\">\n");
      out.write("    \n");
      out.write("                      <form action=\"../formForgotPassword\" id=\"register-form\" role=\"form\" autocomplete=\"off\" class=\"form\" method=\"post\">\n");
      out.write("    \n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <i class=\"fa fa-envelope fa-fw \"></i>\n");
      out.write("                        <input class=\"input-field\" type=\"text\" placeholder=\"enter your email\"  name=\"inputEmail\" id=\"email2\">\n");
      out.write("                                <span id=\"email2\" class=\"text-danger\" ></span>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <input name=\"recover-submit\" class=\"btn btn-lg btn-default btn-block\" value=\"Reset Password\" type=\"submit\">\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <input type=\"hidden\" class=\"hide\" name=\"token\" id=\"token\" value=\"\"> \n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                      <div class=\"alert alert-danger\">\n");
      out.write("                          <p>We have e-mailed your password reset link!</p>\n");
      out.write("                      </div>\n");
      out.write("          </div>\n");
      out.write("\t</div>\n");
      out.write("      </div>\n");
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
