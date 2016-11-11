package Conexion;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class EnvioEmail {
   public static void EnvioEmail(String archivo, String destino) {
      String origen = "inmobiliariafrsf@gmail.com";

      final String username = "inmobiliariafrsf@gmail.com";
      final String password = "inmofrsf23";

      String host = "smtp.gmail.com";
      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      Session session = Session.getInstance(props,
         new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(username, password);
            }
         });

      try {
         Message message = new MimeMessage(session);

         message.setFrom(new InternetAddress(origen));

         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destino));

         message.setSubject("Confirmacion de reserva realizada - Inmobiliaria FRSF");

         BodyPart messageBodyPart = new MimeBodyPart();

         messageBodyPart.setText("Este correo confirma la reserva realizada por usted en la Inmobiliaria FRSF.\n"
                 + "Se adjunta a este correo el informe de la reserva realizada.\n"
                 + "Este correo se generó automáticamente. Por favor no responda el mismo.\n"
                 + "\n"
                 + "Inmobiliaria FRSF - Santa Fe, Santa Fe Argentina");

         Multipart multipart = new MimeMultipart();

         multipart.addBodyPart(messageBodyPart);

         messageBodyPart = new MimeBodyPart();
         DataSource source = new FileDataSource(archivo);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(archivo);
         multipart.addBodyPart(messageBodyPart);

         message.setContent(multipart);


         Transport.send(message);

      } catch (MessagingException e) {
         throw new RuntimeException(e);
      }
   }
}