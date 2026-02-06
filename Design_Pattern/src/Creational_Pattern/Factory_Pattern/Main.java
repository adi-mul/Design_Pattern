public class Main {

    public static void main(String[] args) {
        CreateNotification notify;

        notify = new EmailNotification_Creator();
        notify.send(" Hello");
        notify = new SMSNotification_Creator();
        notify.send(" Hello");
    }
}
