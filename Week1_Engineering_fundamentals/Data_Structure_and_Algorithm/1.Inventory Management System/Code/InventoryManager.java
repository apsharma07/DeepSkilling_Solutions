import java.util.HashMap;

public class InventoryManager {
    // HashMap to store products by productId
    private HashMap<Integer, Product> inventory = new HashMap<>();
    // Add a new product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product.getProductId());
    }

    // Update existing product
    public void updateProduct(int productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product.getProductId());
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    // Delete a product
    public void deleteProduct(int productId) {
        Product removed = inventory.remove(productId);
        if (removed != null) {
            System.out.println("Product deleted: " + removed.getProductId());
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    // Display all products
    public void displayAllProducts() {
        System.out.println("\n All Products in Inventory:");
        for (Product product : inventory.values()) {
            product.display();
        }
    }
}
