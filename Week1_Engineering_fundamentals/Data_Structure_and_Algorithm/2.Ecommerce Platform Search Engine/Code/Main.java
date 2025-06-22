import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Created various Products using an array for a class Product
        Product[] products = {
            new Product(101, "Sound Box", "Electronics"),
            new Product(102, "Trousers", "Clothing"),
            new Product(103, "Mouse", "Electronics"),
            new Product(104, "Apple", "Groceries"),
            new Product(104, "Car", "Toys"),
            new Product(104, "Socks", "Footwear")
        };

        // Applied Linear Search
        Product found = Product.linearSearch(products, "Car");
        System.out.println("Linear Search: " + (found != null ? found : "Not found"));
        // After Compilation the time complexity for linear search is O(N).
        /*
         * Best Case: O(1)
         * Average Case: O(N)
         * Worst Case: O(N)
         * It is Slower is the Data is large but it does not requires Sorting also.
         */
        
        
        //Applied Binary Search (after sorting)
        Arrays.sort(products);
        Product foundBinary = Product.binarySearch(products, "Car");
        System.out.println("Binary Search: " + (foundBinary != null ? foundBinary : "Not found"));
        /*
         * Binary Serach is only applicable after Sorting  the Array Values.
         * Time Complecxity after Sorting.
         * Best Case: O(N)
         * Average Case: O(logN)
         * Worst Case: O(logN)
         * It's Comparibly much faster than linear search.
         * It is much Suitaible for ECommerce platform as  it searches much faster and it is also suitable for large dataset.
         */
    }
}
