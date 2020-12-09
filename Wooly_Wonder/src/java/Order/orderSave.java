/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import Cart.DBBag;
import Cart.SessionBag;
import Model.Pay.Pay;
import Model.Product.ProductModel;
import Pojos.Account;
import Pojos.Address;
import Pojos.Bag;
import Pojos.OrderDetails;
import Pojos.Orders;
import Pojos.PaymentReceived;
import Pojos.Product;
import Servlet.Login;
import hibernate.HibernateSession;
import java.io.IOException;
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
public class orderSave extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date = new Date();

        Account acc = Login.getLoggedInAccount(req.getSession());
        Address address = null;
        Orders orders = null;
        double subTotal = 0.0,
                total = 0.0;

        if (req.getParameter("pay") != null && req.getParameter("pay").equals("pre")) {

            subTotal = Double.parseDouble(req.getParameter("subtotal"));
            total = Double.parseDouble(req.getParameter("total"));

            address = new Address();
            address.setAccount(acc);
            address.setFirstname(req.getParameter("first_name"));
            address.setLastname(req.getParameter("last_name"));
            address.setAddress(req.getParameter("address"));
            address.setCity(req.getParameter("city"));
            address.setDistrict(req.getParameter("district"));
            address.setPhone(req.getParameter("phone_number"));

            orders = new Orders();
            orders.setAccount(acc);
            orders.setAddress(address);
            orders.setTotal(total);
            orders.setShipping(subTotal - total);
            orders.setStatus("Placed");
            orders.setDatetime(date);

            req.getSession().setAttribute("pay_address", address);
            req.getSession().setAttribute("pay_orders", orders);
            req.getSession().setAttribute("pay_subTotal", subTotal);
            req.getSession().setAttribute("pay_total", total);

            resp.getWriter().print("OK");
            return;
        } else {
            address = (Address) req.getSession().getAttribute("pay_address");
            orders = (Orders) req.getSession().getAttribute("pay_orders");
            subTotal = (double) req.getSession().getAttribute("pay_subTotal");
            total = (double) req.getSession().getAttribute("pay_total");

            if (address == null || orders == null) {
                resp.sendError(500);
                return;
            }
        }

        try {
            Session s1 = HibernateSession.getSession();
            DBBag dbBaglist = new DBBag();

            PaymentReceived paymentReceived = new PaymentReceived();
            paymentReceived.setPrice(subTotal);
            paymentReceived.setDatetime(date);
            Pay pay3 = new Pay();
            pay3.savePaymentReceived(s1, paymentReceived);

            s1 = HibernateSession.getSession();
            Pay pay1 = new Pay();
            pay1.saveAddress(s1, address);

            s1 = HibernateSession.getSession();
            Pay pay2 = new Pay();
            pay2.saveOrder(s1, orders);

            s1 = HibernateSession.getSession();
            for (Bag bag : dbBaglist.getBag(s1, acc)) {
                Product product = bag.getProduct();
                OrderDetails orderDetails = new OrderDetails();
                orderDetails.setOrders(orders);

                String id3 = product.getId().toString();
                Product pr = HibernateSession.Load(s1, Product.class, id3);
                orderDetails.setProduct(pr);

                orderDetails.setPaymentReceived(paymentReceived);
                orderDetails.setStatus("active");
                orderDetails.setShippedDt(date);
                orderDetails.setConfirmedDt(date);

                product.setQty(product.getQty() - bag.getQty());
                new ProductModel().updateProduct(s1, product);

                Pay pay4 = new Pay();
                pay4.saveOrderDetails(s1, orderDetails);

                s1 = HibernateSession.getSession();
            }
            s1 = HibernateSession.getSession();

            req.getSession().removeAttribute("pay_address");
            req.getSession().removeAttribute("pay_orders");
            req.getSession().removeAttribute("pay_subTotal");
            req.getSession().removeAttribute("pay_total");
            new DBBag().clearBag(s1, Login.getLoggedInAccount(req.getSession()));
            resp.sendRedirect("orderplaced.jsp?err=0");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }

        resp.sendRedirect("index.jsp?err=1");
    }

}
