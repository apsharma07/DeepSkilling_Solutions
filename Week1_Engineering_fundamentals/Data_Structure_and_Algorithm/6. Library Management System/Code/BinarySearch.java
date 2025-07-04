import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(book -> book.title.toLowerCase()));
    }

    public static void searchByTitle(Book[] books, String searchTitle) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(searchTitle);

            if (cmp == 0) {
                System.out.println("Book found using Binary Search:");
                books[mid].display();
                return;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Book not found using Binary Search.");
    }
}
