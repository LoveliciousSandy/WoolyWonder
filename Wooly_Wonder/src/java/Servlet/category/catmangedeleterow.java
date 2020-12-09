/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.category;

import Model.Category.CategoryModel;
import Pojos.ProductSubcategory;
import hibernate.HibernateSession;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class catmangedeleterow extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session s = HibernateSession.getSession();
        String action = req.getParameter("action");
        if (action.equals("disable")) {
            String v2 = req.getParameter("v2");
            Criteria c1 = HibernateSession.createCriteria(s, ProductSubcategory.class);
            List<ProductSubcategory> li = c1.list();
            for (ProductSubcategory productSubcategory : li) {
                if (v2.equals(productSubcategory.getId().toString())) {
                    productSubcategory.setStatus("Disable");
                    CategoryModel cm = new CategoryModel();
                    cm.changestatus(s, productSubcategory);
//                    resp.getWriter().write("msg=1");
//                    return;
                }
            }
        } else if (action.equals("active")) {
            String v3 = req.getParameter("v3");
            Criteria c1 = HibernateSession.createCriteria(s, ProductSubcategory.class);
            List<ProductSubcategory> li = c1.list();
            for (ProductSubcategory productSubcategory : li) {
                if (v3.equals(productSubcategory.getId().toString())) {
                    productSubcategory.setStatus("Active");
                    CategoryModel cm = new CategoryModel();
                    cm.changestatus(s, productSubcategory);
//                    resp.getWriter().write("msg=1");
//                    return;
                }
            }
        }

        resp.sendRedirect("Admin_panel/category.manage.jsp?tab=Categories");
    }

}
