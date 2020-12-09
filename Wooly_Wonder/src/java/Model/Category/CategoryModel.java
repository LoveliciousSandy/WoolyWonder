/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Category;

import Pojos.ProductCategory;
import Pojos.ProductColour;
import Pojos.ProductSize;
import org.hibernate.Session;
import Pojos.ProductSubcategory;
import hibernate.HibernateSession;

/**
 *
 * @author Senani
 */
public class CategoryModel {

    public CategoryModel() {
    }

    public void createcategory(Session session, ProductCategory productCategory) {
        HibernateSession.save(session, productCategory);

    }

    public void createSubcategory(Session session, ProductSubcategory subcategory) {
        HibernateSession.save(session, subcategory);
    }

    public void createSize(Session session, ProductSize productSize) {
        HibernateSession.save(session, productSize);

    }

    public void createColour(Session session, ProductColour productColour) {
        HibernateSession.save(session, productColour);
    }

    public void changestatus(Session s, ProductSubcategory productSubcategory) {
        HibernateSession.saveOrUpdate(s, productSubcategory);
    }

    public void updatecategory(Session ses, ProductCategory category) {
        HibernateSession.saveOrUpdate(ses, category);
    }

    public void updatesubcategory(Session ses, ProductSubcategory productSubcategory) {
        HibernateSession.update(ses, productSubcategory);
    }

    public void changeSizestatus(Session s, ProductSize ps) {
        HibernateSession.update(s, ps);
    }

    public void changeColourstatus(Session s, ProductColour pc) {
        HibernateSession.update(s, pc);
    }
}
