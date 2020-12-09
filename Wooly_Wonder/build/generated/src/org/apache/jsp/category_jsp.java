package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Pojos.ProductSize;
import org.hibernate.Hibernate;
import Servlet.Login;
import Pojos.Account;
import java.util.Set;
import Pojos.ProductCategory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import Pojos.ProductSubcategory;
import Pojos.ProductSubcategory;
import Pojos.ProductImage;
import java.util.List;
import Pojos.Product;
import Pojos.Product;
import org.hibernate.SQLQuery;
import hibernate.HibernateSession;
import hibernate.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Session;
import org.hibernate.Session;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
  Session s = HibernateSession.getSession(); 
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Links/Links.jsp", out, false);
      out.write("\n");
      out.write("        <link href=\"CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        ");

            Account acc = Login.getLoggedInAccount(request.getSession());
            if (acc == null) {

        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "defaultnavbar.jsp", out, false);
      out.write("  \n");
      out.write("        ");
        } else {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FixedTopNavBar.jsp", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("        ");
 }
        
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .clickable{\n");
      out.write("\n");
      out.write("                cursor: pointer;   \n");
      out.write("            }\n");
      out.write("            .panel-heading span {\n");
      out.write("                margin-top: -20px;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            #pricetag{\n");
      out.write("                color:black;\n");
      out.write("                font-size: large;\n");
      out.write("                margin-left: 70px;\n");
      out.write("                padding-top: 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .btn {\n");
      out.write("                margin-left: 70px;  \n");
      out.write("                background-color: red;\n");
      out.write("                color: white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .btn:hover {\n");
      out.write("                background-color:black;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            #imgcard{\n");
      out.write("                width: 200px;\n");
      out.write("                height: 270px;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br>\n");
      out.write("        <br><br>\n");
      out.write("        <br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menubar.jsp", out, false);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container col-sm-3\" style=\"margin-left: 0; padding-left: 40px;\">\n");
      out.write("            <div class=\"panel panel-danger\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    ");

                        ProductCategory pc = HibernateSession.Load(s, ProductCategory.class, request.getParameter("id"));
                    
      out.write("\n");
      out.write("                    <h3 class=\"panel-title\">");
      out.print(pc.getName());
      out.write("</h3>\n");
      out.write("\n");
      out.write("                    <span class=\"pull-right clickable\" ><i class=\"glyphicon glyphicon-chevron-up \"></i></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <select class=\"form-control\" onchange=\"adsearch();\" id=\"id1\">\n");
      out.write("                        <option value=\"0\">Select</option>\n");
      out.write("                        ");

                            Criteria c1 = HibernateSession.createCriteria(s, ProductSubcategory.class);
                            c1.add(Restrictions.eq("productCategory", pc));
                            List<ProductSubcategory> psc = c1.list();
                            for (ProductSubcategory sc : psc) {
                        
      out.write("\n");
      out.write("                        <option value=");
      out.print( sc.getId());
      out.write('>');
      out.print(sc.getSubcategory());
      out.write("</option>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel panel-danger\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3 class=\"panel-title\">Price</h3>\n");
      out.write("                    <span class=\"pull-right clickable\"><i class=\"glyphicon glyphicon-chevron-up\"></i></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-md-6\">\n");
      out.write("                            <label>Min Rs:</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" placeholder=\"Min\" min=\"0\" onchange=\"adsearch();\" id=\"id2\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-6 text-right\">\n");
      out.write("                            <label>Max Rs:</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" placeholder=\"Max\" onchange=\"adsearch();\" id=\"id3\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel panel-danger\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3 class=\"panel-title\">Colours</h3>\n");
      out.write("                    <span class=\"pull-right clickable\"><i class=\"glyphicon glyphicon-chevron-up\"></i></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        ");

                            Criteria c2 = HibernateSession.createCriteria(s, Product.class);
                            List<Product> pcolour = c2.list();
                            for (Product pco : pcolour) {
                        
      out.write("\n");
      out.write("                        <input class=\"checkbox colourCheck\" type=\"checkbox\" onchange=\"changeColour()\" id=\"");
      out.print( pco.getColour());
      out.write("\"> ");
      out.print( pco.getColour());
      out.write("\n");
      out.write("                        <hr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel panel-danger\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3 class=\"panel-title\">Sizes</h3>\n");
      out.write("                    <span class=\"pull-right clickable\"><i class=\"glyphicon glyphicon-chevron-up\"></i></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        ");

                            Criteria c3 = HibernateSession.createCriteria(s, ProductSize.class);
                            List<ProductSize> psize = c3.list();
                            for (ProductSize pz : psize) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <input  type=\"radio\" name=\"size\" onchange=\"adsearch()\" id=\"id5\"  value=");
      out.print(pz.getId());
      out.write(" > ");
      out.print(pz.getName());
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"c\"  class=\"col-sm-9\" id=\"proload\" style=\"margin-left: 0px; padding-left: 10px;\">\n");
      out.write("\n");
      out.write("            ");

                Criteria cc = HibernateSession.createCriteria(s, ProductCategory.class);
                cc.add(Restrictions.eq("id", Integer.parseInt(request.getParameter("id"))));
                List<ProductCategory> product = cc.list();
                for (ProductCategory pp : product) {
                    Set<Product> ppp = pp.getProducts();
                    for (Product p : ppp) {
            
      out.write("\n");
      out.write("            <div class=\"container col-sm-4\" style=\"margin-top: 40px;\">\n");
      out.write("                ");
 ProductImage pi = (ProductImage) p.getProductImages().iterator().next();
                
      out.write("\n");
      out.write("                <img src=");
      out.print( pi.getUrl());
      out.write(" alt=\"imge\" width=\"250\" height=\"270\" style=\"border:2px solid black\"/> \n");
      out.write("                <span id=\"pricetag\">Rs:");
      out.print( p.getPrice());
      out.write("/=</span><br>\n");
      out.write("                <p>");
      out.print(p.getName());
      out.write("</p>\n");
      out.write("                <button id=\"viewdetails\" class=\" btn btn-default\" onclick=\"viewdetails(");
      out.print(p.getId());
      out.write(")\">View Details</button><br>\n");
      out.write("            </div>\n");
      out.write("            ");
 }
                }
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function viewdetails(id) {\n");
      out.write("                window.location.href = \"selectproductview.jsp?id=\" + id;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(document).on('click', '.panel-heading span.clickable', function (e) {\n");
      out.write("                var $this = $(this);\n");
      out.write("                if (!$this.hasClass('panel-collapsed')) {\n");
      out.write("                    $this.parents('.panel').find('.panel-body').slideUp();\n");
      out.write("                    $this.addClass('panel-collapsed');\n");
      out.write("                    $this.find('i').removeClass('glyphicon-chevron-up').addClass('glyphicon-chevron-down');\n");
      out.write("                } else {\n");
      out.write("                    $this.parents('.panel').find('.panel-body').slideDown();\n");
      out.write("                    $this.removeClass('panel-collapsed');\n");
      out.write("                    $this.find('i').removeClass('glyphicon-chevron-down').addClass('glyphicon-chevron-up');\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            var subcategory;\n");
      out.write("            var min;\n");
      out.write("            var max;\n");
      out.write("            var colour = new Array();\n");
      out.write("            var size;\n");
      out.write("\n");
      out.write("            function changeColour() {\n");
      out.write("                colour = new Array();\n");
      out.write("                $('.colourCheck').each(function () {\n");
      out.write("                    if (this.checked) {\n");
      out.write("                        colour.push(this.id);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                adsearch();\n");
      out.write("            }\n");
      out.write("          \n");
      out.write("            function adsearch() {\n");
      out.write("                $('#proload').empty();\n");
      out.write("                subcategory = document.getElementById(\"id1\").value;\n");
      out.write("                min = document.getElementById('id2').value;\n");
      out.write("                max = document.getElementById('id3').value;\n");
      out.write("\n");
      out.write("                if (!min) {\n");
      out.write("                    min = 0;\n");
      out.write("                }\n");
      out.write("                if (!max) {\n");
      out.write("                    max = 10000;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("//              colours = document.getElementById('id4').value;\n");
      out.write("                size = document.getElementById('id5').value;\n");
      out.write("               \n");
      out.write("\n");
      out.write("//                var search_object = {\"category\": category, \"min\": 1\\, \"max\": 10, \"colours\": res, \"size\":s};\n");
      out.write("                var req = new XMLHttpRequest();\n");
      out.write("                req.onreadystatechange = function () {\n");
      out.write("                    if (req.readyState === 4 && req.status === 200) {\n");
      out.write("                        var x = document.getElementById('c');\n");
      out.write("                        x.innerHTML = req.responseText;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                req.open(\"GET\", \"search?i1=\" + subcategory + \"&i2=\" + min + \"&i3=\" + max + \"&i4=\" + JSON.stringify(colour) + \"&i5=\" + size);\n");
      out.write("                req.send();\n");
      out.write("               alert(id5);\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            \n");
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
