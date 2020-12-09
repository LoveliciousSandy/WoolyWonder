/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.product;

import Pojos.Product;
import Pojos.ProductImage;
import hibernate.HibernateSession;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Senani
 */
public class view_product extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Session ses = HibernateSession.getSession();
            Criteria cr1 = HibernateSession.createCriteria(ses, Product.class);
            cr1.add(Restrictions.eq("status", "Active"));
            List<Product> plist = cr1.list();
            JSONArray ja = new JSONArray();
            for (Product product : plist) {
                Criteria cr2 = HibernateSession.createCriteria(ses, ProductImage.class);
                cr2.add(Restrictions.eq("product", product));
                List<ProductImage> pilist = cr2.list();
                JSONObject jo = new JSONObject();
                if (pilist.isEmpty()) {
                    jo.put("image", "");
                } else {
                    jo.put("image", pilist.get(0).getUrl());
                }
                jo.put("id", product.getId() + "");
                jo.put("name", product.getName() + "");
                jo.put("price", product.getPrice() + "");
                ja.put(jo);
//              
            }

            resp.getWriter().write(ja.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
