/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.product;

import Model.Product.ProductModel;
import Pojos.Product;
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

/**
 *
 * @author Senani
 */
public class productmanage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session s = HibernateSession.getSession();
        String action = req.getParameter("action");
        String v1 = req.getParameter("v1");
        String v2 = req.getParameter("v2");
        Criteria c1 = s.createCriteria(Product.class);
        List<Product> l1 = c1.list();
        if (action.equals("active")) {
            for (Product product : l1) {
                if (v1.equals(product.getId().toString())) {
                    product.setStatus("Active");
                    ProductModel pm = new ProductModel();
                    pm.changeProductStatus(s, product);
                }
            }
        } else if (action.equals("disable")) {
            for (Product product : l1) {
                if (v2.equals(product.getId().toString())) {
                    product.setStatus("Disable");
                    ProductModel pm = new ProductModel();
                    pm.changeProductStatus(s, product);
                }
            }
        }
        resp.sendRedirect("Admin_panel/products.manage.jsp");

    }
}
