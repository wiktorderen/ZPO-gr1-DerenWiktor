package Lab05.Zad3;

public class Greek extends Decorator{
    public Greek(Pizza newPizza) {
        super(newPizza);
    }

    public double getCost() {
        return component.getCost() + 10.0;
    }

    public String getDescription() {
        return component.getDescription() + " with tomato, feta and olives";
    }
}
