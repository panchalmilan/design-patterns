package decoratorpattern.dominos.approach1.pizza;

public class WheatBasePizza extends Pizza {
    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }

    @Override
    public String getName() {
        return super.getName() + " " + "WheatBasePizza";
    }
}
