/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.AccountUserModel;
import Pojos.Account;
import static hibernate.HibernateSession.getSession;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class userprofile extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = getSession();
        String action = req.getParameter("action");
        Account la = Login.getLoggedInAccount(req.getSession());
        String aid = la.getId().toString();
        Account acc = hibernate.HibernateSession.Load(session, Account.class, aid);
        AccountUserModel am = new AccountUserModel();
        try {
            if (action.equals("in")) {
                la.setPhone(req.getParameter("tp"));
                am.updateUser(session, la);
                resp.sendRedirect("userprofile.jsp?msg=1");

            } else if (action.equals("pw")) {
                String password1 = acc.getPassword();
                String p1 = req.getParameter("p1");
                if (password1.equals(p1)) {
                    acc.setPassword(req.getParameter("p2"));
                    am.updateUser(session, acc);
                    resp.sendRedirect("userprofile.jsp?msg=2");
                } else {
                    resp.sendRedirect("userprofile.jsp?msg=0");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
