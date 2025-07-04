// This class simulates loading an image from a remote server
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();  // Simulate slow loading
    }

    // Simulate time-consuming loading
    private void loadFromServer() {
        System.out.println("Loading image from remote server: " + fileName);
    }

    // Displaying the image
    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }
}
