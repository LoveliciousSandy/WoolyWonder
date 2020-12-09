/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Email;
import Pojos.Account;
import hibernate.HibernateSession;
import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Senani
 */
public class formForgotPassword extends HttpServlet {

    private Email email;
 String saltString = getSaltString();
String msg = "";    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      HttpSession httpses= req.getSession();
        Session ses = HibernateSession.getSession();
       
        String inputEmail = req.getParameter("inputEmail");
        try {
            Criteria createCriteria = HibernateSession.createCriteria(ses, Account.class);
        createCriteria.add(Restrictions.eq("email", inputEmail));
       Account acc=  (Account) createCriteria.uniqueResult();
          
       
      
              msg = "<div style=\"display: block; width: 80%; border: 1px solid rgba(149,165,166 ,0.20); padding: 10px; background-color:rgba(52,73,94 ,1); font-family: sans-serif;\">\n"
                            + "            <div style=\"display: block; width: 80%; text-align: center; margin-left: auto; margin-right: auto;  font-family: Georgia, serif; background-color:rgba(44,62,80 ,1); padding-top: 30px; padding-bottom: 30px;\">\n"
                            + "                <div style=\"width: 100%; display: block; margin-top: 40px; background-color: #979797; padding: 6px 0px 6px 0px; \">\n"
                            + "                    <h3 style=\"font-size: 30px; color: rgba(52,73,94 ,1);\">Welcome to <span style=\"color:#ffffff; \">Wooly Wonder<span style=\"color:#01579B; \"></span></span></h3>\n"
                            + "                </div>\n"
                            + "                <div style=\"width: 100%; display: block; color:#ecf0f1; \">\n"
                            + "                    <p>you can used this password and login your account.</p>\n"
                            + "                    <div style=\"width: 100%; display: block;\">\n"
                            + "                        <a style=\"border: none; background-color:red; color:#ecf0f1; font-size: 16px; font-weight: 700; cursor: pointer; padding: 15px 10px 15px 10px; margin: 10px 0px 10px 0px ; display: block; width: 400px; margin-left: auto; margin-right: auto;\">Your Password= " + acc.getPassword() + " </a>\n"
                            + "                        <h5 style=\"font-weight: 500; font-family: Arial, Helvetica, sans-serif;\">you can change password for the security of your account.!</h5>\n"
                            + "                        \n"
                            + "                    </div>\n"
                            + "                    <p>Thanks for helping us maintain the security of your account. The Wooly Wonder</p>\n"
                            + "                    <strong>www.woolywonder.com</strong>\n"
                            + "                </div>\n"
                            + "                <div style=\"background-color:#34495e; padding: 10px 0px 10px 0px ; margin-top: 20px; color: #bdc3c7;\">\n"
                            + "                    <p>© WoolyWonder. All rights reserved.</p>\n"
                            + "                </div>\n"
                            + "            </div>\n"
                            + "        </div>";
           email.send(acc.getEmail(),"Wooly Wonder Password",msg);
  
          resp.sendRedirect("forgotpassword");
         
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
