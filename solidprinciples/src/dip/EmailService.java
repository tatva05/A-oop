package dip;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent with message: " + message);
    }
}
