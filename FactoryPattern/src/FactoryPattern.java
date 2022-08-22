import factory.FoodFactory;
import interfaces.Food;
import utils.CommonUtils;

public class FactoryPattern {

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food burger =  foodFactory.getFood(CommonUtils.BURGER);
        burger.getFood();

        Food pizza =  foodFactory.getFood(CommonUtils.PIZZA);
        pizza.getFood();

        Food cake =  foodFactory.getFood(CommonUtils.CAKE);
        cake.getFood();

    }
}
