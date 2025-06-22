public class Main {
    public static void main(String[] args) {
        // Using proxy to load the image
        Image image1 = new ProxyImage("nature.jpg");

        // First time: image will load from remote
        image1.display();

        System.out.println("---------------------------");

        // Second time: image will NOT load again (cached)
        image1.display();
    }
}
