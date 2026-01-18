package command.approach1;

import command.approach1.framework.Button;

public class Client {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();
    }
}
