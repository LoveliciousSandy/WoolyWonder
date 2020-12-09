package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Links/Links.jsp", out, false);
      out.write("\n");
      out.write("        <link href=\"CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <footer class=\"section footer-classic context-dark bg-image\" style=\"background: #2d3246;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row row-30\">\n");
      out.write("            <div class=\"col-md-4 col-xl-5\">\n");
      out.write("              <div class=\"pr-xl-4\"><a class=\"brand\" href=\"index.html\"><img class=\"brand-logo-light\" src=\"images/agency/logo-inverse-140x37.png\" alt=\"\" width=\"140\" height=\"37\" srcset=\"images/agency/logo-retina-inverse-280x74.png 2x\"></a>\n");
      out.write("                <p>We are an award-winning creative agency, dedicated to the best result in web design, promotion, business consulting, and marketing.</p>\n");
      out.write("                <!-- Rights-->\n");
      out.write("                <p class=\"rights\"><span>©  </span><span class=\"copyright-year\">2018</span><span> </span><span>Waves</span><span>. </span><span>All Rights Reserved.</span></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("              <h5>Contacts</h5>\n");
      out.write("              <dl class=\"contact-list\">\n");
      out.write("                <dt>Address:</dt>\n");
      out.write("                <dd>798 South Park Avenue, Jaipur, Raj</dd>\n");
      out.write("              </dl>\n");
      out.write("              <dl class=\"contact-list\">\n");
      out.write("                <dt>email:</dt>\n");
      out.write("                <dd><a href=\"mailto:#\">dkstudioin@gmail.com</a></dd>\n");
      out.write("              </dl>\n");
      out.write("              <dl class=\"contact-list\">\n");
      out.write("                <dt>phones:</dt>\n");
      out.write("                <dd><a href=\"tel:#\">+91 7568543012</a> <span>or</span> <a href=\"tel:#\">+91 9571195353</a>\n");
      out.write("                </dd>\n");
      out.write("              </dl>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-xl-3\">\n");
      out.write("              <h5>Links</h5>\n");
      out.write("              <ul class=\"nav-list\">\n");
      out.write("                <li><a href=\"#\">About</a></li>\n");
      out.write("                <li><a href=\"#\">Projects</a></li>\n");
      out.write("                <li><a href=\"#\">Blog</a></li>\n");
      out.write("                <li><a href=\"#\">Contacts</a></li>\n");
      out.write("                <li><a href=\"#\">Pricing</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row no-gutters social-container\">\n");
      out.write("          <div class=\"col\"><a class=\"social-inner\" href=\"#\"><span class=\"icon mdi mdi-facebook\"></span><span>Facebook</span></a></div>\n");
      out.write("          <div class=\"col\"><a class=\"social-inner\" href=\"#\"><span class=\"icon mdi mdi-instagram\"></span><span>instagram</span></a></div>\n");
      out.write("          <div class=\"col\"><a class=\"social-inner\" href=\"#\"><span class=\"icon mdi mdi-twitter\"></span><span>twitter</span></a></div>\n");
      out.write("          <div class=\"col\"><a class=\"social-inner\" href=\"#\"><span class=\"icon mdi mdi-youtube-play\"></span><span>google</span></a></div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
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
