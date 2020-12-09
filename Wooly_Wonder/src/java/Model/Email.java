/*
*	Java Institute For Advanced Technology
*	Web Programming 2 Final Individual Project
*	 
*	SCN : 167343791
*	Name : Roshana Pitigala
*
*	Copyright (c) 2017 RoshSoft.
 */
package Model;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Roshana Pitigala
 */
public class Email {

    public static synchronized void send(String to_Email_Address, String title, String body) {

        String username = "woolywonder.nz@gmail.com";
        String password = "woolywonder2018";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(username, password);

            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to_Email_Address));

            message.setSubject(title);
            message.setContent(body, "text/html;charset=utf-8");
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validateEmail(String email) {
        if (email == "") {
            return false;
        }
        try {
            new InternetAddress(email).validate();
            return true;
        } catch (Exception ex) {
        }
        return false;
    }
}
