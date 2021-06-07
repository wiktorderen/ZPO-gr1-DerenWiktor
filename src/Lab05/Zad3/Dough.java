package Lab05.Zad3;

public class Dough extends Decorator{

    public Dough() {
        super(null);
    }

    @Override
    public String getDescription(){
        return "A cake for a pizza";
    }

    @Override
    public double getCost() {
        return 5.20;
    }
}
