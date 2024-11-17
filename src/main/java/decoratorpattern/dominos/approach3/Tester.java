package decoratorpattern.dominos.approach3;

import decoratorpattern.dominos.approach3.pizza.Pizza;
import decoratorpattern.dominos.approach3.pizza.ThinCrustPizza;
import decoratorpattern.dominos.approach3.toppings.Mushroom;
import decoratorpattern.dominos.approach3.toppings.Onion;

public class Tester {
    public static void main(String[] args) {

        // Plain Thin Crust Pizza
//        Pizza pizza = new ThinCrustPizza();
//        System.out.println("Name: " + pizza.getName());
//        System.out.println("Cost: " + pizza.getCost());

        // Thin Crust Pizza with Mushroom
        ThinCrustPizza thinCrustPizza = new ThinCrustPizza();
        Pizza pizza = new Mushroom(thinCrustPizza);
        System.out.println("Name: " + pizza.getName());
        System.out.println("Cost: " + pizza.getCost());

        // Thin Crust Pizza with two Mushroom layer & one Onion layer
//        pizza = new Onion(new Mushroom(new Mushroom(new ThinCrustPizza())));
//        System.out.println("Name: " + pizza.getName());
//        System.out.println("Cost: " + pizza.getCost());

    }
}
