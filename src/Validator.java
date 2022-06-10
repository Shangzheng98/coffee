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
        if ( !checkList.containsKey(coffeeType)) {
            return false;
        }

        List<Ingredient> ingredients = checkList.get(coffeeType);


//        for (Ingredient ingredient : recipe.ingredients) {
//           if (! ingredients.contains(ingredient)) {
//               return false;
//           }
//        }
        return new HashSet<>(ingredients).containsAll(recipe.ingredients);

    }
}
