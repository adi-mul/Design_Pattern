package Structural_Pattern.Adapter_Pattern;

public class PaymentStripeAdapter implements PaymentProcessor {
    private Stripe_API stripe;
    private Paytm_API pay;

    public PaymentStripeAdapter(Stripe_API _stripe) {
        this.stripe = _stripe;
    }

    @Override
    public void processPayment(double amount, double id) {

        try {
            stripe.make_payment(amount, id);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'processPayment'" + e);
        }

    }

}
