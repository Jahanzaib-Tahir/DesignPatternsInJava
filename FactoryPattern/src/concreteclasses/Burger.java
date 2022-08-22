package concreteclasses;

import interfaces.Food;

public class Burger implements Food {
    @Override
    public void getFood() {
        System.out.println("Ordered food type is Burger.");
    }
}
