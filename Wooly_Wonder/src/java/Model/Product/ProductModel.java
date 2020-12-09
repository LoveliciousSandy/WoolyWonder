/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Product;

import Pojos.Product;
import hibernate.HibernateSession;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class ProductModel {

    public ProductModel() {
    }

    public void save_Product(Session s, Product product) {
        HibernateSession.save(s, product);
    }

    public void changeProductStatus(Session s, Product product) {
        HibernateSession.update(s, product);
    }

    public void updateProduct(Session session, Product product) {
        HibernateSession.update(session, product);
    }

}
