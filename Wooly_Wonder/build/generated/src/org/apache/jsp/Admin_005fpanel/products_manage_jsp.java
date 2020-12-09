package org.apache.jsp.Admin_005fpanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import hibernate.HibernateSession;
import Pojos.Product;

public final class products_manage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Admin_panel/adminpanelnavbar.jsp");
  }

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

    Session s = HibernateSession.getSession();

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
      out.write("        <link href=\"../CSS/adminpanelnavbar.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            #productcheck{\n");
      out.write("                width: 18px;\n");
      out.write("                height: 18px;\n");
      out.write("                margin-right: 15px;\n");
      out.write("            }\n");
      out.write("            #controls{\n");
      out.write("             float: right; margin-right: 10px;  \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("         <link href=\"../CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("          <link href=\"../CSS/adminpanelnavbar.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("     #dropmenuparastyle{\n");
      out.write("                    font-size:11px;\n");
      out.write("                }\n");
      out.write("                #ddb{\n");
      out.write("                    color: white;\n");
      out.write("                }\n");
      out.write("                .navbar{\n");
      out.write("/*                    background-color: #e91f1e;\n");
      out.write("                    opacity: 0.8;*/\n");
      out.write("                }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("                <div class=\"container-fluid row\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\" style=\"padding: 0px 40px 0px 50px;\">\n");
      out.write("                        <li><a href=\"adminpanel.jsp\"><i class=\"fa fa-home fa-fw fa-2x\"></i></a></li>\n");
      out.write("                        <li> \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <button class=\" btn btn-default dropdown-toggle\" id=\"ddb\" data-toggle=\"dropdown\">Catalog<i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("                                \n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                    <li><a href=\"category.manage.jsp\">Categories<br><p id=\"dropmenuparastyle\">View Product Categories which<br> are used to group<br> products in your store</p></a></li>\n");
      out.write("                                    <li><a href=\"products.manage.jsp\">Products<p id=\"dropmenuparastyle\">View, Add & Edit Products<br> that are shown to<br> visitors of your store</p></a></li>\n");
      out.write("<!--                                    <li><a href=\"#\">Shipments</a></li>-->\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("<!--                        <li> \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <button class=\" btn btn-default dropdown-toggle\" id=\"ddb\" data-toggle=\"dropdown\">Products<i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("\n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\n");
      out.write("                                    <li><a href=\"#\"><p></p></a></li>\n");
      out.write("                                    <li><a href=\"\">Products<p>View,add & edit Products</p></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>-->\n");
      out.write("                        <li> \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <button class=\" btn btn-default dropdown-toggle\" id=\"ddb\" data-toggle=\"dropdown\">Customers<i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("\n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                    <li><a href=\"#\">Administrators</a></li>\n");
      out.write("                                    <li><a href=\"#\">Customers</a></li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!--                bottom nav-->\n");
      out.write("\n");
      out.write("<!--                <div class=\"divider\" style=\"\"  >\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container-fluid row\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\"  id=\"downnavba\">\n");
      out.write("                        <li>\n");
      out.write("                            <button class=\" btn btn-default btn-sm\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"back\">\n");
      out.write("                                <i class=\"fa fa-arrow-left fa-fw \" ></i>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <label id=\"apname\">Add Catalog</label>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>-->\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <button  id=\"controls\" onclick=\"window.location = 'products.add.jsp'\" id=\"addcategory\" class=\"btn btn-success\" data-toggle=\"tooltip\" title=\"Add New Product\"><i class=\"fa fa-plus fa-lg fa-fw\"></i></button>\n");
      out.write("            <button  id=\"controls\" onclick=\"window.location.reload()\"  id=\"addcategory\" class=\"btn btn-info\" data-toggle=\"tooltip\" title=\"Refresh\"><i class=\"fa fa-retweet fa-fw\"></i></button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("        \n");
      out.write("                <div class=\"col-sm-9\" style=\"margin-left: 80px;\">\n");
      out.write("                    <table class=\"table table-hover\" id=\"tableproduct\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Product</th>\n");
      out.write("                                <th>Category </th>\n");
      out.write("                                <th>Sub category </th>\n");
      out.write("                                <th>Price</th>\n");
      out.write("                                <th>Qty</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");
  Criteria c1 = s.createCriteria(Product.class);
                            List<Product> l1 = c1.list();
                            for (Product p : l1) {
                        
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr style=\"height: 50px;\">\n");
      out.write("                                <td>\n");
      out.write("<!--                                    <input type=\"checkbox\"  id=\"productcheck\">-->\n");
      out.write("                                    ");
      out.print( p.getName());
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print(p.getProductCategory().getName());
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print( p.getProductSubcategory().getSubcategory());
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print(p.getPrice());
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print(p.getQty());
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print(p.getStatus());
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>   \n");
      out.write("                                    <a href=\"../productmanage?action=active&v1=");
      out.print(p.getId());
      out.write("\">\n");
      out.write("                                        <button id=\"activecolour\" class=\"btn btn-success\" data-toggle=\"tooltip\" title=\"Active\"><i class=\"fa fa-unlock fa-1x fa-fw\"></i></button>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"../productmanage?action=disable&v2=");
      out.print(p.getId());
      out.write("\">\n");
      out.write("                                        <button id=\"disablecolour\" class=\"btn btn-danger\" data-toggle=\"tooltip\" title=\"Disable\"><i class=\"fa fa-lock fa-1x fa-fw\"></i></button>\n");
      out.write("                                    </a>\n");
      out.write("                                        <a href=\"../Admin_panel/products.update.jsp?update=");
      out.print(p.getId());
      out.write("\">\n");
      out.write("                                        <button id=\"editcolour\" class=\"btn btn-warning\" data-toggle=\"tooltip\" title=\"Edit\"><i class=\"fa fa-pencil fa-1x fa-fw\"></i></button>\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
