package Structural_Pattern.Adapter_Pattern;

class Stripe_API {
    public void make_payment(double amount, double id) {
        System.out.println("Payment of amount " + amount + " successfuly using Stripe gateway");
    }

}

class Paytm_API {
    public void paytm_payment(double amount, double id) {
        System.out.println("Payment of amount " + amount + " successfuly using Paytm gateway");
    }

}

public class ThirdPartyPaymentMethod {

}
