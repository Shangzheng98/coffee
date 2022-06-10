import drinks.Drink;
public interface IStrategy {
    Drink Process();

    public boolean isValid();

}
