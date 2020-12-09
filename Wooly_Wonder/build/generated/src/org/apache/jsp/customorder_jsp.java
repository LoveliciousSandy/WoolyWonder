package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Pojos.ProductSize;
import hibernate.HibernateSession;
import org.hibernate.Session;
import Pojos.ProductRequest;
import Servlet.Login;
import Pojos.Account;

public final class customorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

     Session s = HibernateSession.getSession();
ProductRequest pr =  hibernate.HibernateSession.Load(s, ProductRequest.class, request.getParameter("pid"));
    Account a = Login.getLoggedInAccount(request.getSession());
    if (a == null) {
        response.sendRedirect(request.getContextPath() + "/Login_Signup/Login.jsp");
        
     
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "defaultnavbar.jsp", out, false);
      out.write("  \n");
      out.write("      ");

        } else {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FixedTopNavBar.jsp", out, false);
      out.write("\n");
      out.write("        ");
 }
        
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Links/Links.jsp", out, false);
      out.write("\n");
      out.write("        <link href=\"CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\"><div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-8\"><br><br><br><br><br><br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                          \n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                    <br><br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-4\"> \n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div><br><br><br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-3\" for=\"pqty\">Size</label>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br><br><br><br><br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-sm-3\" for=\"pqty\">Colours</label>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
