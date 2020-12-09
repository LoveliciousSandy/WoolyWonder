package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

public final class category_tops_blouse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
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
      out.write("        /* Customize the label (the container) */\n");
      out.write("        .container {\n");
      out.write("            display: block;\n");
      out.write("            position: relative;\n");
      out.write("            padding-left: 35px;\n");
      out.write("            margin-bottom: 12px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            /*            font-size: 22px;*/\n");
      out.write("            /*            -webkit-user-select: none;\n");
      out.write("                        -moz-user-select: none;\n");
      out.write("                        -ms-user-select: none;*/\n");
      out.write("            user-select: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Hide the browser's default checkbox */\n");
      out.write("        .container input {\n");
      out.write("            position: absolute;\n");
      out.write("            opacity: 0;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Create a custom checkbox */\n");
      out.write("        .checkmark {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            height: 25px;\n");
      out.write("            width: 25px;\n");
      out.write("            background-color: #eee;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* On mouse-over, add a grey background color */\n");
      out.write("        .container:hover input ~ .checkmark {\n");
      out.write("            background-color: #ccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* When the checkbox is checked, add a blue background */\n");
      out.write("        .container input:checked ~ .checkmark {\n");
      out.write("            background-color: #2196F3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Create the checkmark/indicator (hidden when not checked) */\n");
      out.write("        .checkmark:after {\n");
      out.write("            content: \"\";\n");
      out.write("            position: absolute;\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Show the checkmark when checked */\n");
      out.write("        .container input:checked ~ .checkmark:after {\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Style the checkmark/indicator */\n");
      out.write("        .container .checkmark:after {\n");
      out.write("            left: 9px;\n");
      out.write("            top: 5px;\n");
      out.write("            width: 5px;\n");
      out.write("            height: 10px;\n");
      out.write("            border: solid white;\n");
      out.write("            border-width: 0 3px 3px 0;\n");
      out.write("            -webkit-transform: rotate(45deg);\n");
      out.write("            -ms-transform: rotate(45deg);\n");
      out.write("            transform: rotate(45deg);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\"></div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menubar.jsp", out, false);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\" container col-sm-3\">\n");
      out.write("                    <div class=\"row\" style=\"padding-left: 50px;\">\n");
      out.write("                        <span>name</span><br>\n");
      out.write("                        <button class=\"btn btn-default\">category</button><br>\n");
      out.write("                        <button class=\"btn btn-default\">category</button><br>\n");
      out.write("                        <button class=\"btn btn-default\">category</button><br>\n");
      out.write("                        <br><br><br>\n");
      out.write("                        <span>Filter</span><br><br>\n");
      out.write("                        <input type=\"radio\" name=\"price\">Rs:200-Rs:900<br>\n");
      out.write("                        <input type=\"radio\" name=\"price\" >Rs:1000-Rs:1900<br>\n");
      out.write("                        <input type=\"radio\" name=\"price\"> Rs:2000-Rs:2900<br>\n");
      out.write("                        <input type=\"radio\" name=\"price\"> Rs:3000- +<br>\n");
      out.write("                        <button class=\"btn btn-default\">clear filer</button><br>\n");
      out.write("                        <span>colour</span><br><br>\n");
      out.write("                        <div>\n");
      out.write("                            <label class=\"container\">One\n");
      out.write("                                <input type=\"checkbox\" checked=\"checked\">\n");
      out.write("                                <span class=\"checkmark\"></span>\n");
      out.write("                            </label>\n");
      out.write("\n");
      out.write("                            <label class=\"container\">Two\n");
      out.write("                                <input type=\"checkbox\" >\n");
      out.write("                                <span class=\"checkmark\"></span>\n");
      out.write("                            </label>\n");
      out.write("\n");
      out.write("                            <label class=\"container\">Three\n");
      out.write("                                <input type=\"checkbox\">\n");
      out.write("                                <span class=\"checkmark\"></span>\n");
      out.write("                            </label>\n");
      out.write("\n");
      out.write("                            <label class=\"container\">Four\n");
      out.write("                                <input type=\"checkbox\">\n");
      out.write("                                <span class=\"checkmark\"></span>\n");
      out.write("                            </label>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <span>size</span><br><br>\n");
      out.write("                        <button class=\"btn\">S</button>\n");
      out.write("                        <button class=\"btn\">M</button>\n");
      out.write("                        <button class=\"btn\">L</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                    ");

                        Session s = HibernateSession.getSession();
                        String sql1 = "SELECT * FROM `product` JOIN `product_category` ON `product_category`.`id`= `product`.`category` WHERE `product_category`.`id`=2";
                        SQLQuery query = s.createSQLQuery(sql1);
                        query.addEntity(Product.class);
                        List<Product> r1 = query.list();
                        for (Product p : r1) {

                    
      out.write("\n");
      out.write("                    \n");
      out.write("               <div class=\" container col-sm-9\">\n");
      out.write("                   <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                          <div class=\"container\">\n");
      out.write("                                <div class=\"col-sm-3\" style=\"background-color: white\">\n");
      out.write("                                    <label></label>\n");
      out.write("                                    <div class=\"card\" id=\"imagecard\">\n");
      out.write("                                        <a href=\"index.jsp\">\n");
      out.write("                                            ");
 
                                                ProductImage pi = (ProductImage) p.getProductImages().iterator().next();
                                            
      out.write("\n");
      out.write("                                            <img src=");
      out.print( pi.getUrl());
      out.write("  alt=\"imge\" width=\"250\" height=\"270\" style=\"border:1px solid gray\"/>\n");
      out.write("\n");
      out.write("                                        </a><br>\n");
      out.write("                                        <span id=\"pricetag\">Rs:");
      out.print( p.getPrice());
      out.write("/=</span><br>\n");
      out.write("                                        <span>\n");
      out.write("                                            ");
      out.print( p.getName() );
      out.write("\n");
      out.write("                                        </span><br>\n");
      out.write("                                        <button id=\"viewdetails\" class=\" btn btn-default\" onclick=\"viewdetails(");
      out.print(p.getId());
      out.write(")\">View Details</button><br>\n");
      out.write("                                        <label></label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        ");
  }
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function viewdetails(id) {\n");
      out.write("                window.location.href = \"selectproductview.jsp?id=\" + id;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
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
