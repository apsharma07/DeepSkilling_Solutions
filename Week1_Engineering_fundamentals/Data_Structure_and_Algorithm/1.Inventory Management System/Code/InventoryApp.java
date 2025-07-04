public class InventoryApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding products
        manager.addProduct(new Product(101, "Laptop", 5, 55000.0));
        manager.addProduct(new Product(102, "Mobile", 15, 15000.0));

        // Display all
        manager.displayAllProducts();

        // Update a product
        manager.updateProduct(101, 10, 53000.0);

        // Delete a product
        manager.deleteProduct(102);

        // Final state
        manager.displayAllProducts();
    }
}
