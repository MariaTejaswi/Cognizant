// package Week-1.Design-Patterns.StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }

}
