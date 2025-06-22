// This is the real implementation of CustomerRepository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(int id) {
        // Simulating database access (dummy data)
        if (id == 1) {
            return new Customer(1, "Ankit Kumar");
        } else {
            return new Customer(id, "Unknown Customer");
        }
    }
}
