// This interface defines the contract for accessing customer data
public interface CustomerRepository {
    Customer findCustomerById(int id);
}
