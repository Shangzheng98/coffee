package recipe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Recipe implements IRecipe {

    public List<Ingredient> ingredients;
    private double totalPrice;

    public Recipe() {
        ingredients = new ArrayList<>();
        totalPrice = 0.0d;
    }

    public double GetTotalPrice() {
        return totalPrice;
    }

    public void AddIngredient(Ingredient ingredient) throws Exception {
        if (ingredient == null)
            throw new Exception("Ingredient isn't correct");

        this.ingredients.add(ingredient);
        totalPrice += ingredient.price;
    }

    public void RemoveIngredient(Ingredient ingredient) throws Exception {
        if (ingredient == null)
            throw new Exception("Ingredient isn't correct");

        this.ingredients.remove(ingredient);
        totalPrice -= ingredient.price;
    }

    public void AddCommonIngredients(Collection<Ingredient> ingredients) {
        this.ingredients.addAll(ingredients);
    }

}
