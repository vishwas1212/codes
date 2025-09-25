package concepts.designpatterns.behavioral;
/*
Use Case: Sorting with different strategies, payment methods, etc.
 */
public interface PaymentStrategy {
    void payment(int amount);
}

class CreditCardPayment implements PaymentStrategy {

    @Override
    public void payment(int amount) {
        System.out.println("Paid " + amount + " Using Credit Card!");
    }
}

class PayPalPayment implements PaymentStrategy {

    @Override
    public void payment(int amount) {
        System.out.println("Paid " + amount + " Using PayPal!");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.payment(amount);
    }
}
