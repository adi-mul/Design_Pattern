public class PagerNotification_Creator extends CreateNotification {

    @Override
    public Notification createnotify() {
        // TODO Auto-generated method stub
        try {

            return new Pager_Notification();
        } catch (Exception e) {
            // TODO: handle exception

            throw new UnsupportedOperationException("Unimplemented method 'createnotify'" + e);
        }

    }

}
