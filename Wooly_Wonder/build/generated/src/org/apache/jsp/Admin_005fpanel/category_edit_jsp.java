package org.apache.jsp.Admin_005fpanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.Session;
import java.util.Set;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.FetchMode;
import Pojos.ProductSubcategory;
import java.util.List;
import Pojos.ProductCategory;
import hibernate.HibernateSession;
import org.hibernate.Criteria;

public final class category_edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Session s = HibernateSession.getSession();
    Criteria c1 = s.createCriteria(ProductCategory.class);
    c1.addOrder(Order.asc("id"));
    c1.add(Restrictions.eq("status", "Active"));
    List<ProductCategory> pcl = c1.list();


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
      out.write("            <style>\n");
      out.write("\n");
      out.write("                .btn-default-create{\n");
      out.write("                    background-color: black;\n");
      out.write("                    color: white;\n");
      out.write("                    width: 150px\n");
      out.write("                }\n");
      out.write("                #rect{\n");
      out.write("                    border:1px solid gray;\n");
      out.write("                    width:161px; \n");
      out.write("                    height:100px; \n");
      out.write("                    float:right; \n");
      out.write("                    margin-right: 400px;\n");
      out.write("                    margin-top:10px;\n");
      out.write("                }\n");
      out.write("            </style> \n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>     \n");
      out.write("            <div class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("                <div class=\"container-fluid row\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\" style=\"padding: 0px 40px 0px 0px;\">\n");
      out.write("                        <li><a href=\"adminpanel.jsp\"><i class=\"fa fa-home fa-fw fa-lg\"></i></a></li>\n");
      out.write("                        <li> \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <button class=\" btn btn-default dropdown-toggle\" id=\"ddb\" data-toggle=\"dropdown\">Catalog<i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("\n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                    <li><a href=\"#\">Categories<p>View,add & edit Category</p></a></li>\n");
      out.write("                                    <li><a href=\"#\">Products<p>View,add & edit Category</p></a></li>\n");
      out.write("                                    <li><a href=\"#\">Shipments</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li> \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <button class=\" btn btn-default dropdown-toggle\" id=\"ddb\" data-toggle=\"dropdown\">Products<i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("\n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\n");
      out.write("                                    <li><a href=\"category.manage.jsp\">Category<p>View,add & edit Category</p></a></li>\n");
      out.write("                                    <li><a href=\"products.manage.jsp\">Products<p>View,add & edit Products</p></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
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
      out.write("                <div class=\"divider\" style=\"\"  >\n");
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
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div class=\" container row\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <ul class=\"nav nav-tabs\">\n");
      out.write("                        <li class=\"active\"><a data-toggle=\"tab\" href=\"#Categories\">Categories</a></li>\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#Sizers\">Sizers </a></li>\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#Colours\">Colours</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\" container row\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                ");
 if (request.getParameter("msg") != null && request.getParameter("msg").equals("0")) {
      out.write("\n");
      out.write("                <div class=\"alert alert-danger alert-dismissible\" id=\"co\">\n");
      out.write("                    <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\" onclick=\"$(co).hide()\">&times;</a>\n");
      out.write("                    <center>Same Colour</center>\n");
      out.write("                </div>\n");
      out.write("                ");
 }
      out.write(" \n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div id=\"Categories\" class=\"tab-pane fade in active\" style=\"background-color: white\">\n");
      out.write("                        <form action=\"../category_save?action=category\" method=\"POST\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            ");
   ProductSubcategory l1 = HibernateSession.Load(s, ProductSubcategory.class, request.getParameter("cu")); 
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"name\">Category Name:</label>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" required=\"\" name=\"cname\" value=");
      out.print( l1.getProductCategory().getName());
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"sel1\">Category Location:</label>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <select class=\"form-control\" id=\"ccategory\" name=\"ccategory\">\n");
      out.write("\n");
      out.write("                                        <option value=\"0\">");
      out.print(l1.getSubcategory() );
      out.write("</option>\n");
      out.write("                                        <option value=\"1\">-Select Category-</option>\n");
      out.write("                                        ");
for (ProductCategory pc : pcl) {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( pc.getId());
      out.write('"');
      out.write('>');
      out.print( pc.getName());
      out.write("</option>\n");
      out.write("                                        ");

                                            Set<ProductSubcategory> pscs = pc.getProductSubcategories();
                                            for (ProductSubcategory psc : pscs) {
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( psc.getId());
      out.write("\">&emsp;- ");
      out.print( psc.getSubcategory());
      out.write("</option>\n");
      out.write("                                        ");

                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"cstatus\">Status</label>\n");
      out.write("                                <div class=\"col-sm-4\" >\n");
      out.write("\n");
      out.write("                                    <input type=\"radio\" name=\"status\" value=\"Active\" required=\"\">Active\n");
      out.write("                                    <input type=\"radio\" name=\"status\" value=\"Disable\" required=\"\">Disable\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\"></label>\n");
      out.write("                                <div class=\"col-sm-1\">\n");
      out.write("                                    <button class=\"btn btn-default-create  form-control\">Create</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"Sizers\" class=\"tab-pane fade\">\n");
      out.write("                        <form action=\"../category_save?action=size\" method=\"POST\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"name\">Name:</label>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" required=\"\" name=\"sname\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"sstatus\">Status</label>\n");
      out.write("                                <div class=\"col-sm-4\" >\n");
      out.write("\n");
      out.write("                                    <input type=\"radio\" name=\"status\" value=\"Active\" checked required=\"\">Active\n");
      out.write("                                    <input type=\"radio\" name=\"status\" value=\"Hidden\"required=\"\">Disable\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\"></label>\n");
      out.write("                                <div class=\"col-sm-1\">\n");
      out.write("                                    <button class=\"btn btn-default-create form-control\">Create</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"Colours\" class=\"tab-pane fade\">\n");
      out.write("                        <form action=\"../category_save?action=colour\" method=\"POST\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"name\">Name:</label>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <input id=\"c\" class=\"jscolor\"  onchange=\"update(this.jscolor)\" value=\"\" type=\"text\" class=\"form-control\" required=\"\" name=\"cname\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"rect\" ></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"cstatus\">Status</label>\n");
      out.write("                                <div class=\"col-sm-4\" >\n");
      out.write("                                    <input type=\"radio\" name=\"status\" value=\"Active\" checked required=\"\">Active\n");
      out.write("                                    <input type=\"radio\" name=\"status\" value=\"Hidden\"required=\"\">Disable\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\"></label>\n");
      out.write("                                <div class=\"col-sm-1\">\n");
      out.write("                                    <button class=\"btn btn-default-create form-control\">Create</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function update(jscolor) {\n");
      out.write("                document.getElementById('rect').style.backgroundColor = '#' + jscolor\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

    s.close();

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
