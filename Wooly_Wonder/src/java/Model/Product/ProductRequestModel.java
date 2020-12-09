/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Product;

import Pojos.ProductRequest;
import hibernate.HibernateSession;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class ProductRequestModel {

    public ProductRequestModel() {
    }

    public void saveProductRequest(Session s, ProductRequest productRequest) {
        HibernateSession.save(s, productRequest);
    }

    public void updateProductRequest(Session s, ProductRequest productRequest) {
        HibernateSession.update(s, productRequest);
    }
}
