package Servlet;

import Model.AccountUserModel;
import Pojos.Account;
import hibernate.HibernateSession;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Senani
 */
//@WebServlet(name = "register",urlPatterns = {"/register"})
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String username = req.getParameter("username");
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            Account account = new Account();
            account.setUsername(username);
            account.setEmail(email);
            account.setPassword(password);
            

            AccountUserModel accountusermodel = new AccountUserModel();
            accountusermodel.saveUser(HibernateSession.getSession(), account);
            resp.sendRedirect("Login_Signup/Login.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
