// This class acts like a remote – it doesn't care what the command is
public class RemoteControl {
    private Command command;  // Holds a command (like LightOnCommand)

    // Set the command we want to execute
    public void setCommand(Command command) {
        this.command = command;
    }

    // When button is pressed, execute the command
    public void pressButton() {
        if (command != null) {
            command.execute();  // Perform the action
        } else {
            System.out.println("No command assigned!");
        }
    }
}
