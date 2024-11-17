package decoratorpattern.dominos.approach1.pizza;

import decoratorpattern.dominos.approach1.toppings.Mushroom;
import decoratorpattern.dominos.approach1.toppings.Olive;
import decoratorpattern.dominos.approach1.toppings.Onion;
import lombok.Getter;
import lombok.Setter;

public abstract class Pizza {
    @Getter
    @Setter
    private Mushroom mushroom;

    @Getter
    @Setter
    private Olive olive;

    @Getter
    @Setter
    private Onion onion;

    public double getCost() {
        double cost = 0.0;
        if(mushroom != null)
            cost += mushroom.getCost();
        if(olive != null)
            cost += olive.getCost();
        if(onion != null)
            cost += onion.getCost();
        return cost;
    }

    public String getName() {
        String name = "";
        if(mushroom != null)
            name += mushroom.getName();
        if(olive != null)
            name += olive.getName();
        if(onion != null)
            name += onion.getName();
        return name;
    }

}


/*
    Design Principle avoided here is OCP - Open Closed Principle
        Code should be open for extension
        & closed for modifications

    Here,
    PROBLEM 1: Pizza class is promoting modification (e.g. adding more toppings)

    Solution to this could be
    * using interface for Toppings
    * use List<Toppings> instead of using hardcoded toppings(Mushroom, Olive, etc) in class

    This is a GOOD solution. However, there is a better way to solve this problem!

    there is another problem here
    PROBLEM 2: what if we want to add more two layers of same toppings? Like adding two layers of Onions!
*/