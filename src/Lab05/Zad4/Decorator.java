package Lab05.Zad4;

public class Decorator implements Order{
    protected Order thing;

    public Decorator(Order thing){
        this.thing = thing;
    }

    @Override
    public String getDescription() {
        return thing.getDescription();
    }

    @Override
    public double getCost() {
        return thing.getCost();
    }
}
