// Model class for each product
public class Product {
    public int productId;
    public String productName;
    public int quantity;
    public double price;

    // Constructor
    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display product
    public void display() {
        System.out.println("Product ID: " + productId +
                           ", Name: " + productName +
                           ", Quantity: " + quantity +
                           ", Price: " + price);
    }
}
