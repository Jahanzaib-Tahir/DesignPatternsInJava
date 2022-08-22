package factory;

import concreteclasses.Burger;
import concreteclasses.Cake;
import concreteclasses.Pizza;
import interfaces.Food;
import static utils.CommonUtils.*;


public class FoodFactory {

    public Food getFood(String type){
        if(type==null)
            return null;
        else if (type.equalsIgnoreCase(BURGER))
            return new Burger();
        else if (type.equalsIgnoreCase(PIZZA))
            return new Pizza();
        else if (type.equalsIgnoreCase(CAKE))
            return new Cake();

        return null;
    }
}
