package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Pojos.ProductColour;
import Servlet.Login;
import Pojos.Account;
import Pojos.ProductImage;
import Pojos.ProductSize;
import com.oracle.jrockit.jfr.Producer;
import java.util.List;
import java.util.Set;
import Pojos.Product;
import org.hibernate.Session;
import hibernate.HibernateSession;

public final class selectproductview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    Account acc = Login.getLoggedInAccount(request.getSession());
    if (acc == null) {

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "defaultnavbar.jsp", out, false);
      out.write("  \n");

} else {

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
      out.write("        <link href=\"xzoom/xzoom.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"xzoom/xzoom.min.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            /*****************globals*************/\n");
      out.write("            .line{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 20px;\n");
      out.write("                border-bottom:1px solid black;\n");
      out.write("                position: absolute;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img {\n");
      out.write("                max-width: 100%; }\n");
      out.write("\n");
      out.write("            .preview {\n");
      out.write("                display: -webkit-box;\n");
      out.write("                display: -webkit-flex;\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: flex;\n");
      out.write("                -webkit-box-orient: vertical;\n");
      out.write("                -webkit-box-direction: normal;\n");
      out.write("                -webkit-flex-direction: column;\n");
      out.write("                -ms-flex-direction: column;\n");
      out.write("                flex-direction: column; }\n");
      out.write("            @media screen and (max-width: 996px) {\n");
      out.write("                .preview {\n");
      out.write("                    margin-bottom: 20px; } }\n");
      out.write("\n");
      out.write("            .preview-pic {\n");
      out.write("                -webkit-box-flex: 1;\n");
      out.write("                -webkit-flex-grow: 1;\n");
      out.write("                -ms-flex-positive: 1;\n");
      out.write("                flex-grow: 1; }\n");
      out.write("\n");
      out.write("            .preview-thumbnail.nav-tabs{\n");
      out.write("                border: none;\n");
      out.write("                margin-top: 15px; }\n");
      out.write("            .preview-thumbnail.nav-tabs  li {\n");
      out.write("                width: 18%;\n");
      out.write("                margin-right: 2.5%; }\n");
      out.write("            .preview-thumbnail.nav-tabs.nav-stacked li img {\n");
      out.write("                max-width: 60px;\n");
      out.write("                display: block; }\n");
      out.write("            .preview-thumbnail.nav-tabs li a {\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0; }\n");
      out.write("            .preview-thumbnail.nav-tabs li:last-of-type {\n");
      out.write("                margin-right: 0; }\n");
      out.write("\n");
      out.write("            .tab-content {\n");
      out.write("                overflow: hidden; }\n");
      out.write("            .tab-content img {\n");
      out.write("                width: 100%;\n");
      out.write("                -webkit-animation-name: opacity;\n");
      out.write("                animation-name: opacity;\n");
      out.write("                -webkit-animation-duration: .3s;\n");
      out.write("                animation-duration: .3s; }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                margin-top: 50px;\n");
      out.write("\n");
      out.write("                padding: 3em;\n");
      out.write("                line-height: 1.5em; }\n");
      out.write("\n");
      out.write("            @media screen and (min-width: 997px) {\n");
      out.write("                .wrapper {\n");
      out.write("                    display: -webkit-box;\n");
      out.write("                    display: -webkit-flex;\n");
      out.write("                    display: -ms-flexbox;\n");
      out.write("                    display: flex; } }\n");
      out.write("\n");
      out.write("            .details {\n");
      out.write("                display: -webkit-box;\n");
      out.write("                display: -webkit-flex;\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: flex;\n");
      out.write("                -webkit-box-orient: vertical;\n");
      out.write("                -webkit-box-direction: normal;\n");
      out.write("                -webkit-flex-direction: column;\n");
      out.write("                -ms-flex-direction: column;\n");
      out.write("                flex-direction: column; }\n");
      out.write("\n");
      out.write("            .colors {\n");
      out.write("                -webkit-box-flex: 1;\n");
      out.write("                -webkit-flex-grow: 1;\n");
      out.write("                -ms-flex-positive: 1;\n");
      out.write("                flex-grow: 1; }\n");
      out.write("\n");
      out.write("            .product-title, .price, .sizes, .colors {\n");
      out.write("                text-transform: UPPERCASE;\n");
      out.write("                font-weight: bold; }\n");
      out.write("\n");
      out.write("            .checked, .price span {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .product-title, .price, .colour, .sizes {\n");
      out.write("                margin-bottom: 15px; }\n");
      out.write("\n");
      out.write("            .product-title{\n");
      out.write("                margin-top: 0; \n");
      out.write("                font-size: 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .price {\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .size {\n");
      out.write("                margin-right: 10px; }\n");
      out.write("            .size:first-of-type {\n");
      out.write("                margin-left: 40px; }\n");
      out.write("\n");
      out.write("            .color {\n");
      out.write("                display: inline-block;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                height: 2em;\n");
      out.write("                width: 2em;\n");
      out.write("                border-radius: 2px; }\n");
      out.write("            .color:first-of-type {\n");
      out.write("                margin-left: 20px; }\n");
      out.write("\n");
      out.write("            .add-to-cart, .like {\n");
      out.write("                background: #ff9f1a;\n");
      out.write("                padding: 1.2em 1.5em;\n");
      out.write("                border: none;\n");
      out.write("                text-transform: UPPERCASE;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #fff;\n");
      out.write("                -webkit-transition: background .3s ease;\n");
      out.write("                transition: background .3s ease; }\n");
      out.write("            .add-to-cart:hover, .like:hover {\n");
      out.write("                background: #b36800;\n");
      out.write("                color: #fff; }\n");
      out.write("\n");
      out.write("            .not-available {\n");
      out.write("                text-align: center;\n");
      out.write("                line-height: 2em; }\n");
      out.write("            .not-available:before {\n");
      out.write("                font-family: fontawesome;\n");
      out.write("                content: \"\\f00d\";\n");
      out.write("                color: #fff; }\n");
      out.write("\n");
      out.write("            .orange {\n");
      out.write("                background: #ff9f1a; }\n");
      out.write("\n");
      out.write("            .green {\n");
      out.write("                background: #85ad00; }\n");
      out.write("\n");
      out.write("            .blue {\n");
      out.write("                background: #0076ad; }\n");
      out.write("\n");
      out.write("            .tooltip-inner {\n");
      out.write("                padding: 1.3em; }\n");
      out.write("\n");
      out.write("            @-webkit-keyframes opacity {\n");
      out.write("                0% {\n");
      out.write("                    opacity: 0;\n");
      out.write("                    -webkit-transform: scale(3);\n");
      out.write("                    transform: scale(3); }\n");
      out.write("                100% {\n");
      out.write("                    opacity: 1;\n");
      out.write("                    -webkit-transform: scale(1);\n");
      out.write("                    transform: scale(1); } }\n");
      out.write("\n");
      out.write("            @keyframes opacity {\n");
      out.write("                0% {\n");
      out.write("                    opacity: 0;\n");
      out.write("                    -webkit-transform: scale(3);\n");
      out.write("                    transform: scale(3); }\n");
      out.write("                100% {\n");
      out.write("                    opacity: 1;\n");
      out.write("                    -webkit-transform: scale(1);\n");
      out.write("                    transform: scale(1); } }\n");
      out.write("\n");
      out.write("            /*# sourceMappingURL=style.css.map */\n");
      out.write("            .modal-body-image{\n");
      out.write("                width: 170px;\n");
      out.write("                height: 200px;            \n");
      out.write("            }\n");
      out.write("            #addtobag{\n");
      out.write("                width: 400px;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: red;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 27px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            xoriginal{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            #xzoom{\n");
      out.write("                max-width: 60px;\n");
      out.write("                display: block; \n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    ");

        Session ses = HibernateSession.getSession();
        Product p = HibernateSession.Load(ses, Product.class, request.getParameter("id"));// ak object aki
        ProductSize psize = p.getProductSize();
        ProductColour pcolour = p.getProductColour();
        Set<ProductImage> pimglist = p.getProductImages();
        String i1 = null;
        String i2 = null;
        String i3 = null;
        for (ProductImage pi : pimglist) {
            if (i1 == null) {
                i1 = pi.getUrl();

            } else if (i2 == null) {
                i2 = pi.getUrl();

            } else if (i3 == null) {
                i3 = pi.getUrl();
            }
        }
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menubar.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\" style=\"background-color: red;\">\n");
      out.write("                    kdhfhsdlkhfhd\n");
      out.write("                    kdhfhsdlkhfhd\n");
      out.write("                    kdhfhsdlkhfhd\n");
      out.write("                    kdhfhsdlkhfhd\n");
      out.write("                    kdhfhsdlkhfhd\n");
      out.write("                    kdhfhsdlkhfhd\n");
      out.write("                    kdhfhsdlkhfhd\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--                                 Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"addtobagmodal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\" >\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered modal-lg\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h2 class=\"modal-title\" id=\"addtobagmodalTitle\" style=\"color: hotpink\"><center>Added to your bag</center></h2>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"container\" style=\"margin-left: 345px; \">\n");
      out.write("\n");
      out.write("                            <img class=\"modal-body-image\" src=");
      out.print( i1);
      out.write("><br>\n");
      out.write("\n");
      out.write("                            <h4><span class=\"control-label\">");
      out.print(p.getName());
      out.write("</span></h4>\n");
      out.write("                            <h4><span class=\"control-label\">Product Price: ");
      out.print( p.getPrice());
      out.write("</span></h4>\n");
      out.write("                            <h4> <span class=\"control-label\">Product Qty: ");
      out.print( p.getQty());
      out.write("</span></h4><br><br>\n");
      out.write("                            <a href=\"ProductView.jsp\"> <button type=\"button\" class=\"btn btn-default\">Continue Shopping</button></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <center>\n");
      out.write("                            <br>\n");
      out.write("                            <form action=\"mybag.jsp\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-default\" >Complete your order</button>\n");
      out.write("                            </form>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                    <Br>\n");
      out.write("                    <Br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\".xzoom, .xzoom-gallery\").xzoom({tint: '#333', Xoffset: 15});\n");
      out.write("            });\n");
      out.write("            function addTobag() {\n");
      out.write("                var request = new XMLHttpRequest();\n");
      out.write("                request.onreadystatechange = function () {\n");
      out.write("                    if (request.readyState === 4 && request.status === 200) {\n");
      out.write("                        if (request.responseText == \"OK\") {\n");
      out.write("                            $('#addtobagmodal').modal('show');\n");
      out.write("                            alert('ok');\n");
      out.write("                        } else {\n");
      out.write("                            alert('error:' + request.responseText);\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                request.open(\"GET\", \"myBag?add=1&pid=");
      out.print(p.getId());
      out.write("&qty=\" + $(qty).val(), true);\n");
      out.write("                request.send();\n");
      out.write("                alert('send');\n");
      out.write("            }\n");
      out.write("\n");
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
