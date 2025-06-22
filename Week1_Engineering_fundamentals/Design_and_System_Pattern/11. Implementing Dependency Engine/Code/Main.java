public class Main {
    public static void main(String[] args) {
        // Step 1: Create repository object
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Step 2: Inject repository into service (Constructor Injection)
        CustomerService service = new CustomerService(repository);

        // Step 3: Use service to find and display customer
        service.displayCustomer(1);  // Known customer
        System.out.println("------------------");
        service.displayCustomer(2);  // Unknown customer
    }
}
