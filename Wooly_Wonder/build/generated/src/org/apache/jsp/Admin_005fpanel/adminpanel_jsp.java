package org.apache.jsp.Admin_005fpanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Servlet.Login;
import Pojos.Request;
import org.hibernate.criterion.Restrictions;
import Pojos.ProductSubcategory;
import Pojos.Product;
import Pojos.PaymentReceived;
import java.util.List;
import org.hibernate.Criteria;
import Pojos.Orders;
import org.hibernate.Session;
import hibernate.HibernateSession;
import Pojos.Account;
import Servlet.Login;

public final class adminpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
  Session s = HibernateSession.getSession();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        #f{\n");
      out.write("            background-color: lightgrey;\n");
      out.write("            height: 90px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    ");
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
      out.write("    <body>\n");
      out.write("        <br><br>\n");
      out.write("        <div class= container-fluid\" id=\"f\">\n");
      out.write("            <div class=\"wel well-lg\">\n");
      out.write("                <h2 style=\"margin-left: 60px;\">Dashboard</h2>\n");
      out.write("            </div>\n");
      out.write("        </div><br><br>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-1\"></div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <div class=\"panel panel-danger\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3 class=\"panel-title\">Total Orders</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <i class=\"fa fa-shopping-cart fa-5x\" aria-hidden=\"true\"></i>\n");
      out.write("                        ");

                            Criteria c1 = HibernateSession.createCriteria(s, Orders.class);
                            List<Orders> orders = c1.list();
                        
      out.write("\n");
      out.write("                    </div><div class=\"form-group col-md-6\">\n");
      out.write("                        <span style=\"font-size: 50px;\">");
      out.print(orders.size());
      out.write("</span>\n");
      out.write("                    </div                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-footer\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("        <div class=\"panel panel-danger\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("                <h3 class=\"panel-title\">Total Sales</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <i class=\"fa fa-money fa-5x\" aria-hidden=\"true\"></i>\n");
      out.write("                    ");


                        Criteria c2 = HibernateSession.createCriteria(s, PaymentReceived.class);
                        List<PaymentReceived> paymentreceived = c2.list();
                    
      out.write("\n");
      out.write("                </div><div class=\"form-group col-md-6\">\n");
      out.write("                    <span style=\"font-size: 50px;\">");
      out.print(paymentreceived.size());
      out.write("</span>\n");
      out.write("                </div                </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-3\">\n");
      out.write("    <div class=\"panel panel-danger\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("            <h3 class=\"panel-title\">Total Products</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <div class=\"form-group col-md-6\">\n");
      out.write("                <i class=\"fa fa-product-hunt fa-5x\" aria-hidden=\"true\"></i>\n");
      out.write("                ");

                    Criteria c3 = HibernateSession.createCriteria(s, Product.class);
                    List<Product> product = c3.list();
                
      out.write("\n");
      out.write("            </div><div class=\"form-group col-md-6\">\n");
      out.write("                <span style=\"font-size: 50px;\">");
      out.print(product.size());
      out.write("</span>\n");
      out.write("            </div                </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel-footer\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-2\"></div><br>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-5\" style=\"margin-left: 30px;\">\n");
      out.write("    <h3>Recent Placed Orders</h3>\n");
      out.write("    <table class=\"table table-hover\"    id=\"myTable\" >\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Order Id</th>\n");
      out.write("                <th>Customer</th>\n");
      out.write("                <th>Date Added</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        ");
 Criteria c4 = s.createCriteria(Orders.class);
            c4.add(Restrictions.eq("status", "Placed"));
            c4.add(Restrictions.ne("status", "completed"));
            List<Orders> l1 = c4.list();
            for (Orders psc : l1) {
        
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("            <tr style=\"height: 50px;\">\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getId());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getAddress().getFirstname() + " " + psc.getAddress().getLastname());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getDatetime());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getStatus());
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("        ");
 }

        
      out.write("\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-6\" style=\"margin-left: 30px;\">\n");
      out.write("    <h3>Product </h3>\n");
      out.write("    <table class=\"table table-hover\"    id=\"myTable\" >\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Request ID</th>\n");
      out.write("                <th>Product Name</th>\n");
      out.write("                <th>Product Price</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        ");
 Criteria c6 = s.createCriteria(Request.class);
//            c4.add(Restrictions.eq("status", "Placed"));
//            c4.add(Restrictions.ne("status", "completed"));
            List<Request> l3 = c6.list();
            for (Request psc : l3) {

        
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("            <tr style=\"height: 50px;\">\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getId());
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getProduct().getName());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getPrice());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getDateTime());
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("        ");
 }

        
      out.write("\n");
      out.write("    </table><br><br>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-6\" style=\"margin-left: 30px;\">\n");
      out.write("    <h3>Product </h3>\n");
      out.write("    <table class=\"table table-hover\"    id=\"myTable\" >\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Product ID</th>\n");
      out.write("                <th>Product Code</th>\n");
      out.write("                <th>Product Name</th>\n");
      out.write("                <th>Product Price</th>\n");
      out.write("                <th>Product QTY</th>\n");
      out.write("                <th>Product Status</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        ");
 Criteria c5 = s.createCriteria(Product.class);
//            c4.add(Restrictions.eq("status", "Placed"));
//            c4.add(Restrictions.ne("status", "completed"));
            List<Product> l2 = c5.list();
            for (Product psc : l2) {
                if (psc.getQty() <= 2) {
        
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("            <tr style=\"height: 50px;\">\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getId());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getCode());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getName());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getPrice());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getQty());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(psc.getStatus());
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("        ");
 }
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("</div><br><br>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-12\">\n");
      out.write("    <div class=\"jumbotron\" style=\"background-color: black\">\n");
      out.write("        <center>\n");
      out.write("            <p style=\"color: white\"> © 2018 All Rights Reserved.\n");
      out.write("                Version 3.0.1.</p></center>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
