// This class depends on CustomerRepository
public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection: dependency provided via constructor
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Method to display customer details
    public void displayCustomer(int id) {
        Customer customer = customerRepository.findCustomerById(id);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}
