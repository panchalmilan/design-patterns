package command.approach1.framework;

import lombok.Getter;
import lombok.Setter;

// This Button class is a part of GUI Framework
// This framework also contains - CheckBox & TextBox
// Developer using this framework can build complex dialog box using this classes
public class Button {
    @Getter
    @Setter
    public String label;

    // SOLUTION:
    // Button will talk to "ConcreteCommand" object
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        // SOLUTION:
        // delegating/forwarding actual work to another object / command object
        command.execute();
    }
}
