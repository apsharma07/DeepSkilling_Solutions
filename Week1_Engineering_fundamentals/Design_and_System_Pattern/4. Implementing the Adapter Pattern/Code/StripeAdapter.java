// This adapter converts Stripe's method to our PaymentProcessor interface
public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway gateway) {
        this.stripeGateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.sendPayment(amount); // Internally calls Stripe's method
    }
}
