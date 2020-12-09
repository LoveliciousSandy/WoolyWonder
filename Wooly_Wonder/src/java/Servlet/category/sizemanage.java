/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.category;

import Model.Category.CategoryModel;
import Pojos.ProductSize;
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
public class sizemanage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session s = HibernateSession.getSession();
        String action = req.getParameter("action");
        Criteria c1 = s.createCriteria(ProductSize.class);
        List<ProductSize> l1 = c1.list();
        if (action.equals("active")) {
            String v4 = req.getParameter("v4");
            for (ProductSize ps : l1) {
                if (v4.equals(ps.getId().toString())) {
                    ps.setStatus("Active");
                    CategoryModel cm = new CategoryModel();
                    cm.changeSizestatus(s, ps);
//                    resp.getWriter().write("msg=1");
//                    return;

                }
            }

        } else if (action.equals("disable")) {
            String v5 = req.getParameter("v5");
            for (ProductSize ps : l1) {
                if (v5.equals(ps.getId().toString())) {
                    ps.setStatus("Disable");
                    CategoryModel cm = new CategoryModel();
                    cm.changeSizestatus(s, ps);
//                    resp.getWriter().write("msg=1");
//return;
                }

            }

        }

        resp.sendRedirect("Admin_panel/category.manage.jsp?tab=Sizers");
    }

}
