// This is the common interface that all payment gateways will follow
public interface PaymentProcessor {
    // Method to process the payment
    void processPayment(double amount);
}
// This is a third-party payment gateway with its own method
class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Another payment gateway with different method name
class StripeGateway {
    public void sendPayment(double amount) {
        System.out.println("Processed " + amount + " using Stripe.");
    }
}

// Yet another gateway with its own method name
class RazorpayGateway {
    public void pay(double amount) {
        System.out.println("Payment of" + amount + " done via Razorpay.");
    }
}
