package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Pojos.ProductSubcategory;
import Pojos.ProductImage;
import java.util.Set;
import org.hibernate.SQLQuery;
import Pojos.Orders;
import Pojos.ProductCategory;
import java.util.Locale;
import java.util.Locale.Category;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import Pojos.Product;
import org.hibernate.Session;
import hibernate.HibernateSession;
import Servlet.Login;
import Pojos.Account;

public final class category_dress_frock_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    Session ss = HibernateSession.getSession();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Links/Links.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    ");

        Account acc = Login.getLoggedInAccount(request.getSession());
        if (acc == null) {

    
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "defaultnavbar.jsp", out, false);
      out.write("  \n");
      out.write("    ");
        } else {
    
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FixedTopNavBar.jsp", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wel well-lg\">hfhf</div><br><br>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"margin-left: 0; padding-left: 40px;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <div class=\"panel panel-danger\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\">Nmae</h3>\n");
      out.write("                                    <span class=\"pull-right clickable\"><i class=\"glyphicon glyphicon-chevron-up\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <div class=\"form-row\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\">hfuhfh</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel panel-danger\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\">Price</h3>\n");
      out.write("                                    <span class=\"pull-right clickable\"><i class=\"glyphicon glyphicon-chevron-up\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <div class=\"form-row\">\n");
      out.write("                                        <div class=\"form-group col-md-6\">\n");
      out.write("                                            <label>Min</label>\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"$0\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group col-md-6 text-right\">\n");
      out.write("                                            <label>Max</label>\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" placeholder=\"$1,0000\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel panel-danger\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\">Colours</h3>\n");
      out.write("                                    <span class=\"pull-right clickable\"><i class=\"glyphicon glyphicon-chevron-up\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <div class=\"form-row\">\n");
      out.write("                                        <label class=\"form-check\">\n");
      out.write("                                            <input class=\"form-check-input\" type=\"checkbox\" value=\"\">\n");
      out.write("                                            <span class=\"form-check-label\">\n");
      out.write("                                                Mersedes Benz\n");
      out.write("                                            </span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel panel-danger\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\">Sizes</h3>\n");
      out.write("                                    <span class=\"pull-right clickable\"><i class=\"glyphicon glyphicon-chevron-up\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <div class=\"form-row\">\n");
      out.write("                                        <label class=\"form-check\">\n");
      out.write("                                            <input class=\"form-check-input\" type=\"radio\" name=\"size\">\n");
      out.write("                                            <span class=\"form-check-label\">\n");
      out.write("                                                Mersedes Benz\n");
      out.write("                                            </span>\n");
      out.write("                                        </label> \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("         <div class=\"container\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"col-sm-3\" style=\"background-color: white\">\n");
      out.write("                                        <div class=\"card\" id=\"imagecard\">\n");
      out.write("                                            <a href=\"index.jsp\">\n");
      out.write("                                                ");

                            Criteria cc = HibernateSession.createCriteria(HibernateSession.getSession(), Product.class);
                         
                            List<Product> product = cc.list();
                            for (Product p : product) {
                            
                        
      out.write("\n");
      out.write("                                                ");

                                                    ProductImage pi = (ProductImage) p.getProductImages().iterator().next();
                                                
      out.write("\n");
      out.write("                                                <img src=");
      out.print( pi.getUrl());
      out.write("  alt=\"imge\" width=\"250\" height=\"270\" style=\"border:1px solid gray\"/>\n");
      out.write("\n");
      out.write("                                            </a><br>\n");
      out.write("                                            <span id=\"pricetag\">Rs:");
      out.print( p.getPrice());
      out.write("/=</span><br>\n");
      out.write("                                            <span>");
      out.print( p.getName());
      out.write("</span><br>\n");
      out.write("                                            <button id=\"viewdetails\" class=\" btn btn-default\" onclick=\"viewdetails(");
      out.print(p.getId());
      out.write(")\">View Details</button><br>\n");
      out.write("                                            <label></label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");
  }
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                <script>\n");
      out.write("                    $(document).on('click', '.panel-heading span.clickable', function (e) {\n");
      out.write("                        var $this = $(this);\n");
      out.write("                        if (!$this.hasClass('panel-collapsed')) {\n");
      out.write("                            $this.parents('.panel').find('.panel-body').slideUp();\n");
      out.write("                            $this.addClass('panel-collapsed');\n");
      out.write("                            $this.find('i').removeClass('glyphicon-chevron-up').addClass('glyphicon-chevron-down');\n");
      out.write("                        } else {\n");
      out.write("                            $this.parents('.panel').find('.panel-body').slideDown();\n");
      out.write("                            $this.removeClass('panel-collapsed');\n");
      out.write("                            $this.find('i').removeClass('glyphicon-chevron-down').addClass('glyphicon-chevron-up');\n");
      out.write("                        }\n");
      out.write("                    })\n");
      out.write("                </script>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
