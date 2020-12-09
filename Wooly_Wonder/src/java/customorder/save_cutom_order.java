/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customorder;

import Model.Custom.Order.Custom_Order;
import Pojos.Product;
import Pojos.Request;
import hibernate.HibernateSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class save_cutom_order extends HttpServlet {

    String action;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      Date date2 = new Date();
        Session session = HibernateSession.getSession();

        try {
            Request request = new Request();
            Product product = HibernateSession.Load(session,Product.class,req.getParameter("productid"));
            request.setProduct(product);
            request.setPrice(Double.parseDouble(req.getParameter("produprice")));
            request.setColour(req.getParameter("pcolour"));
            request.setSize(req.getParameter("psize"));
           request.setDateTime(date2);
           request.setStatus("Placed");
            Custom_Order co = new  Custom_Order();
         co.saveCustomOrder(session,request);
          resp.sendRedirect(req.getContextPath() + "/customorder.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

   

}
