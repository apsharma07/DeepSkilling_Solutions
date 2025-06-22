public class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    // Linear Search implementation and return Product
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Serach implementation and return Product 
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    // Constructor for initializing the values
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Comparing given value with the object value
    public int compareTo(Product other) {
        return this.productName.compareTo(other.productName);
    }

    // Return String value 
    public String toString() {
        return "Product{" + "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' + '}';
    }
}
