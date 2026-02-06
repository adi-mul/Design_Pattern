public class SMSNotification_Creator extends CreateNotification {

    @Override
    public Notification createnotify() {
        // TODO Auto-generated method stub
        try {
            return new SMS_Notification();
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Unimplemented method 'createnotify'" + e);
        }

    }

}
