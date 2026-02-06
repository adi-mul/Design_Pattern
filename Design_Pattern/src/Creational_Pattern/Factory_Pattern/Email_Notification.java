public class Email_Notification implements Notification {

    @Override
    public void send(String message) {

        System.out.println("Sending email" + message);
    }

}
