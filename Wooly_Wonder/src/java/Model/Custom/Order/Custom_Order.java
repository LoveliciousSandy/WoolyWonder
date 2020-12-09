/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Custom.Order;

import Pojos.Request;
import hibernate.HibernateSession;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class Custom_Order {

    public Custom_Order() {

    }

    public void saveCustomOrder(Session session, Request request) {
        HibernateSession.save(session, request);
    }

}
