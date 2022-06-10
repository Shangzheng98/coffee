package drinks;

import recipe.Recipe;

public abstract class Drink {
    public String name; // optional
    public CoffeeType type;
    private Recipe recipe;

    public Drink(String name, CoffeeType type) {
        this.name = name;
        this.type = type;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Recipe getRecipe(Recipe recipe) {
        return this.recipe;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


