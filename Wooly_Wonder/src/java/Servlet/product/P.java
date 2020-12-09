/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.product;

import Pojos.Product;
import hibernate.HibernateSession;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Senani
 */
public class P {

    public static void main(String[] args) {
        pagination();
    }

    private static void pagination() {
        try {
            int pageno = 1;
            int pagesize = 2;
            Session ses = HibernateSession.getSession();
            Criteria cr1 = HibernateSession.createCriteria(ses, Product.class);
            cr1.add(Restrictions.eq("status", "Active"));
            while (pageno < cr1.list().size()) {
                System.out.println(cr1.list().size());
                System.out.println("pageno   " + (pageno/pagesize));
                cr1.setFirstResult(pageno - 1);
                cr1.setMaxResults(pagesize);
                List<Product> plist = cr1.list();
                for (Product product : plist) {
                    System.out.println(product.getName());
                }
                pageno += pagesize;
                System.out.println("-----------------------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
