package command.approach1;

import command.approach1.framework.Command;

public class AddCustomerCommand implements Command {

    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        // here we should delegate the work to "CustomerService.addCustomer()"
        service.addCustomer();
    }
}
