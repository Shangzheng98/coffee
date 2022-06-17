import java.util.*;

import drinks.*;
import recipe.Ingredient;
import recipe.Recipe;

public class Validator {
    private Map<CoffeeType, List<Ingredient>> checkList;

    public Validator() {
        this.checkList = new HashMap<>();
    }

    public void setCheckList(CoffeeType coffeeType, Ingredient ingredient) {
        if (!checkList.containsKey(coffeeType)) {
            checkList.put(coffeeType, new ArrayList<Ingredient>());
        }

        checkList.get(coffeeType).add(ingredient);

    }

    public void remove() {
        System.out.println("remove");
    }

    public boolean isValid(CoffeeType coffeeType, Recipe recipe){
        if (recipe.ingredients.size() != this.checkList.get(coffeeType).size()){
            return false;
        }
        if ( !checkList.containsKey(coffeeType)) {
            return false;
        }

        List<Ingredient> ingredients = checkList.get(coffeeType);
        Comparator<Ingredient> comparator = Comparator.comparing(ingredient -> ingredient.name);
        comparator = comparator.thenComparing(ingredient -> ingredient.quantity);

        ingredients.sort(comparator);
        recipe.ingredients.sort(comparator);

        return ingredients.equals(recipe.ingredients);
//        for (Ingredient ingredient : recipe.ingredients) {
//           if (! ingredients.contains(ingredient)) {
//               return false;
//           }
//        }
    }
}
