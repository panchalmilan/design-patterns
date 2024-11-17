package decoratorpattern.dominos.approach2.pizza;

public class MushroomThinCrustPizza extends Pizza {
    private final static double MUSHROOM_PRICE = 3.0;
    private final static double THINCRUST_PRICE = 10.0;

    private final static String MUSHROOM_NAME = "Mushroom";
    private final static String THINCRUST_NAME = "Thin Crust";

    @Override
    public double getCost() {
        return MUSHROOM_PRICE + THINCRUST_PRICE;
    }

    @Override
    public String getName() {
        return MUSHROOM_NAME + " " + THINCRUST_NAME;
    }
}
