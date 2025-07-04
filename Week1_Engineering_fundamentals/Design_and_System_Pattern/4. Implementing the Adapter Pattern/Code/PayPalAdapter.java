// This adapter converts PayPal's method to match our PaymentProcessor interface
public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    // Constructor takes original PayPal class as input
    public PayPalAdapter(PayPalGateway gateway) {
        this.payPalGateway = gateway;
    }

    // This method adapts PayPal's makePayment() to processPayment()
    @Override
    public void processPayment(double amount) {
        payPalGateway.makePayment(amount); // Internally calls PayPal’s method
    }
}
