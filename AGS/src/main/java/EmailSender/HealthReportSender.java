package EmailSender;


import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

import Accounts.PilotAccount;

public class HealthReportSender {

    //this static method sends the file of pilot to the mail of the admin
    public static void SendHealthReport(String filepath, PilotAccount pilot){

        String senderEmail = "executiveexampleact@gmail.com";
        String senderPassword = "akmftwtqshmpuoyz";

        // Recipient's email address
        String recipientEmail = "executiveexampleact@gmail.com";

        // SMTP server details
        String smtpHost = "smtp.gmail.com";
        int smtpPort = 587;

        // Create properties for the mail session
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");



        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

 

        System.out.println("email is preparing");



        // Create a session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });



        try {
            // Create a new message
            Message message = new MimeMessage(session);

            // Set the sender and recipient addresses
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));

            // Set the subject
            message.setSubject("AGS: Health Report");

            // Create a multipart message
            Multipart multipart = new MimeMultipart();

            // Create the message body part
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("This email contains the health report of " + pilot.getName());

            // Add the message body part to the multipart
            multipart.addBodyPart(messageBodyPart);

            // Create the attachment body part
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();

            // Set the path to the file you want to attach
            //String filePath = "C:/Users/egeni/OneDrive/Desktop/DOCUMENT.oneshot.txt";
            attachmentBodyPart.attachFile(filepath);

            // Add the attachment body part to the multipart
            multipart.addBodyPart(attachmentBodyPart);

            // Set the content of the message to the multipart
            message.setContent(multipart);

            // Send the message
            Transport.send(message);

            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            System.out.println("Error sending email: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error attaching file: " + e.getMessage());
        }



    }
    
}
