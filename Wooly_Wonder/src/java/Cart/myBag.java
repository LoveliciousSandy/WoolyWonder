/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import Pojos.Account;
import Pojos.Bag;
import Pojos.Product;
import Servlet.Login;
import hibernate.HibernateSession;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class myBag extends HttpServlet {

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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text;charset=UTF-8");
        
        System.out.println("1");
        Session s = HibernateSession.getSession();
        System.out.println("2");

        if (request.getParameter("add") != null) {
        System.out.println("3");

            Account a = Login.getLoggedInAccount(request.getSession());
        System.out.println("4");
            Product product = (Product) HibernateSession.getSession().load(Product.class, Integer.parseInt(request.getParameter("pid")));
            int qty = Integer.parseInt(request.getParameter("qty"));

            if (a == null) {
        System.out.println("5");
                SessionBag sesbag = new SessionBag();
                int curQty = qty;
                for (Bag bag : sesbag.getBag(request.getSession())) {
                    if (bag.getProduct().getId().equals(product.getId())) {
                        curQty += bag.getQty();
                    }
                }
                if (curQty > product.getQty()) {
                    response.getWriter().write("QtyHigh");
                    return;
                }
                new SessionBag().addToBag(request.getSession(), product, a, qty);
            } else {
                DBBag dbbag = new DBBag();
                int curQty = qty;
                for (Bag bag : dbbag.getBag(s, Login.getLoggedInAccount(request.getSession()))) {
                    if (bag.getProduct().getId().equals(product.getId())) {
                        curQty += bag.getQty();
                    }
                }
                if (curQty > product.getQty()) {
                    response.getWriter().write("QtyHigh");
                    return;
                }
                new DBBag().addToBag(s, product, a, qty);
            }

        } else if (request.getParameter("remove") != null) {
            Account a = Login.getLoggedInAccount(request.getSession());
            if (a == null) {
                Product p = new Product();
                new SessionBag().removeFromBag(request.getSession(), (Product) HibernateSession.getSession().load(Product.class, Integer.parseInt(request.getParameter("pid"))));

            } else {
                new DBBag().removeFromBag(s, a, (Product) HibernateSession.getSession().load(Product.class, Integer.parseInt(request.getParameter("pid"))));
            }

        }
        response.getWriter().write("OK");

    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
