/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import Pojos.Account;
import Pojos.Bag;
import Pojos.Product;
import hibernate.HibernateSession;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Senani
 */
public class DBBag {

    public void clearBag(Session s, Account account) {
        List<Bag> bags = getBag(s, account);
        for (Bag bag : bags) {
            removeFromBag(s, account, bag.getProduct());
        }
    }

    public List<Bag> getBag(Session s, Account account) {
        Criteria cr = HibernateSession.createCriteria(s, Bag.class);
        cr.add(Restrictions.eq("account", account));
        return cr.list();
    }

    public void addToBag(Session s, Product product, Account account, int qty) {
        Bag bag = new Bag();

        for (Bag b : getBag(s, account)) {
            if (b.getProduct().getId().equals(product.getId())) {
                bag = b;
                break;
            }
        }

        bag.setProduct(product);
        bag.setAccount(account);
        if (bag.getQty() != null) {
            qty += bag.getQty();
        }
        bag.setQty(qty);
        HibernateSession.save(s, bag);
    }

    public boolean contains(List<Bag> blist, Product product) {
        for (Bag bag : blist) {
            if (bag.getProduct().getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    public void removeFromBag(Session s, Account account, Product product) {
        List<Bag> bag = getBag(s, account);
        if (bag == null) {
            return;
        }
        for (Bag bag1 : bag) {
            if (bag1.getProduct().getId().equals(product.getId())) {
                HibernateSession.delete(s, bag1);
                break;
            }
        }
    }

}
