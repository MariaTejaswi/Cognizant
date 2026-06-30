// package Week-1.Design-Patterns.AdapterPatternExample;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(5000);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(8000);

    }

}
