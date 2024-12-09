package ankitrajaEmsProject.com.Event.Management.System.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailSenderUtil {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String to, String subject , String message){
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(to);
        email.setSubject(subject);
        email.setText(message);
        email.setFrom("ankitraja000@gamil.com");

        mailSender.send(email);
    }
    public void sendEventConfirmationEmail(String to, String eventName, String eventDate) {
        String subject = "Event Registration Confirmation";
        String message = "Thank you for registering for " + eventName + " on " + eventDate + ". We look forward to seeing you!";

        sendEmail(to, subject, message);

}
}
