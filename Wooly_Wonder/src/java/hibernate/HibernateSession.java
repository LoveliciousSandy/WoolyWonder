/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.HashMap;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Senani
 */
public class HibernateSession {

    public static Session getSession() {
        
        /*StackTraceElement[] st = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : st) {
            System.out.println(stackTraceElement.toString());
        }***** DON'T DELETE */
        
        Session session = Connection.NewHibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public static void save(Session session, Object ob) {
        if (!session.isOpen()) {
            session = getSession();
        }
        try {
            Transaction transaction = session.beginTransaction();
            session.save(ob);
            session.flush();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
    }

    public static void saveOrUpdate(Session s, Object ob) {
        if (!s.isOpen()) {
            s = getSession();
        }
        try {
            Transaction tr = s.beginTransaction();
            s.saveOrUpdate(ob);
            s.flush();
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        s.close();
    }

    public static void delete(Session s, Object ob) {
        if (!s.isOpen()) {
            s = getSession();
        }
        try {
            Transaction tr = s.beginTransaction();
            s.delete(ob);
            s.flush();
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        s.close();
    }

    public static void update(Session s, Object ob) {
        if (!s.isOpen()) {
            s = getSession();
        }
        try {
            Transaction tr = s.beginTransaction();
            s.update(ob);
            s.flush();
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        s.close();
    }

    public static <T> T Load(Session s, Class<T> X, String str) {
        return (T) s.load(X, Integer.parseInt(str));
    }
    
   

    public static void addeqRestrictions(HashMap<String, Object> r, Criteria c) {
        for (Map.Entry<String, Object> entry : r.entrySet()) {
            c.add(Restrictions.eq(entry.getKey(), entry.getValue()));
        }
    }

    public static Criteria createCriteria(Session s, Class b) {
        Criteria createcriteria = s.createCriteria(b);
        return createcriteria;
    }

}
