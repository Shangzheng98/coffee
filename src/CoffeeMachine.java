import java.util.Map;
import drinks.*;
import recipe.Ingredient;
import recipe.Recipe;

public class CoffeeMachine {
    public static void makeDrink() throws Exception {

        Validator validator = new Validator();

        validator.setCheckList(CoffeeType.ESPRESSO,new Ingredient("coffee", 1,20.00));
        validator.setCheckList(CoffeeType.ESPRESSO,new Ingredient("water", 1,100.00));

        Recipe recipe = new Recipe();

        recipe.AddIngredient(new Ingredient("coffee", 1,20.00));
        recipe.AddIngredient(new Ingredient("water", 1,100.00));

        EspressoStrategy espressoStrategy = new EspressoStrategy(validator, recipe);

        Drink drink = espressoStrategy.Process();

    }
    public static void main(String[] args) throws Exception {
        makeDrink();
    }
}
