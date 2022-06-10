package recipe;

import java.util.Collection;
import java.util.List;

public interface IRecipe {
    double GetTotalPrice();
    void AddIngredient(Ingredient ingredient) throws Exception;
    void RemoveIngredient(Ingredient ingredient) throws Exception;
    void AddCommonIngredients(Collection<Ingredient> ingredients);
}