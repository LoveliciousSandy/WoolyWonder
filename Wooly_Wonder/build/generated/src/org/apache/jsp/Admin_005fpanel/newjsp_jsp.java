package org.apache.jsp.Admin_005fpanel;

import Pojos.ProductCategory;
import Pojos.ProductSubcategory;
import java.util.Set;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\" id=\"pagebody\">\n");
      out.write("                            Categories\n");
      out.write("                <form action=\"../category_save?action=category\" method=\"POST\">\n");
      out.write("                    <button class=\"accordion\"><h4>Categories<i class=\"fa fa-angle-down fa-fw fa-lg\"></i></h4></button>\n");
      out.write("                    <div class=\"panel\" style=\"z-index: -999\">\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <span class=\"control-label col-sm-2\" for=\"name\">Name:</span>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required=\"\" name=\"cname\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"sel1\">Add Category:</label>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <select class=\"form-control\" id=\"ccategory\" name=\"ccategory\">\n");
      out.write("                                    <option value=\"0\">-Select Category-</option>\n");
      out.write("                                ");
        Iterable<ProductCategory> pcl = null;
for (ProductCategory pc : pcl) {
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( pc.getId());
      out.write('"');
      out.write('>');
      out.print( pc.getName());
      out.write("</option>\n");
      out.write("                                ");

                                    Set<ProductSubcategory> pscs = pc.getProductSubcategories();
                                    for (ProductSubcategory psc : pscs) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( psc.getId());
      out.write("\">&emsp;- ");
      out.print( psc.getSubcategory());
      out.write("</option>\n");
      out.write("                                ");

                                        }
                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"cstatus\">Status</label>\n");
      out.write("                        <div class=\"col-sm-4\" >\n");
      out.write("\n");
      out.write("                            <input type=\"radio\" name=\"status\" value=\"Active\" required=\"\">Active\n");
      out.write("                            <input type=\"radio\" name=\"status\" value=\"Hidden\"required=\"\">Hidden\n");
      out.write("                            <input type=\"radio\" name=\"status\" value=\"Disable\" required=\"\">Disable\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\"></label>\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <button class=\"btn btn-default-create  form-control\">Create</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("                      Sizers\n");
      out.write("            <form action=\"../category_save?action=size\" method=\"POST\">\n");
      out.write("                <button class=\"accordion\"><h4>Sizers<i class=\"fa fa-angle-down fa-fw fa-lg\"></i></h4></button>\n");
      out.write("                <div class=\"panel\">\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"name\">Name:</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" required=\"\" name=\"sname\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"sstatus\">Status</label>\n");
      out.write("                        <div class=\"col-sm-4\" >\n");
      out.write("\n");
      out.write("                            <input type=\"radio\" name=\"status\" value=\"Active\" required=\"\">Active\n");
      out.write("                            <input type=\"radio\" name=\"status\" value=\"Hidden\"required=\"\">Hidden\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\"></label>\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <button class=\"btn btn-default-create form-control\">Create</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("                       Colours \n");
      out.write("            <form action=\"../category_save?action=colour\" method=\"POST\">\n");
      out.write("                <button class=\"accordion\"><h4>Colours<i class=\"fa fa-angle-down fa-fw fa-lg\"></i></h4></button>\n");
      out.write("                <div class=\"panel\">\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"name\">Name:</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" required=\"\" name=\"cname\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"cstatus\">Status</label>\n");
      out.write("                        <div class=\"col-sm-4\" >\n");
      out.write("                            <input type=\"radio\" name=\"status\" value=\"Active\" required=\"\">Active\n");
      out.write("                            <input type=\"radio\" name=\"status\" value=\"Hidden\"required=\"\">Hidden\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\"></label>\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <button class=\"btn btn-default-create form-control\">Create</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("                $(ccategory).on('change', function () {\n");
      out.write("                    if (this.value == -1)\n");
      out.write("                        $(ccategoryother).show();\n");
      out.write("                    else\n");
      out.write("                        $(ccategoryother).hide();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("            var acc = document.getElementsByClassName(\"accordion\");\n");
      out.write("            var i;\n");
      out.write("\n");
      out.write("            for (i = 0; i < acc.length; i++) {\n");
      out.write("                acc[i].addEventListener(\"click\", function () {\n");
      out.write("                    /* Toggle between adding and removing the \"active\" class,\n");
      out.write("                     to highlight the button that controls the panel */\n");
      out.write("                   this.classList.toggle(\"active\");\n");
      out.write("\n");
      out.write("                    /* Toggle between hiding and showing the active panel */\n");
      out.write("                    var panel = this.nextElementSibling;\n");
      out.write("                    if (panel.style.display === \"block\") {\n");
      out.write("                        panel.style.display = \"none\";\n");
      out.write("                    } else {\n");
      out.write("                        panel.style.display = \"block\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("             acc[0].click();\n");
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
