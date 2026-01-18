package command.problem;

import lombok.Getter;
import lombok.Setter;

// This Button class is a part of GUI Framework
// This framework also contains - CheckBox & TextBox
// Developer using this framework can build complex dialog box using this classes
public class Button {
    @Getter
    @Setter
    public String label;

    public void click() {
        // PROBLEM:
        // Code that is added here will be dependent on where we use this Button
        // e.g. User clicking dialogBox 1 - it should add customer
        // e.g. User clicking dialogBox 1 - it should remove/delete customer
    }
}
