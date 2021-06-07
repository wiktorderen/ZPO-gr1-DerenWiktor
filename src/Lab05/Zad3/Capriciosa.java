package Lab05.Zad3;

public class Capriciosa extends Decorator{

    public Capriciosa(Pizza newPizza) {
        super(newPizza);
    }

    public double getCost() {
        return component.getCost() + 8.0;
    }

    public String getDescription() {
        return component.getDescription() + " with mushrooms, ham, tomato sauce and mozzarella";
    }
}
