package org.apache.jsp.Admin_005fpanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Pojos.ProductColour;
import Pojos.ProductSubcategory;
import org.hibernate.Hibernate;
import Pojos.ProductSize;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import Pojos.ProductCategory;
import org.hibernate.Session;
import hibernate.HibernateSession;
import Servlet.Login;
import Pojos.Account;
import Servlet.Login;

public final class products_add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Session s = HibernateSession.getSession();
    Criteria c1 = s.createCriteria(ProductCategory.class);

    c1.add(Restrictions.eq("status", "active"));
    List<ProductCategory> pcl = c1.list();

    Criteria c2 = s.createCriteria(ProductSize.class);
    List<ProductSize> psl = c2.list();

    ProductCategory pc = null;
    if (request.getParameter("catid") != null) {
        pc = HibernateSession.Load(s, ProductCategory.class, request.getParameter("catid"));
    }

    Criteria c4 = s.createCriteria(ProductColour.class);
    List<ProductColour> colo = c4.list();

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
      out.write("            #createbutton{\n");
      out.write("                background-color:red;\n");
      out.write("                color: white;\n");
      out.write("                width: 150px;\n");
      out.write("            }\n");
      out.write("            #productsavebutton{\n");
      out.write("                float: right;\n");
      out.write("                margin-right: -40px;\n");
      out.write("            }\n");
      out.write("            #textarea{\n");
      out.write("                resize: none;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 80px;\n");
      out.write("            }\n");
      out.write("            #f{\n");
      out.write("                background-color: lightgrey;\n");
      out.write("                height: 90px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div class= container-fluid\" id=\"f\">\n");
      out.write("            <div class=\"wel well-lg\">\n");
      out.write("                <h2 style=\"margin-left: 60px;\">Product Add</h2>\n");
      out.write("            </div>\n");
      out.write("        </div><br>\n");
      out.write("        <form action=\"../save_product\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <div class=\"container row\">\n");
      out.write("                <div id=\"productsavebutton\">\n");
      out.write("                    <button class=\"btn btn-success\" type=\"submit\"><i class=\"fa fa-save fa-2x\"></i></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <ul class=\"nav nav-tabs\">\n");
      out.write("                        <li class=\"active\"><a data-toggle=\"tab\" href=\"#General\"><h4>General</h4></a></li>\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#Cost\"><h4>Cost</h4></a></li>\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#Image\"><h4>Image</h4></a></li>\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#Request\"><h4>Request</h4></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\" container row\">\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <div class=\"tab-content\">\n");
      out.write("                        <div id=\"General\" class=\"tab-pane fade in active\"><br><br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"Category\">Categories</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <select class=\"form-control\" id=\"pcategory\" name=\"pcategory\" onchange=\"getproductsub();\">\n");
      out.write("                                        <option value=\"0\"> - Select Product Category -</option>\n");
      out.write("                                        ");
 for (ProductCategory pcat : pcl) {
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( pcat.getId());
      out.write('"');
      out.print( pc != null && pc.getId().equals(pcat.getId()) ? " selected" : "");
      out.write('>');
      out.print( pcat.getName());
      out.write("</option>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"Category\">Sub Categories</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <select class=\"form-control\" id=\"psubcategory\" name=\"psubcategory\">\n");
      out.write("                                        <option value=\"0\"> - Select Product Sub Category -</option>\n");
      out.write("                                        ");

                                            if (pc != null) {
                                                Criteria c3 = s.createCriteria(ProductSubcategory.class);
                                                c3.add(Restrictions.eq("productCategory", pc));
                                                List<ProductSubcategory> psc = c3.list();
                                                for (ProductSubcategory c : psc) {
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( c.getId());
      out.write('"');
      out.write('>');
      out.print( c.getSubcategory());
      out.write("</option>\n");
      out.write("                                        ");

                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"pname\">Name*</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"pname\" id=\"pname\" required=\"\" >\n");
      out.write("                                    <span id=\"alertpname\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"pcolour\">Colour</label>\n");
      out.write("                                <div class=\"col-sm-4\"> \n");
      out.write("                                    <select class=\"form-control\" name=\"pcolour\">\n");
      out.write("                                        <option value=\"0\">- Select Colour -</option>\n");
      out.write("                                        ");
 for (ProductColour colour : colo) {
                                        
      out.write("\n");
      out.write("                                        <option value=");
      out.print(colour.getId());
      out.write('>');
      out.print(colour.getName());
      out.write("</option>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"psize\">Size</label>\n");
      out.write("                                <div class=\"col-sm-4\"> \n");
      out.write("                                    <select class=\"form-control\" id=\"psize\" name=\"psize\">\n");
      out.write("                                        <option value=\"0\">-Select Product Size-</option>\n");
      out.write("                                        ");
  for (ProductSize psize : psl) {
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( psize.getId());
      out.write('"');
      out.write('>');
      out.print(psize.getName());
      out.write("</option>\n");
      out.write("                                        ");
 }
                                        
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"pqty\">Quantity</label>\n");
      out.write("                                <div class=\"col-sm-4\"> \n");
      out.write("                                    <input type=\"number\" class=\"form-control\" name=\"pqty\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"pqty\">Status</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("                                    <input type=\"radio\" name=\"status\" checked=\"\" value=\"Active\">Active\n");
      out.write("                                    <input type=\"radio\" name=\"status\" value=\"Disable\">Disable\n");
      out.write("                                </div>\n");
      out.write("                            </div><br><br><br><br>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"Cost\" class=\"tab-pane fade\"><br><br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"pprice\">Price:</label>\n");
      out.write("                                <div class=\"col-sm-4\"> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"0.00\" name=\"pprice\" onkeypress=\"return isNumber(event)\"/>\n");
      out.write("                                    <span id=\"alertpprice\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"pcode\">Shipping Cost*</label>\n");
      out.write("                                <div class=\"col-sm-4\"> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"0.00\" name=\"pshipping\" onkeypress=\"return isNumber(event)\"/>\n");
      out.write("                                    <span id=\"alertpshipping\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"http://slpost.gov.lk/tariffcal/index.php\" target=\"blank\" style=\"color: red;\">Shipping Cost Calculator</a>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"Image\" class=\"tab-pane fade\"><br><br>\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"pqty\">Images</label><br><br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <label class=\"newbtn\">\n");
      out.write("                                        <img src=\"http://placehold.it/120x120\" alt=\"imge\" width=\"220\" height=\"200\" id=\"img1\">\n");
      out.write("                                        <input id=\"pic1\" type=\"file\" onchange=\"changePic(this, document.getElementById('img1'))\" name=\"pic1\"/>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\"> \n");
      out.write("                                    <label class=\"newbtn\">\n");
      out.write("                                        <img src=\"http://placehold.it/120x120\" alt=\"imge\" width=\"220\" height=\"200\" id=\"img2\">\n");
      out.write("                                        <input id=\"pic2\" type=\"file\" onchange=\"changePic(this, document.getElementById('img2'))\" name=\"pic2\"/>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\"> \n");
      out.write("                                    <label class=\"newbtn\">\n");
      out.write("                                        <img src=\"http://placehold.it/120x120\" alt=\"imge\" width=\"220\" height=\"200\" id=\"img3\">\n");
      out.write("                                        <input id=\"pic\" type=\"file\" onchange=\"changePic(this, document.getElementById('img3'))\" name=\"pic3\"/>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"Request\" class=\"tab-pane fade\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"pname\">Description</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <textarea id=\"textarea\" class=\"form-control\" rows=\"4\" name=\"rdescription\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br><br><br><br><br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"pqty\">Prices</label>\n");
      out.write("                                <div class=\"col-sm-4\"> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"rprice\" onkeypress=\"return isNumber(event)\"/>\n");
      out.write("                                    <span id=\"alertrprice\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div><br><br><br>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function isNumber(evt) {\n");
      out.write("                evt = (evt) ? evt : window.event;\n");
      out.write("                var charCode = (evt.which) ? evt.which : evt.keyCode;\n");
      out.write("                if (charCode > 31 && (charCode < 48 || charCode > 57)) {\n");
      out.write("                    document.getElementById('alertpprice').innerHTML = \"**Please enter Number**\";\n");
      out.write("                    document.getElementById('alertpshipping').innerHTML = \"**Please enter Number**\";\n");
      out.write("                    document.getElementById('alertrprice').innerHTML = \"**Please enter Number**\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                document.getElementById('alertpprice').innerHTML = \"\";\n");
      out.write("                document.getElementById('alertpshipping').innerHTML = \"\";\n");
      out.write("                document.getElementById('alertrprice').innerHTML = \"\";\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function isAlfa(evt) {\n");
      out.write("                evt = (evt) ? evt : window.event;\n");
      out.write("                var charCode = (evt.which) ? evt.which : evt.keyCode;\n");
      out.write("                if (charCode > 31 && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122)) {\n");
      out.write("                    document.getElementById('alertpname').innerHTML = \"**Please enter character**\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                document.getElementById('alertpname').innerHTML = \"\";\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(formsave1).on(\"click\", function (e) {\n");
      out.write("                    alert('CLICKED 1');\n");
      out.write("                    $('#formsave2').click();\n");
      out.write("                    alert('CLICKED 2');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            function changePic(input, img) {\n");
      out.write("                if (input.files && input.files[0]) {\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("                    reader.onload = function (e) {\n");
      out.write("                        $(img).attr('src', e.target.result)\n");
      out.write("                    }\n");
      out.write("                    reader.readAsDataURL(input.files[0]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function getproductsub() {\n");
      out.write("                var catid = document.getElementById('pcategory').value;\n");
      out.write("                var url = window.location.href.pathname;\n");
      out.write("                var r = new XMLHttpRequest();\n");
      out.write("                r.onreadystatechange = function () {\n");
      out.write("                    if (r.readyState === 4 && r.status === 200) {\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                window.location.href = \"");
      out.print( request.getRequestURL());
      out.write("?catid=\" + catid;\n");
      out.write("                r.open(\"GET\", \"");
      out.print( request.getRequestURL());
      out.write("?catid=\" + catid, true);\n");
      out.write("                // r.open(\"GET\",url+\"?catid=\" + catid,true);\n");
      out.write("                r.send();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-12\">\n");
      out.write("        <div class=\"jumbotron\" style=\"background-color: black\">\n");
      out.write("            <center>\n");
      out.write("                <p style=\"color: white\"> © 2018 All Rights Reserved.\n");
      out.write("                    Version 3.0.1.</p></center>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</html>\n");

    s.close();

      out.write('\n');
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
