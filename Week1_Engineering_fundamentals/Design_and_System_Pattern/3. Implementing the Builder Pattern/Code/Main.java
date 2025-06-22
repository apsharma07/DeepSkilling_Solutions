public class Main{
    public static void main(String[] args) {
        // Basic Computer with required parts
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();

        // High-end Computer with optional parts
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setKeyboard("Mechanical Keyboard")
                .setMonitor("27\" 4K Monitor")
                .build();

        // Office Computer
        Computer officePC = new Computer.Builder("Intel i3", "4GB")
                .setStorage("500GB HDD")
                .setKeyboard("Standard Keyboard")
                .setMonitor("22\" LED Monitor")
                .build();

        // Display configurations
        System.out.println("=== Basic Computer ===\n" + basicComputer);
        System.out.println("\n=== Gaming PC ===\n" + gamingPC);
        System.out.println("\n=== Office PC ===\n" + officePC);
    }
}
