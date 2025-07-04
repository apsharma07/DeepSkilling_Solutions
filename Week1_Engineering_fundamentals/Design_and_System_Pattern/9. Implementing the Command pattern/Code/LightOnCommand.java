// This command will turn ON the light
public class LightOnCommand implements Command {
    private Light light;  // Reference to the receiver (Light)

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();  // Ask the light to turn on
    }
}
