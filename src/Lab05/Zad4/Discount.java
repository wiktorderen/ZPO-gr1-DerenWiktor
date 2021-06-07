package Lab05.Zad4;

public class Discount extends Decorator{

    public Discount(Order thing) {
        super(thing);
    }

    public String getDescription(){
        return thing.getDescription() + ", discount";
    }

    public double getCost(){
        return thing.getCost() - 10.00;
    }
}
