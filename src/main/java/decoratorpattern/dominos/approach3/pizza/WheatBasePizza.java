package decoratorpattern.dominos.approach3.pizza;

public class WheatBasePizza extends Pizza {
    @Override
    public double getCost() {
        return 10.0;
    }

    @Override
    public String getName() {
        return "WheatBase";
    }
}