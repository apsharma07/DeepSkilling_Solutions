// This interface defines the method that all payment methods must follow
public interface PaymentStrategy {
    void pay(double amount);  // This method will be used to make payment
}
