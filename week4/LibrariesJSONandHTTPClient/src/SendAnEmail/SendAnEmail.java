/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendAnEmail;

import java.util.Scanner;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author root
 */
public class SendAnEmail {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your E-mail: ");
        String loginEmail = sc.nextLine();
        
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        
        System.out.print("Enter receiver E-mail: ");
        String receiverEmail = sc.nextLine();
        
        
        
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("/root/TestingFiles/pic.gif");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture of a horse.");
        attachment.setName("Horse");
        
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(loginEmail,password));
        email.setSSLOnConnect(true);
        try{
            
            email.setFrom(loginEmail);
            email.setSubject("Horse Picture Email");
            email.setMsg("This contains a pic of a horse");
            email.addTo(receiverEmail);
            email.attach(attachment);
            System.out.println("Sending ...");
            email.send();
            System.out.println("Email sent!");
        }catch(Exception e){
            System.out.println("Email not sent");
            e.printStackTrace();
        }
        
        
    }
    
}
