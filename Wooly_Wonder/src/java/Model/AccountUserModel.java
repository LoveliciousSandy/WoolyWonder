/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Pojos.Account;
import hibernate.HibernateSession;
import org.hibernate.Session;

public class AccountUserModel {

    public AccountUserModel() {
    }

    public void saveUser(Session s, Account user) {
        HibernateSession.save(s, user);
    }

    public void updateUser(Session s, Account user) {
        HibernateSession.saveOrUpdate(s, user);
    }

}
