package Structural_Pattern.Adapter_Pattern;

public class PaymentApp {

    public static void main(String[] args) {
        PaymentProcessor p = new PaymentPaytmAdapter(new Paytm_API());
        p.processPayment(300.0, 1.0);

        PaymentProcessor s = new PaymentStripeAdapter(new Stripe_API());
        s.processPayment(600, 2.0);
    }

}
