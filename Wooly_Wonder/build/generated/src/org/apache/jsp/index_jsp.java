package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Servlet.Login;
import Pojos.Account;
import Model.Email;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ABC</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Links/Links.jsp", out, false);
      out.write("\n");
      out.write("        <link href=\"CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        ");

            Account acc = Login.getLoggedInAccount(request.getSession());
            if (acc == null) {
//                response.sendRedirect(request.getContextPath() + "/");
//                return;
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "defaultnavbar.jsp", out, false);
      out.write("  \n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FixedTopNavBar.jsp", out, false);
      out.write("\n");
      out.write("        ");
 }
        
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            #divbody{\n");
      out.write("                margin:auto;\n");
      out.write("            }\n");
      out.write("            .card{\n");
      out.write("                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("            }\n");
      out.write("\n");
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
      out.write("                margin-bottom: 30px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .btn:hover {\n");
      out.write("                background-color:black;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                transition: transform .2s;\n");
      out.write("                width:250px; \n");
      out.write("                height :300px; \n");
      out.write("\n");
      out.write("            }\n");
      out.write("            img:hover{\n");
      out.write("                transform: scale(1.08);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("  <!-- ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "logobar.jsp", out, false);
      out.write("-->\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "indexcarousel.jsp", out, false);
      out.write("<br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menubar.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write("    <body id=\"main\" onload=\"viewproduchomepage();\">\n");
      out.write("        <div class=\"container-fluid\" id=\"divbody\">\n");
      out.write("            <div class=\"row\" id=\"row1\">\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("                <div id=\"proload\" class=\"col-sm-9\" >\n");
      out.write("                    <div id=\"pcontainer\"  class=\"container\" >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <br><br>\n");
      out.write("         \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var productview;\n");
      out.write("            function viewproduchomepage() {\n");
      out.write("                //                document.getElementById('proload').innerHTML = \"\";\n");
      out.write("                var request = new XMLHttpRequest();\n");
      out.write("                request.onreadystatechange = function () {\n");
      out.write("\n");
      out.write("                    if (request.readyState === 4 && request.status === 200) {\n");
      out.write("\n");
      out.write("                        var jsonstring = request.responseText;\n");
      out.write("\n");
      out.write("                        var jsonparse = JSON.parse(jsonstring);\n");
      out.write("\n");
      out.write("\n");
      out.write("                        for (var i = 0; i < jsonparse.length; i++) {\n");
      out.write("\n");
      out.write("                            productview = jsonparse[i];\n");
      out.write("\n");
      out.write("                            var mainbody = document.getElementById(\"main\");\n");
      out.write("                            var divbody = document.getElementById(\"divbody\");\n");
      out.write("                            var row1 = document.getElementById(\"row1\");\n");
      out.write("                            var proload = document.getElementById(\"proload\");\n");
      out.write("                            var container = document.getElementById(\"pcontainer\");\n");
      out.write("\n");
      out.write("                            var d2 = document.createElement(\"div\");\n");
      out.write("                            d2.setAttribute(\"class\", \"col-sm-3\");\n");
      out.write("\n");
      out.write("\n");
      out.write("                            var l1 = document.createElement(\"label\");\n");
      out.write("                            d2.appendChild(l1);\n");
      out.write("\n");
      out.write("                            var d3 = document.createElement(\"div\");\n");
      out.write("                            d3.setAttribute(\"class\", \"card\");\n");
      out.write("                            d2.appendChild(d3);\n");
      out.write("\n");
      out.write("                            var a1 = document.createElement(\"a\");\n");
      out.write("                            a1.setAttribute(\"href\", \"selectproductview.jsp\");\n");
      out.write("\n");
      out.write("                            d3.appendChild(a1);\n");
      out.write("                            var image1 = document.createElement(\"img\");\n");
      out.write("                            image1.setAttribute(\"src\", productview.image);\n");
      out.write("                            a1.appendChild(image1);\n");
      out.write("\n");
      out.write("                            var s1 = document.createElement(\"span\");\n");
      out.write("                            s1.setAttribute(\"id\", \"pricetag\");\n");
      out.write("                            s1.innerHTML = \"Rs: \" + productview.price;\n");
      out.write("                            d3.appendChild(s1);\n");
      out.write("                            br1 = document.createElement(\"br\");\n");
      out.write("                            d3.appendChild(br1);\n");
      out.write("                            var s2 = document.createElement(\"span\");\n");
      out.write("                            s2.innerHTML = productview.name;\n");
      out.write("                            d3.appendChild(s2);\n");
      out.write("                            br2 = document.createElement(\"br\");\n");
      out.write("                            d3.appendChild(br2);\n");
      out.write("\n");
      out.write("                            var b1 = document.createElement(\"button\");\n");
      out.write("                            b1.setAttribute(\"class\", \"btn btn-default\");\n");
      out.write("                            b1.setAttribute(\"onclick\", \"viewdetails(\" + productview.id + \")\");\n");
      out.write("\n");
      out.write("                            b1.innerHTML = \"View Details\";\n");
      out.write("                            d3.appendChild(b1);\n");
      out.write("\n");
      out.write("                            var l2 = document.createElement(\"label\");\n");
      out.write("                            d3.appendChild(l2);\n");
      out.write("\n");
      out.write("                            container.appendChild(d2);\n");
      out.write("                            proload.appendChild(container);\n");
      out.write("                            row1.appendChild(proload);\n");
      out.write("                            divbody.appendChild(row1);\n");
      out.write("                            mainbody.appendChild(divbody);\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                };\n");
      out.write("                request.open(\"GET\", \"view_product\", true);\n");
      out.write("                request.send();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function viewdetails(id) {\n");
      out.write("                window.location.href = \"selectproductview.jsp?id=\" + id;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("         \n");
      out.write("</body>\n");
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
