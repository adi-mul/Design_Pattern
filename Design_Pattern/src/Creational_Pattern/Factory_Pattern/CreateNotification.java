abstract class CreateNotification {

    public abstract Notification createnotify();

    public void send(String message) {
        Notification not = createnotify();

        not.send(message);
    }

}
