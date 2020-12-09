package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.criterion.Restrictions;
import java.util.Set;
import Pojos.OrderDetails;
import org.hibernate.SQLQuery;
import org.hibernate.FetchMode;
import Pojos.Address;
import Pojos.Orders;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import Cart.DBBag;
import Cart.SessionBag;
import Servlet.Login;
import Pojos.Account;
import java.util.List;
import hibernate.HibernateSession;
import org.hibernate.Session;
import Pojos.ProductImage;
import Pojos.Product;
import Pojos.Bag;

public final class myOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    Account acc = Login.getLoggedInAccount(request.getSession());
    if (acc == null) {
        response.sendRedirect("Login_Signup/Login.jsp");
        return;
    } else {
        System.out.println("PASS");

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FixedTopNavBar.jsp", out, false);
      out.write("  \n");
 }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Links/Links.jsp", out, false);
      out.write("\n");
      out.write("        <link href=\"CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            #f{\n");
      out.write("                background-color: lightgrey;\n");
      out.write("                height: 90px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br> \n");
      out.write("        <div class= container-fluid\" id=\"f\">\n");
      out.write("            <div class=\"wel well-lg\">\n");
      out.write("\n");
      out.write("                <h2 style=\"margin-left: 60px;\">My Recent Orders</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"panel-title\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-2\">\n");
      out.write("                                            <h5><span class=\"\"></span>Order Id</h5>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-2\">\n");
      out.write("                                            <h5><span class=\"\"></span>Receiver Name</h5>\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-2\">\n");
      out.write("                                            <h5><span class=\"\"></span>Total</h5>\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-2\">\n");
      out.write("                                            <h5><span class=\"\"></span>Date & Time</h5>\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-2\">\n");
      out.write("                                            <h5><span class=\"\">Status</span></h5>\t\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                ");

                                    Session s = HibernateSession.getSession();
                                    Account account = Login.getLoggedInAccount(request.getSession());
//                                    String sql1 = "SELECT orders.* FROM orders INNER JOIN `address` ON `address`.`id`= orders.`toaddress` JOIN `order_details` ON `order_details`.`orders`= `orders`.`id` WHERE orders.`id`=2";
//                                    SQLQuery query = s.createSQLQuery(sql1);
//                                    query.addEntity(Orders.class);
//                                    List<Orders> r1 = query.list();

                                    Account s1 = HibernateSession.Load(s, Account.class, account.getId().toString());
                                    Set<Orders> or = s1.getOrderses();
                                    for (Orders o : or) {

                                        Criteria c = s.createCriteria(Orders.class);
                                        c.add(Restrictions.eq("id", o.getId()));
                                         c.add(Restrictions.not(Restrictions.in("status", new String[]{"Completed",})));
                                        List<Orders> r1 = c.list();
                                        System.out.println(r1);
                                        for (Orders e : r1) {

                                
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-2\">\n");
      out.write("                                        <a href=\"orderInformation.jsp?oid=");
      out.print(e.getId());
      out.write("\"><h5><strong># ");
      out.print(  e.getId());
      out.write("</strong></h5></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-2\">\n");
      out.write("                                        <h5><strong> ");
      out.print((e.getAddress().getFirstname() + " " + e.getAddress().getLastname()));
      out.write("</strong></h5>\n");
      out.write("                                        <h5><strong>");
      out.print( e.getAccount().getEmail());
      out.write("</strong></h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-2\">\n");
      out.write("                                        <h5><strong>");
      out.print( (e.getTotal() + e.getShipping()));
      out.write("</strong></h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-2\">\n");
      out.write("                                        <h5><strong>");
      out.print( e.getDatetime());
      out.write("</strong></h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-2\">\n");
      out.write("                                        <h5><strong>");
      out.print( e.getStatus());
      out.write("</strong></h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-1\">\n");
      out.write("                                        <button class=\"btn btn-success\" ");
      out.print( o.getStatus().equals("Delivered") ? "" : "disabled");
      out.write(" onclick=\"Delivered(");
      out.print( o.getId());
      out.write(");\">Delivered</button>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\"><hr /></div>\n");
      out.write("                                ");
 }
                                    }
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            function Delivered(oid) {\n");
      out.write("                \n");
      out.write("                var r1 = new XMLHttpRequest();\n");
      out.write("                r1.onreadystatechange = function () {\n");
      out.write("                    if (r1.readyState === 4 && r1.status === 200) {\n");
      out.write("                        if (r1.responseText == \"msg=3\") {\n");
      out.write("                           location.reload();\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                r1.open(\"GET\", \"status?D=0&orderid=\" + oid, true);\n");
      out.write("                r1.send();\n");
      out.write("                 \n");
      out.write("            }\n");
      out.write("        </script>\n");
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
