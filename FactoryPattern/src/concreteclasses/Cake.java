package concreteclasses;

import interfaces.Food;

public class Cake implements Food {
    @Override
    public void getFood() {
        System.out.println("Ordered food type is Cake.");
    }
}
