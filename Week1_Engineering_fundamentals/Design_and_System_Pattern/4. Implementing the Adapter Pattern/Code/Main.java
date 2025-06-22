// This is the main class where we test different payment methods
public class Main {
    public static void main(String[] args) {
        // Step 1: Create adapter for PayPal and make payment
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(1000.00); // Output: Paid ₹1000.0 using PayPal.

        // Step 2: Create adapter for Stripe and make payment
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        stripe.processPayment(500.50); // Output: Processed ₹500.5 using Stripe.

        // Step 3: Create adapter for Razorpay and make payment
        PaymentProcessor razorpay = new RazorpayAdapter(new RazorpayGateway());
        razorpay.processPayment(750.75); // Output: Payment of ₹750.75 done via Razorpay.
    }
}
