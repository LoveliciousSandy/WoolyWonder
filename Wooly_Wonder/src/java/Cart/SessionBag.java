/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import Pojos.Account;
import Pojos.Bag;
import Pojos.Product;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Senani
 */
public class SessionBag {

    public List<Bag> getBag(HttpSession hh) {
        List<Bag> bag = (List<Bag>) hh.getAttribute("sbag");
        if (bag == null) {
            bag = new ArrayList();
            hh.setAttribute("sbag", bag);
        }
        return bag;
    }

    public void addToBag(HttpSession hs, Product product, Account account, int qty) {
        List<Bag> bagL = getBag(hs);
        Bag bag = new Bag();
        for (Bag b : bagL) {
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
        bagL.add(bag);
    }

    public boolean contains(List<Bag> blist, Product product) {
        if (blist == null) {
            return false;
        }
        for (Bag bag : blist) {
            if (bag.getProduct().getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    void removeFromBag(HttpSession hs, Product product) {
        List<Bag> bag = getBag(hs);
        if (bag == null || bag.isEmpty()) {
            return;
        }
        Bag remove = new Bag();
        for (Bag bag1 : bag) {
            if (bag1.getProduct().getId().equals(product.getId())) {
                remove = bag1;
                break;
            }
        }
        bag.remove(remove);
    }

    public void destroy(HttpSession hs) {
        hs.removeAttribute("sbag");
    }
}
