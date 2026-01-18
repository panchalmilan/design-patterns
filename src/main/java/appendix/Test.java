package appendix;

import java.util.ArrayList;

record Animal(String species, boolean canHop, boolean canSwim) {}

interface CheckTrait {
    boolean test2(Animal a);
}

class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test2(Animal a) {
        return a.canHop();
    }
}

public class Test {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("cat", true, false));

        print(animals, new CheckIfHopper()); // WAY 1
        print(animals, Animal::canHop);      // WAY 2
    }

    public static void print(ArrayList<Animal> animals, CheckTrait checkTrait) {
        for (Animal animal : animals) {
            if (checkTrait.test2(animal)) {
                System.out.print("animal: " +  animal);
            }
            System.out.println();
        }
    }
}
