/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.category;

import Model.Category.CategoryModel;
import Pojos.ProductColour;
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
public class colourmanage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session s = HibernateSession.getSession();
        String action = req.getParameter("action");
        Criteria c1 = s.createCriteria(ProductColour.class);
        List<ProductColour> l1 = c1.list();
        if (action.equals("active")) {
            String v4 = req.getParameter("v6");
            for (ProductColour pc : l1) {
                if (v4.equals(pc.getId().toString())) {
                    pc.setStatus("Active");
                    CategoryModel cm = new CategoryModel();
                    cm.changeColourstatus(s, pc);
//                    resp.getWriter().write("msg=1");
                }
            }

        } else if (action.equals("disable")) {
            String v5 = req.getParameter("v7");
            for (ProductColour pc : l1) {
                if (v5.equals(pc.getId().toString())) {
                    pc.setStatus("Disable");
                    CategoryModel cm = new CategoryModel();
                    cm.changeColourstatus(s, pc);
//                    resp.getWriter().write("msg=1");
                }

            }

        }
        resp.sendRedirect("Admin_panel/category.manage.jsp?tab=Colours");
    }

}
