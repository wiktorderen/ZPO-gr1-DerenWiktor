package Lab05.Zad4;

public class TransportCost extends Decorator {

    public TransportCost(Order thing) {
        super(thing);
    }

    public String getDescription(){
        return thing.getDescription() + ", transport cost";
    }

    public double getCost(){
        return thing.getCost() + 20.00;
    }
}
