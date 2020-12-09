package Servlet;

import Cart.DBBag;
import Cart.SessionBag;
import Pojos.Account;
import Pojos.Bag;
import Pojos.Product;
import hibernate.HibernateSession;
import static hibernate.HibernateSession.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class Login extends HttpServlet {

    /**
     * Mokatada use kare?
     */
    private static final String LOGIN_ACCOUNT = "loginAccount";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = getSession();
        String action = req.getParameter("action");
        if (action.equals("signin")) {
            HashMap<String, Object> map = new HashMap();
            map.put("email", req.getParameter("email"));

            String gsignin = req.getParameter("gsignin");
            if (gsignin == null || !gsignin.equals("1")) {
                map.put("password", req.getParameter("password"));
            }

//            System.out.println(gsignin);
//            System.out.println(map);
            if (login(req, session, map)) {
                if (gsignin == null || !gsignin.equals("1")) {
                    if (req.getParameter("re") != null) {
                        Cookie c1 = new Cookie("username", req.getParameter("email"));
                        c1.setMaxAge(30 * 24 * 60 * 60);
                        resp.addCookie(c1);

                        Cookie c2 = new Cookie("pass", req.getParameter("password"));
                        c2.setMaxAge(30 * 24 * 60 * 60);
                        resp.addCookie(c2);
                    }
                }
                resp.sendRedirect("index.jsp");
            } else {
                resp.sendRedirect(req.getContextPath() + "/Login_Signup/Login.jsp?error=1");
            }
        }
    }

    public static Account getLoggedInAccount(HttpSession httpSession) {
        return (Account) httpSession.getAttribute(LOGIN_ACCOUNT);
    }

    public boolean login(HttpServletRequest req, Session session, HashMap<String, Object> map) {

        Criteria cr = HibernateSession.createCriteria(session, Account.class);
        addeqRestrictions(map, cr);

        Account account = (Account) cr.uniqueResult();

        if (account != null) {//login success
            req.getSession().setAttribute(LOGIN_ACCOUNT, account);
            actions(req, session, account);
            return true;
        } else {
            return false;
        }
    }

    private void actions(HttpServletRequest req, Session session, Account account) {
        SessionBag sessionBag = new SessionBag();
        DBBag dbBag = new DBBag();

        List<Bag> dbBags = dbBag.getBag(session, account);
        List<Bag> sessionBags = sessionBag.getBag(req.getSession());

        for (Bag sbag : sessionBags) {
            Product p = (Product) session.load(Product.class, sbag.getProduct().getId());
            boolean isInDBBag = false;
            
            for (Bag dbbag : dbBags) {
                if (p.getId().equals(dbbag.getProduct().getId())) {
                    int totalQty = (dbbag.getQty() + sbag.getQty());
                    if (totalQty > p.getQty()) {
                        dbbag.setQty(p.getQty());
                    } else {
                        dbbag.setQty(totalQty);
                    }
                    HibernateSession.update(session, dbbag);
                    session = HibernateSession.getSession();
                    isInDBBag = true;
                    break;
                }
            }
            
            if (!isInDBBag) {//db bag ake naththam
                sbag.setAccount(account);
                HibernateSession.save(session, sbag);
                session = HibernateSession.getSession();
            }
        }

        sessionBag.destroy(req.getSession());
    }
}
