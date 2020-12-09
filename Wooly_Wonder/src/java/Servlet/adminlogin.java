/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Pojos.Account;
import hibernate.HibernateSession;
import static hibernate.HibernateSession.getSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Senani
 */
public class adminlogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String inemail=request.getParameter("inputEmail");
        String inpass= request.getParameter("inputPassword");
        
        Session session = getSession();
        HashMap<String, Object> hm = new HashMap();
        hm.put("email",inemail);
        hm.put("password",inpass);
       

        
        if (adminlogin(request, session, hm)) {
            if (inemail== null||inpass==null) {
                response.sendRedirect(request.getContextPath() + "/Admin_panel/admin.jsp?error=1");
            }
          response.sendRedirect(request.getContextPath() + "/Admin_panel/adminpanel.jsp");   
        }else{
        response.sendRedirect(request.getContextPath() + "/Admin_panel/admin.jsp?error=1");
        }
    }
    

    public boolean adminlogin(HttpServletRequest request, Session session, HashMap<String, Object> mp) {
        Criteria cr = HibernateSession.createCriteria(session, Account.class);
        for (Map.Entry<String, Object> entry : mp.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            cr.add(Restrictions.eq(key, value));
        }
        Account account = (Account) cr.uniqueResult();
       
        if (account != null) {

            return true;

        } else {
            return false;
        }
    }

}
