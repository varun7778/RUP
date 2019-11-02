
import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class email {
     

public void send2() {


    final String username = "svarunanusheel@gmail.com"; //ur email
    final String password = "swapna20121973";

    Properties props = new Properties();
    props.put("mail.smtp.auth", true);
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }
});

    try {
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("svarunanusheel@gmail.com"));//ur email
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("svarunanusheel@gmail.com"));//u will send to
        message.setSubject("testing");    
        message.setText("PFA");
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        Multipart multipart = new MimeMultipart();


     
     
    //attached 1 --------------------------------------------
        String file = "D:\\chillyfacts.png";
        String fileName = "AnyName1";
    messageBodyPart = new MimeBodyPart();   
    DataSource source = new FileDataSource(file);      
    messageBodyPart.setDataHandler(new DataHandler(source));
    messageBodyPart.setFileName(fileName);
    multipart.addBodyPart(messageBodyPart);
    //------------------------------------------------------    
        message.setContent(multipart);

       
        System.out.println("sending");
        Transport.send(message);
        System.out.println("Done");
        
   

            
}catch (MessagingException e) {
        e.printStackTrace();
    }
  }
}
    
