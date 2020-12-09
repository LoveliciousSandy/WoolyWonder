package org.apache.jsp.Admin_005fpanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Pojos.Account;
import Servlet.Login;

public final class adminpanelnavbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Account loggedInAcc = Login.getLoggedInAccount(session);
    if (loggedInAcc == null || loggedInAcc.getId() >= 0) {
        response.sendRedirect(request.getContextPath() + "/Login_Signup/Login.jsp");
        return;
    }

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
      out.write("            <link href=\"../CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("            <link href=\"../CSS/adminpanelnavbar.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        </head>\n");
      out.write("        <style>\n");
      out.write("            #dropmenuparastyle{\n");
      out.write("                font-size:11px;\n");
      out.write("            }\n");
      out.write("            #ddb{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .navbar{\n");
      out.write("                /*                    background-color: #e91f1e;\n");
      out.write("                                    opacity: 0.8;*/\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid row\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-left\" style=\"padding: 0px 40px 0px 50px;\">\n");
      out.write("                    <li><a href=\"adminpanel.jsp\"><i class=\"fa fa-home fa-fw fa-2x\"></i></a></li>\n");
      out.write("                    <li> \n");
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <button class=\" btn btn-default dropdown-toggle\" id=\"ddb\" data-toggle=\"dropdown\">Catalog<i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <li><a href=\"category.manage.jsp\">Categories<br><p id=\"dropmenuparastyle\">View Product Categories which<br> are used to group<br> products in your store</p></a></li>\n");
      out.write("                                <li><a href=\"products.manage.jsp\">Products<p id=\"dropmenuparastyle\">View, Add & Edit Products<br> that are shown to<br> visitors of your store</p></a></li>\n");
      out.write("                                <!--                                    <li><a href=\"#\">Shipments</a></li>-->\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li> \n");
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <button class=\" btn btn-default dropdown-toggle\" id=\"ddb\" data-toggle=\"dropdown\">Sales<i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\n");
      out.write("                                <li><a href=\" order.manage.jsp\">Orders<br><p id=\"dropmenuparastyle\">View Products and print<br> invoice slips for orders<br> <br> </p></a></li>\n");
      out.write("                                <li><a href=\"custom.order.manage.jsp\">Custom Orders<p id=\"dropmenuparastyle\">View Custom orders</p></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <!--                        <li> \n");
      out.write("                                                <div class=\"dropdown\">\n");
      out.write("                                                    <button class=\" btn btn-default dropdown-toggle\" id=\"ddb\" data-toggle=\"dropdown\">Customers<i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("                    \n");
      out.write("                                                    <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                                        <li><a href=\"#\">Administrators</a></li>\n");
      out.write("                                                        <li><a href=\"#\">Customers</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                    \n");
      out.write("                                                </div>\n");
      out.write("                    \n");
      out.write("                                            </li>-->\n");
      out.write("                    <li  class=\"dropdown\" style=\"margin-left: 900px;\">\n");
      out.write("                        <a href=\"\"><i class=\"fa fa-user fa-fw fa-lg\"></i><i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\n");
      out.write("                            <li><span style=\"padding-left: 20px;\">My Account</span></li>\n");
      out.write("                            <li><a href=\"#\">Profile Setting</a></li>\n");
      out.write("                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Admin_panel/admin.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--                bottom nav-->\n");
      out.write("\n");
      out.write("        <!--                <div class=\"divider\" style=\"\"  >\n");
      out.write("        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"container-fluid row\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-left\"  id=\"downnavba\">\n");
      out.write("                                <li>\n");
      out.write("                                    <button class=\" btn btn-default btn-sm\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"back\">\n");
      out.write("                                        <i class=\"fa fa-arrow-left fa-fw \" ></i>\n");
      out.write("                                    </button>\n");
      out.write("        \n");
      out.write("                                    <label id=\"apname\">Add Catalog</label>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>-->\n");
      out.write("    </div>\n");
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
