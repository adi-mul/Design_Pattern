package Structural_Pattern.Adapter_Pattern;

public class PaymentPaytmAdapter implements PaymentProcessor {

    private Paytm_API pay;

    PaymentPaytmAdapter(Paytm_API api) {
        this.pay = api;
    }

    @Override
    public void processPayment(double amount, double id) {
        try {
            pay.paytm_payment(amount, id);
        } catch (Exception e) {
            throw e;
        }
    }

}
