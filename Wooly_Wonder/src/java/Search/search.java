/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import Pojos.Product;
import Pojos.ProductCategory;
import Pojos.ProductImage;
import Pojos.ProductSize;
import Pojos.ProductSubcategory;
import hibernate.HibernateSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Senani
 */
public class search extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            Session s = HibernateSession.getSession();
            Criteria c1 = HibernateSession.createCriteria(s, Product.class);
            String subcategory = req.getParameter("i1");
            String min = req.getParameter("i2");
            String max = req.getParameter("i3");
//            JSONArray colours = new JSONArray(req.getParameter("i4"));
            String size = req.getParameter("i5");
            System.out.println("subCat: " + subcategory);
            System.out.println("min: " + min);
            System.out.println("max: " + max);
//            System.out.println("colours"+ colours);
            System.out.println("size"+ size);
//            
            

           

            if (subcategory != null && !subcategory.equals("0")) {
                ProductSubcategory productsubcategory = HibernateSession.Load(s, ProductSubcategory.class, subcategory);
                c1.add(Restrictions.eq("productSubcategory", productsubcategory));
            }

            if (min != null && max != null) {
                double m1 = Double.parseDouble(min);
                double m2 = Double.parseDouble(max);
                if (m2 > 0 && m1 >= 0) {
                    c1.add(Restrictions.between("price", m1, m2));
                }

            }

            if (size != null && size.equals(0)) {
                ProductSize pc = HibernateSession.Load(s, ProductSize.class,size);
               c1.add(Restrictions.eq("productSize", pc));
            }
            
            List<Product> product = c1.list();

            for (Product p : product) {
                ProductImage pi = (ProductImage) p.getProductImages().iterator().next();
                PrintWriter out = resp.getWriter();
                out.print("<div  class='col-sm-4' style='margin-top: 40px;'>");
                out.print("<img src='" + pi.getUrl() + "' alt='imge' width='250' height='270' style='border:2px solid black'/>");
                out.print("<span id='pricetag'>Rs:" + p.getPrice() + "/=</span>" + "<br>");
                out.print("<p>" + p.getName() + "</p>");
                out.print("<button id='viewdetails' class='btn btn-default' onclick ='viewdetails('" + p.getId() + "')>View Details</button>");
                out.print("<br>");
                out.print("<br>");
                out.print("</div>");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
