public class LibraryApp {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", "Yashavant Kanetkar"),
            new Book(102, "Operating Systems", "Galvin"),
            new Book(103, "Computer Networks", "Andrew Tanenbaum"),
            new Book(104, "Java Programming", "Herbert Schildt")
        };

        // Linear Search (unsorted list)
        LinearSearch.searchByTitle(books, "Java Programming");

        // Binary Search (requires sorted list)
        BinarySearch.sortBooksByTitle(books);  // Sort before binary search
        BinarySearch.searchByTitle(books, "Java Programming");
    }
}
