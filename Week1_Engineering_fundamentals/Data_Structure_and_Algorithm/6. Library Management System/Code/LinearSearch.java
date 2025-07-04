public class LinearSearch {
    public static void searchByTitle(Book[] books, String searchTitle) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found using Linear Search:");
                book.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found using Linear Search.");
        }
    }
}
