package decoratorpattern.dominos.approach3.toppings;

import decoratorpattern.dominos.approach3.pizza.Pizza;

public abstract class PizzaDecorator extends Pizza {
    protected Pizza decorratedPizza;

    public PizzaDecorator(Pizza decorratedPizza) {
        this.decorratedPizza = decorratedPizza;
    }

    @Override
    public double getCost() {
        return decorratedPizza.getCost();
    }

    @Override
    public String getName() {
        return decorratedPizza.getName();
    }
}
