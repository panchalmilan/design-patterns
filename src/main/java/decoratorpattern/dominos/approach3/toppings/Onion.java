package decoratorpattern.dominos.approach3.toppings;

import decoratorpattern.dominos.approach3.pizza.Pizza;

public class Onion extends PizzaDecorator {
    public Onion(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return decorratedPizza.getCost() + 2.5;
    }

    @Override
    public String getName() {
        return decorratedPizza.getName() + ", Olive";
    }
}
