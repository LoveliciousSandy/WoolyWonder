/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import Servlet.Login;
import hibernate.HibernateSession;
import java.util.HashMap;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class Request implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();

        if (Login.getLoggedInAccount(req.getSession()) == null) {
            String email = null, pass = null;

            Cookie ca[] = req.getCookies();
            if (ca == null) {
                return;
            }
            for (Cookie c : ca) {
                if (c.getName().equals("username")) {
                    email = c.getValue();
                } else if (c.getName().equals("pass")) {
                    pass = c.getValue();
                }
            }
            if (email != null && pass != null) {
                HashMap<String, Object> map = new HashMap();
                map.put("email", email);
                map.put("password", pass);
                System.out.println(map);
                Session session = HibernateSession.getSession();
                System.out.println(new Login().login(req, session, map));
            }
        }
    }

}
