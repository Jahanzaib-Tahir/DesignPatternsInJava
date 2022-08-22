package concreteclasses;

import interfaces.Food;

public class Pizza implements Food {
    @Override
    public void getFood() {
        System.out.println("Ordered food type is Pizza.");
    }
}
