package recipe;

public class Ingredient {

    public String name;
    public int quantity;
    public double price;

    public Ingredient(String name, int quantity, double price){
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public Ingredient(String name){
        this.quantity = 0;
        this.price = 0;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ( !(obj instanceof Ingredient ingredient)) {
            return false;
        }

        return this.name.equals(ingredient.name) && this.quantity == ingredient.quantity;
    }
}