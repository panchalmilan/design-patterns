package decoratorpattern.dominos.approach3.pizza;

public class ThinCrustPizza extends Pizza {
    @Override
    public double getCost() {
        return 12.0;
    }

    @Override
    public String getName() {
        return "ThinCrust";
    }
}
