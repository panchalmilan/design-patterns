package decoratorpattern.dominos.approach3.toppings;

import decoratorpattern.dominos.approach3.pizza.Pizza;

public class Mushroom extends PizzaDecorator {
    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return decorratedPizza.getCost() + 3.0;
    }

    @Override
    public String getName() {
        return decorratedPizza.getName() + ", Mushroom";
    }
}
