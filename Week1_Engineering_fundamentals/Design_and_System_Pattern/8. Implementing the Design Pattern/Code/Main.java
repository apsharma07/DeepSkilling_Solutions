public class Main {
    public static void main(String[] args) {
        // Create context object
        PaymentContext context = new PaymentContext();

        // Use Credit Card for payment
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        context.setPaymentStrategy(creditCard);
        context.payAmount(1500.0);

        System.out.println("---------------------------");

        // Now use PayPal for payment
        PaymentStrategy paypal = new PayPalPayment("user@example.com");
        context.setPaymentStrategy(paypal);
        context.payAmount(800.0);
    }
}
