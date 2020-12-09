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
import Servlet.Login;
import Pojos.Account;
import Servlet.Login;

public final class category_add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <style>\n");
      out.write("                #createbutton{\n");
      out.write("                    background-color:red;\n");
      out.write("                    color: white;\n");
      out.write("                    width: 150px;\n");
      out.write("                }\n");
      out.write("                .newbtn{\n");
      out.write("                    cursor: pointer;\n");
      out.write("                }\n");
      out.write("                #f{\n");
      out.write("                    background-color: lightgrey;\n");
      out.write("                    height: 90px;\n");
      out.write("                }\n");
      out.write("            </style> \n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>     \n");
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
      out.write("                <h2 style=\"margin-left: 60px;\">Category Add</h2>\n");
      out.write("            </div>\n");
      out.write("        </div><br>\n");
      out.write("        <div class=\" container row\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <ul class=\"nav nav-tabs\">\n");
      out.write("                    <li class=\"active\"><a data-toggle=\"tab\" href=\"#Categories\"><h4>Categories</h4></a></li>\n");
      out.write("                    <li><a data-toggle=\"tab\" href=\"#Sizers\"><h4>Sizers</h4> </a></li>\n");
      out.write("                    <li><a data-toggle=\"tab\" href=\"#Colours\"><h4>Colours</h4></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\" container row\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-9\">\n");
      out.write("\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div id=\"Categories\" class=\"tab-pane fade in active\" style=\"background-color: white\"><br>\n");
      out.write("                        <h2>Add Category</h2>\n");
      out.write("                        ");
 if (request.getParameter("msg") != null && request.getParameter("msg").equals("0")) {
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger alert-dismissible\" id=\"co\">\n");
      out.write("                            <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\" onclick=\"$(co).hide()\">&times;</a>\n");
      out.write("                            <center>Same Categories</center>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 } else if (request.getParameter("msg") != null && request.getParameter("msg").equals("rootnull")) {
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger alert-dismissible\" id=\"co\">\n");
      out.write("                            <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\" onclick=\"$(co).hide()\">&times;</a>\n");
      out.write("                            <center>Invalid Category. Choose a main Category or Root.</center>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write(" \n");
      out.write("                        <form action=\"../category_save?action=category\" method=\"POST\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"name\">Category Name:</label>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <input id=\"cname\" type=\"text\" class=\"form-control\" required=\"\" name=\"cname\" onkeypress=\"return isAlfa(event)\"/>\n");
      out.write("                                    <span id=\"alertcname\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"sel1\">Category Location:</label>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <select class=\"form-control\" id=\"ccategory\" name=\"rootlevel\">\n");
      out.write("                                        <option value=\"0\">-Select Category-</option>\n");
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
      out.write("                                        <option>&emsp;- ");
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
      out.write("                                    <input  type=\"radio\" name=\"status\" value=\"Active\" required=\"\" checked>Active\n");
      out.write("                                    <input type=\"radio\" name=\"status\" value=\"Disable\" required=\"\">Disable\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\"></label>\n");
      out.write("                                <div class=\"col-sm-1\">\n");
      out.write("                                    <button id=\"createbutton\" class=\"btn btn-default-create  form-control\">Create</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"Sizers\" class=\"tab-pane fade\" style=\"background-color: white\"><br>\n");
      out.write("                        <h2>Add Size</h2>\n");
      out.write("                        ");
 if (request.getParameter("msg") != null && request.getParameter("msg").equals("00")) {
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger alert-dismissible\" id=\"co\">\n");
      out.write("                            <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\" onclick=\"$(co).hide()\">&times;</a>\n");
      out.write("                            <center>Same Size</center>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write(" \n");
      out.write("                        <form action=\"../category_save?action=size\" method=\"POST\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"name\">Name:</label>\n");
      out.write("                                <div class=\"col-sm-5\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" required=\"\" name=\"sname\" onkeypress=\"return isAlfa(event)\">\n");
      out.write("                                    <span id=\"alertsname\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
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
      out.write("                                    <button id=\"createbutton\" class=\"btn btn-default-create form-control\">Create</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"Colours\" class=\"tab-pane fade\" style=\"background-color: white\"><br>\n");
      out.write("                        <h2>Add Colour</h2>\n");
      out.write("                        ");
 if (request.getParameter("msg") != null && request.getParameter("msg").equals("000")) {
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger alert-dismissible\" id=\"co\">\n");
      out.write("                            <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\" onclick=\"$(co).hide()\">&times;</a>\n");
      out.write("                            <center>Same Colour</center>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write(" \n");
      out.write("                        <form action=\"../category_save?action=colour\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" for=\"name\">Name:</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"cname\" required=\"\" onkeypress=\"return isAlfa(event)\">\n");
      out.write("                                    <span id=\"alertccname\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <label class=\"newbtn\">\n");
      out.write("                                        <img src=\"http://placehold.it/120x120\" alt=\"imge\" width=\"120\" height=\"120\" id=\"img1\">\n");
      out.write("                                        <input style=\"display: none;\" id=\"pic1\" type=\"file\"  onchange=\"changePic(this, document.getElementById('img1'))\" name=\"pic1\"/>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <br>\n");
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
      out.write("                                    <button id=\"createbutton\" class=\"btn btn-default-create form-control\">Create</button>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("            function isAlfa(evt) {\n");
      out.write("                evt = (evt) ? evt : window.event;\n");
      out.write("                var charCode = (evt.which) ? evt.which : evt.keyCode;\n");
      out.write("                if (charCode > 32 && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122)) {\n");
      out.write("                    document.getElementById('alertcname').innerHTML = \"**Please enter character**\";\n");
      out.write("                    document.getElementById('alertccname').innerHTML = \"**Please enter character**\";\n");
      out.write("                    document.getElementById('alertsname').innerHTML = \"**Please enter character**\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                document.getElementById('alertcname').innerHTML = \"\";\n");
      out.write("                document.getElementById('alertccname').innerHTML = \"\";\n");
      out.write("                document.getElementById('alertsname').innerHTML = \"\";\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            function changePic(input, img) {\n");
      out.write("                if (input.files && input.files[0]) {\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("                    reader.onload = function (e) {\n");
      out.write("                        $(img).attr('src', e.target.result)\n");
      out.write("                    }\n");
      out.write("                    reader.readAsDataURL(input.files[0]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function update(jscolor) {\n");
      out.write("                document.getElementById('rect').style.backgroundColor = '#' + jscolor\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function changeTab(tab) {\n");
      out.write("                if (!tab)\n");
      out.write("                    return;\n");
      out.write("                $('.nav-tabs a[href=\"#' + tab + '\"]').tab('show');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("                changeTab('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.tab}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\n");
      out.write("            });\n");
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
      out.write("\n");
      out.write("    <!--                                    <input class=\"jscolor form-control\"  onchange=\"update(this.jscolor)\" value=\"\" type=\"text\" required=\"\" name=\"cname\">-->\n");
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
