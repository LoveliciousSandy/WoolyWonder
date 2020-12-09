package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.Criteria;
import Pojos.Address;
import Pojos.ProductImage;
import Pojos.Product;
import Cart.DBBag;
import Cart.SessionBag;
import Servlet.Login;
import Pojos.Account;
import java.util.List;
import hibernate.HibernateSession;
import Pojos.Bag;
import org.hibernate.Session;

public final class cart_checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    Account a = Login.getLoggedInAccount(request.getSession());
    if (a == null) {
        response.sendRedirect(request.getContextPath() + "/Login_Signup/Login.jsp");
        return;
    }


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
      out.write("        <link href=\"CSS/maincss.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            #paybutton{\n");
      out.write("                height:50px; width: 500px; margin-left: 100px; margin-top: 50px; background-color: red; color: white;\n");
      out.write("            }\n");
      out.write("            #paybutton:hover{\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
        Session s = HibernateSession.getSession();
        List<Bag> baglist = null;
        if (a == null) {
            baglist = new SessionBag().getBag(request.getSession());
        } else {
            baglist = new DBBag().getBag(s, a);
        }
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\"></div>\n");
      out.write("        <div class=\"cart-body\">\n");
      out.write("            <!--            <form style=\"width: 100%\" method=\"post\" action=\"https://sandbox.payhere.lk/pay/checkout\">   \n");
      out.write("                            <input hidden=\"true\" type=\"hidden\" name=\"merchant_id\" value=\"1211111\">\n");
      out.write("                            <input hidden=\"true\" type=\"hidden\" name=\"return_url\" value=\"http://localhost:8080/NishanthaAM/Paymentsucces\">\n");
      out.write("                            <input hidden=\"true\" type=\"hidden\" name=\"cancel_url\" value=\"http://localhost:8080/NishanthaAM/EX505.jsp\">\n");
      out.write("                            <input hidden=\"true\" type=\"hidden\" name=\"notify_url\" value=\"http://localhost:8080/NishanthaAM/PaymentData\">  \n");
      out.write("            \n");
      out.write("                            <input hidden=\"true\" type=\"text\" name=\"order_id\" value=\"\">\n");
      out.write("                                   <input hidden=\"true\" type=\"text\" name=\"items\" value=\"\"><br>\n");
      out.write("                            <input hidden=\"true\" type=\"text\" name=\"currency\" value=\"LKR\">\n");
      out.write("                            <input hidden=\"true\" type=\"text\" id='amount' name=\"amount\" value=\"\">  \n");
      out.write("            \n");
      out.write("                            <input hidden=\"true\" type=\"text\" name=\"first_name\" value=\"\">\n");
      out.write("                            <input hidden=\"true\" type=\"text\" name=\"last_name\" value=\" \"><br>\n");
      out.write("                            <input hidden=\"true\" type=\"text\" name=\"email\" value=\"\">\n");
      out.write("                            <input hidden=\"true\" type=\"text\" name=\"phone\" value=\" \"><br>\n");
      out.write("                            <input hidden=\"true\" type=\"text\" name=\"address\" value=\"\">\n");
      out.write("                            <input hidden=\"true\" type=\"text\" name=\"city\" value=\"\">\n");
      out.write("                            <input hidden=\"true\" type=\"hidden\" name=\"country\" value=\"Sri Lanka\"><br><br> \n");
      out.write("            \n");
      out.write("                        </form>-->\n");
      out.write("            <form method=\"post\" id=\"payForm\" action=\"https://sandbox.payhere.lk/pay/checkout\"> \n");
      out.write("                <input type=\"hidden\" name=\"merchant_id\" value=\"1211283\">\n");
      out.write("                <input type=\"hidden\" name=\"return_url\" value=\"http://localhost:8084/Wooly_Wonder/orderSave?pay=200\">\n");
      out.write("                <input type=\"hidden\" name=\"cancel_url\" value=\"http://localhost:8084/Wooly_Wonder/orderSave?pay=500\">\n");
      out.write("                <input type=\"hidden\" name=\"notify_url\" value=\"http://localhost:8084/Wooly_Wonder/orderSave?pay=200\">\n");
      out.write("                <input type=\"hidden\" name=\"order_id\">\n");
      out.write("                <input type=\"hidden\" name=\"items\" value=\"Wooly Wonder\"><br>\n");
      out.write("                <input type=\"hidden\" name=\"currency\" value=\"LKR\">\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-6\" style=\"padding-left: 80px;\">\n");
      out.write("                    <!--SHIPPING METHOD-->\n");
      out.write("                    <div class=\"panel panel\">\n");
      out.write("                        <div class=\"panel-heading\">Delivery Address</div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <h4>Shipping Address</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-6 col-xs-12\"><br>\n");
      out.write("                                    <strong>First Name:</strong><br><br>\n");
      out.write("                                    <input required=\"\" type=\"text\" name=\"first_name\" id=\"first_name\" class=\"form-control\" value=\"\"  onkeypress=\"return isAlfa(event)\"/>\n");
      out.write("                                    <span id=\"alertfirstname\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"span1\"></div>\n");
      out.write("                                <div class=\"col-md-6 col-xs-12\"><br>\n");
      out.write("                                    <strong>Last Name:</strong><br><br>\n");
      out.write("                                    <input required=\"\" type=\"text\" name=\"last_name\" id=\"last_name\" class=\"form-control\" value=\"\" onkeypress=\"return isAlfa(event)\" />\n");
      out.write("                                    <span id=\"alertplastname\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <strong>Address:</strong><br><br></div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <input required=\"\" type=\"text\" name=\"address\" id=\"address\" class=\"form-control\" value=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-12\"><br>\n");
      out.write("                                    <strong>Email</strong><br><br>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <input required=\"\" type=\"text\" name=\"email\" id=\"email\" class=\"form-control\" value=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-12\"><br>\n");
      out.write("                                    <strong>City:</strong><br><br></div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <input required=\"\" type=\"text\" name=\"city\" id=\"city\" class=\"form-control\" value=\"\" onkeypress=\"return isAlfa(event)\" />\n");
      out.write("                                    <span id=\"alertcity\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <br><strong>District:</strong><br><br></div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <input required=\"\" type=\"text\" name=\"district\" id=\"district\" class=\"form-control\" value=\"\" onkeypress=\"return isAlfa(event)\"/>\n");
      out.write("                                    <span id=\"alertdistrict\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-12\"><br>\n");
      out.write("                                    <strong>Country</strong><br><br>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <input required=\"\" type=\"text\" name=\"country\" id=\"country\" class=\"form-control\" value=\"Sri Lanka\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-12\"><br>\n");
      out.write("                                    <strong>Phone Number:</strong><br><br></div>\n");
      out.write("                                <div class=\"col-md-12\"><input required=\"\" type=\"text\" name=\"phone_number\" id=\"phone_number\" class=\"form-control\" value=\"\" onkeypress=\"return isNumber(event)\" />\n");
      out.write("                                    <span id=\"alertphoneno\" class=\"text-danger\" ></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-5\"  style=\"padding-left: 40px;\">\n");
      out.write("                    <!--REVIEW ORDER-->\n");
      out.write("                    <div class=\"panel pane-info\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h2> Order Summery & Payment</h2><div class=\"pull-right\"><h4><a class=\"afix-1\" href=\"mybag.jsp\">Update My Bag</a></h4></div>\n");
      out.write("                        </div>\n");
      out.write("                        <br><br>\n");
      out.write("                        ");
  for (Bag bag : baglist) {
                                Product p = bag.getProduct();

                        
      out.write("\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <h5><div class=\"col-sm-12\">");
      out.print( p.getName());
      out.write("</div></h5><br>\n");
      out.write("                                    <h5><div class=\"col-sm-12\">Quantity:<span>");
      out.print(bag.getQty());
      out.write("</span></h5></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <h5><span>Rs:</span>");
      out.print( bag.getQty() * p.getPrice());
      out.write("</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div><hr></div>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write(" <div class=\"col-sm-6\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <strong><h3>Total</h3></strong>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      double d = 0.0;
                        double sd = 0.0;
                        for (Bag bag : baglist) {
                            Product p = bag.getProduct();
                            for (int i = 0; i < baglist.size(); i++) {
                            }
                            d += bag.getQty() * p.getPrice();
                            sd += p.getShipping();
                        }
                    
      out.write("\n");
      out.write("                    <div class=\"pull-right\">\n");
      out.write("                        <span><h3>Rs:");
      out.print(d);
      out.write("</h3></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write(" </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <strong><h3>Sub Total Including Delivery</h3></strong>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-right\"><span><h3>Rs:");
      out.print(d + sd);
      out.write("</h3> </span></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        <input type=\"hidden\" name=\"amount\" id=\"payAmount\" value=\"");
      out.print( d + sd);
      out.write("\">\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("            <button id=\"paybutton\"  class=\"btn btn-default\" type=\"button\" onclick=\"preordersave();\">Pay</button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--    <br><br>Item Details<br>\n");
      out.write("        <input type=\"text\" name=\"order_id\" value=\"ItemNo12345\">\n");
      out.write("        <input type=\"text\" name=\"items\" value=\"Door bell wireless\"><br>\n");
      out.write("        <input type=\"text\" name=\"currency\" value=\"LKR\">\n");
      out.write("        <input type=\"text\" name=\"amount\" value=\"1000\">  \n");
      out.write("        <br><br>Customer Details<br>\n");
      out.write("        <input type=\"text\" name=\"first_name\" value=\"Saman\">\n");
      out.write("        <input type=\"text\" name=\"last_name\" value=\"Perera\"><br>\n");
      out.write("        <input type=\"text\" name=\"email\" value=\"samanp@gmail.com\">\n");
      out.write("        <input type=\"text\" name=\"phone\" value=\"0771234567\"><br>\n");
      out.write("        <input type=\"text\" name=\"address\" value=\"No.1, Galle Road\">\n");
      out.write("        <input type=\"text\" name=\"city\" value=\"Colombo\">\n");
      out.write("        <input type=\"hidden\" name=\"country\" value=\"Sri Lanka\"><br><br> -->\n");
      out.write("    <!--    <input type=\"submit\" value=\"Buy Now\">   -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function isAlfa(evt) {\n");
      out.write("        evt = (evt) ? evt : window.event;\n");
      out.write("        var charCode = (evt.which) ? evt.which : evt.keyCode;\n");
      out.write("        if (charCode > 31 && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122)) {\n");
      out.write("            document.getElementById('alertfirstname').innerHTML = \"**Please enter character**\";\n");
      out.write("            document.getElementById('alertplastname').innerHTML = \"**Please enter character**\";\n");
      out.write("            document.getElementById('alertcity').innerHTML = \"**Please enter character**\";\n");
      out.write("            document.getElementById('alertdistrict').innerHTML = \"**Please enter character**\";\n");
      out.write("            document.getElementById('alertphoneno').innerHTML = \"**Please enter character**\";\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        document.getElementById('alertfirstname').innerHTML = \"\";\n");
      out.write("        document.getElementById('alertplastname').innerHTML = \"\";\n");
      out.write("        document.getElementById('alertcity').innerHTML = \"\";\n");
      out.write("        document.getElementById('alertdistrict').innerHTML = \"\";\n");
      out.write("        document.getElementById('alertphoneno').innerHTML = \"\";\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function isNumber(evt) {\n");
      out.write("        evt = (evt) ? evt : window.event;\n");
      out.write("        var charCode = (evt.which) ? evt.which : evt.keyCode;\n");
      out.write("        if (charCode > 31 && (charCode < 48 || charCode > 57)) {\n");
      out.write("            document.getElementById('alertphoneno').innerHTML = \"**Please enter Number**\";\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        document.getElementById('alertphoneno').innerHTML = \"\";\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function preordersave() {\n");
      out.write("        var req = new XMLHttpRequest();\n");
      out.write("        req.onreadystatechange = function () {\n");
      out.write("            if (req.readyState == 4 && req.status == 200) {\n");
      out.write("                if (req.responseText == \"OK\") {\n");
      out.write("                    $(payForm).submit();\n");
      out.write("                } else {\n");
      out.write("                    alert(\"Error. Try again.\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        };\n");
      out.write("        req.open(\"POST\", \"orderSave\", true);\n");
      out.write("        req.setRequestHeader(\"Content-type\", \"application/x-www-form-urlencoded\");\n");
      out.write("        var paras = \"pay=pre\"\n");
      out.write("                + \"&first_name=\" + $(first_name).val()\n");
      out.write("                + \"&last_name=\" + $(last_name).val()\n");
      out.write("                + \"&address=\" + $(address).val()\n");
      out.write("                + \"&email=\" + $(email).val()\n");
      out.write("                + \"&city=\" + $(city).val()\n");
      out.write("                + \"&district=\" + $(district).val()\n");
      out.write("                + \"&country=\" + $(country).val()\n");
      out.write("                + \"&phone_number=\" + $(phone_number).val()\n");
      out.write("                + \"&total=");
      out.print( d);
      out.write("\"\n");
      out.write("                + \"&subtotal=");
      out.print( d + sd);
      out.write("\";\n");
      out.write("        console.log(paras);\n");
      out.write("        req.send(paras);\n");
      out.write("    }\n");
      out.write("</script>\n");
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
