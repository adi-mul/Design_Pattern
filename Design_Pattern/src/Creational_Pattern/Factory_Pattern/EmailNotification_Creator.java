public class EmailNotification_Creator extends CreateNotification {

    @Override
    public Notification createnotify() {
        try {
            return new Email_Notification();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'createnotify'");
        }

    }

}
