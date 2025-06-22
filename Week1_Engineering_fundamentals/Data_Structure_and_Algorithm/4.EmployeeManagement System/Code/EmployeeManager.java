public class EmployeeManager {
    private Employee[] employees;
    private int size;  // current number of employees

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add a new employee
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
            System.out.println("Employee added: " + emp.name);
        } else {
            System.out.println(" Cannot add more employees. Array is full.");
        }
    }

    // Search employee by ID
    public void searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                System.out.println(" Employee found:");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found with ID: " + id);
    }

    // Traverse all employees
    public void displayAllEmployees() {
        System.out.println("\n Employee List:");
        for (int i = 0; i < size; i++) {
            employees[i].display();
        }
    }

    // Delete employee by ID
    public void deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                // Shift elements to the left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Employee deleted with ID: " + id);
                return;
            }
        }
        System.out.println(" Employee not found to delete.");
    }
}
