package Lab05.Zad4;

public class Leash extends Decorator{

    public Leash(Order thing) {
        super(thing);
    }

    public String getDescription(){
        return thing.getDescription() + ", Leash";
    }

    public double getCost(){
        return thing.getCost() + 5.0;
    }
}
