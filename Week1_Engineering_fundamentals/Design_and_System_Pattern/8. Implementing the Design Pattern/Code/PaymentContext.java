// This class uses a PaymentStrategy (credit card, PayPal, etc.)
public class PaymentContext{
    private PaymentStrategy paymentStrategy;

    // Set the payment method (strategy) at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Perform the payment using the selected strategy
    public void payAmount(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method first.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
