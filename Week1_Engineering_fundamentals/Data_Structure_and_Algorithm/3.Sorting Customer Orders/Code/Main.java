public class Main {
    public static void main(String[] args) {
        Order[] orders1 = {
            new Order(101, "Ankit", 3000),
            new Order(102, "Rahul", 1500),
            new Order(103, "Neha", 4500),
            new Order(104, "Simran", 1200)
        };

        // Clone array for quick sort
        Order[] orders2 = orders1.clone();

        System.out.println("Original Orders:");
        for (Order order : orders1) order.display();

        // Bubble Sort
        System.out.println("\nSorted by Bubble Sort:");
        BubbleSort.sort(orders1);
        for (Order order : orders1) order.display();

        // Quick Sort
        System.out.println("\nSorted by Quick Sort:");
        QuickSort.sort(orders2, 0, orders2.length - 1);
        for (Order order : orders2) order.display();
    }
}
