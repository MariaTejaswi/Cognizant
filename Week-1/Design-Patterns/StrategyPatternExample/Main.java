// package Week-1.Design-Patterns.StrategyPatternExample;

public class Main {

    public static void main(String[] args) {

        PaymentContext payment;

        // Credit Card Payment
        payment = new PaymentContext(new CreditCardPayment());
        payment.executePayment(5000);

        // PayPal Payment
        payment = new PaymentContext(new PayPalPayment());
        payment.executePayment(2500);

    }

}
