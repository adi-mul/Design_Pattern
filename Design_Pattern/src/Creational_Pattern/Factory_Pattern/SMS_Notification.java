public class SMS_Notification implements Notification {

    @Override
    public void send(String message) {
        try {
            System.out.println("Sending SMS notification" + message);
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Unimplemented method 'send'" + e);
        }

    }

}
