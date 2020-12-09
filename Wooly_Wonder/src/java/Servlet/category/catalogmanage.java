/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.category;

import Model.Category.CategoryModel;
import Pojos.ProductCategory;
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
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class catalogmanage extends HttpServlet {

    String p[];
    String param;
    String status = "Hidden";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session s = HibernateSession.getSession();
        String parameterValues[] = req.getParameterValues("v1");
        for (String parameterValue : parameterValues) {
            int length = parameterValue.length();
            System.out.println(length + "------------");
            for (int i = 0; i < length - 1; i++) {
                p = new String[i];

                System.out.println(p[i]);
            }
            Criteria c1 = HibernateSession.createCriteria(s, ProductSubcategory.class);
            List<ProductSubcategory> li = c1.list();
            for (int i = 0; i < parameterValue.length(); i++) {
                for (ProductSubcategory productSubcategory : li) {

                    if (parameterValue.equals(productSubcategory.getId().toString())) {
                        System.out.println(productSubcategory.getId() + "-" + parameterValue + "-" + "same");
                        ProductSubcategory psc = new ProductSubcategory();
                        psc.setStatus("Hidden");
                        CategoryModel cm = new CategoryModel();
                        cm.changestatus(s,psc);
                        resp.getWriter().write("msg=0");
                        
                        break;
                    } else {
                        System.out.println(productSubcategory.getId() + "-" + parameterValue + "-" + "notsame");

                    }
                }

            }
        }

    }

}
