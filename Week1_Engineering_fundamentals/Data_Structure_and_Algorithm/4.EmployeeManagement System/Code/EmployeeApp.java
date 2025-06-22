public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5); // Max 5 employees

        // Add employees
        manager.addEmployee(new Employee(101, "Ankit", "Developer", 40000));
        manager.addEmployee(new Employee(102, "Rahul", "Manager", 60000));
        manager.addEmployee(new Employee(103, "Neha", "Tester", 35000));

        // Display all
        manager.displayAllEmployees();

        // Search employee
        manager.searchEmployee(102);

        // Delete one
        manager.deleteEmployee(103);

        // Final state
        manager.displayAllEmployees();
    }
}
