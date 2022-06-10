import drinks.CoffeeType;
import drinks.Drink;
import recipe.Recipe;
import drinks.Espresso;
public class EspressoStrategy implements IStrategy {
    private Validator validator;
    private Recipe recipe;
    public EspressoStrategy(Validator validator, Recipe recipe) {
        this.validator = validator;
        this.recipe = recipe;
    }


    @Override
    public boolean isValid() {

        return validator.isValid(CoffeeType.ESPRESSO,recipe );
    }

    @Override
    public Drink Process() {
        //TO-DO: check recipe
        if ( !isValid()) {
            System.out.println(" not valid!!!!!!!!!!!!!!!!!");
        }

        Espresso espresso = new Espresso();

        if ( recipe == null) {
            throw new RuntimeException();
        }
        espresso.setRecipe(recipe);

        return espresso;
    }
}
