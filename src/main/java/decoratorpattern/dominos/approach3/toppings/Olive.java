package decoratorpattern.dominos.approach3.toppings;

import decoratorpattern.dominos.approach3.pizza.Pizza;

public class Olive extends PizzaDecorator {
    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return decorratedPizza.getCost() + 2.0;
    }

    @Override
    public String getName() {
        return decorratedPizza.getName() + ", Olive";
    }
}
