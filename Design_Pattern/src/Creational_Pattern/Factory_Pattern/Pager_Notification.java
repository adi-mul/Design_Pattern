public class Pager_Notification implements Notification {

    @Override
    public void send(String message) {
        try {
            System.out.println("Sending pager notification" + message);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'send'" + e);
        }

    }

}
