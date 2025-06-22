public class Main {
    public static void main(String[] args) {
        // Step 1: Create receiver (Light)
        Light livingRoomLight = new Light();

        // Step 2: Create command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Step 3: Create remote (invoker)
        RemoteControl remote = new RemoteControl();

        // Step 4: Turn ON the light
        remote.setCommand(lightOn);
        remote.pressButton();  // Output:  Light is ON

        // Step 5: Turn OFF the light
        remote.setCommand(lightOff);
        remote.pressButton();  // Output:  Light is OFF
    }
}
