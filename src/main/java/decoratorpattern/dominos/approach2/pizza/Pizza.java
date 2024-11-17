package decoratorpattern.dominos.approach2.pizza;

public abstract class Pizza {
    public abstract double getCost();
    public abstract String getName();
}

/*
Now this solution solves modification of Pizza class on addition of new toppings or base.
But it has introduced new problem - CLASS EXPLOSION

For every new variety of pizza combination, we will have to make a new class
e.g.    MushroomOnionThinCurstPizza
        MushroomOnionWheatBasePizza
        MushroomOliveOnionThinCurstPizza
        and so on.
*/