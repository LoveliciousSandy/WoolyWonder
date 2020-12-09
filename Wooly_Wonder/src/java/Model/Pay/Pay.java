/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Pay;

import Pojos.Address;
import Pojos.OrderDetails;
import Pojos.Orders;
import Pojos.PaymentReceived;
import hibernate.HibernateSession;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class Pay {

    public Pay() {
    }

    public void saveAddress(Session s, Address address) {
        HibernateSession.save(s, address);
    }

    public void saveOrder(Session s, Orders orders) {
        HibernateSession.save(s, orders);
    }

    public void savePaymentReceived(Session s, PaymentReceived paymentreceived) {
        HibernateSession.save(s, paymentreceived);
    }

    public void saveOrderDetails(Session s, OrderDetails orderdetails) {
        HibernateSession.save(s, orderdetails);
    }
}
