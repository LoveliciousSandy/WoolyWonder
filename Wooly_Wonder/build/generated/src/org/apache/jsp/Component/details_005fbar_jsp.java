package org.apache.jsp.Component;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class details_005fbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        body{\n");
      out.write("            font-family: Comic Sans MS;\n");
      out.write("            background-image: url(\"../img/b1.jpg\");\n");
      out.write("           \n");
      out.write("\n");
      out.write("        }\n");
      out.write("        #detailsbar{\n");
      out.write("            /*                background-color: #cccccc;*/\n");
      out.write("            margin-top: 25px;\n");
      out.write("            position: fixed;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 70px;\n");
      out.write("            border: none;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        #apname{\n");
      out.write("            padding: 30px;\n");
      out.write("            font-size: x-large;\n");
      out.write("            font-style: normal;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"container\" id=\"detailsbar\">\n");
      out.write("       <button  class=\"btn btn-default\">Save\n");
      out.write("                            </button>&emsp;<button  class=\"btn btn-default\">Save\n");
      out.write("                            </button>&emsp;\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"nav navbar-left\" style=\"padding: 0px 0px 30px 30px;\">\n");
      out.write("                    <button class=\" btn btn-default btn-sm\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"back\">\n");
      out.write("                        <i class=\"fa fa-arrow-left fa-fw \" ></i>\n");
      out.write("                    </button>\n");
      out.write("                    <label id=\"apname\">Products</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav navbar-right\" style=\"padding: 30px 110px 0px 0px;\">\n");
      out.write("                    <a href=\"products.add.jsp\">\n");
      out.write("                        <button class=\"btn btn-default btn-sm\" id=\"addbtn\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Add Products\">\n");
      out.write("                            <i class=\"fa fa-plus fa-fw \"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-default btn-sm\" id=\"addbtn\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Add Products\">\n");
      out.write("                        <i class=\"fa fa-plus fa-fw \"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <label>\n");
      out.write("                        <form action=\"index.jsp\" method=\"POST\">\n");
      out.write("                            <button class=\"btn btn-default\">Save\n");
      out.write("                            </button>\n");
      out.write("                        </form>\n");
      out.write("                    </label>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("            });\n");
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
