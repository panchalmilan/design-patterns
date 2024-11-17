package decoratorpattern.dominos.approach1.pizza;

public class ThinCrustPizza extends Pizza {
    @Override
    public double getCost() {
        return super.getCost() + 8.0;
    }

    @Override
    public String getName() {
        return super.getName() + " " + "ThinCrustPizza";
    }
}
