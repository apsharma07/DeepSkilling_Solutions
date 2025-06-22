// This class acts as a proxy to RealImage and loads it only when needed
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Lazy loading: create RealImage only when needed
        if (realImage == null) {
            realImage = new RealImage(fileName);  // Loads only once
        } else {
            System.out.println("Image already loaded. Using cached version.");
        }

        // Display the image
        realImage.display();
    }
}
