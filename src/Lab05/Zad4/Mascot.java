package Lab05.Zad4;

public class Mascot extends Decorator{
    public Mascot(Order newItem) {
        super(newItem);
    }

    public String getDescription(){
        return thing.getDescription() + ", Mascot";
    }

    public double getCost(){
        return thing.getCost() + 10.0;
    }
}
