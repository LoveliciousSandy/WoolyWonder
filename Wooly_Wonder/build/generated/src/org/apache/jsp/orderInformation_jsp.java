package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Pojos.Orders;
import hibernate.HibernateSession;
import org.hibernate.Session;

public final class orderInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Links/Links.jsp", out, false);
      out.write("\n");
      out.write("        <link href=\"CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\"></div>\n");
      out.write("         <h2 style=\"margin-left: 60px;\">My Order Details</h2>\n");
      out.write("        ");
 
        Session s = HibernateSession.getSession();
      Orders order=  HibernateSession.Load(s,Orders.class,request.getParameter("oid"));
 
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <h3 style=\"margin-left: 0px; padding-left:40px; \"><i class=\"fa fa-shopping-cart\"></i>Order ID:#");
      out.print(order.getId());
      out.write("</h3>\n");
      out.write("        <h4 style=\"margin-left: 0px; padding-left:40px; \">");
      out.print( order.getDatetime() );
      out.write("</h4>\n");
      out.write("        <h3 style=\"margin-left: 0px; padding-left:40px; \">Order Status:");
      out.print( order.getStatus() );
      out.write("</h3>\n");
      out.write("    <hr>\n");
      out.write("        <h3 style=\"margin-left: 0px; padding-left:40px; \">Customer Information</h3>\n");
      out.write("        <div class=\"\"></div>\n");
      out.write("    \n");
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
