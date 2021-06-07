package Lab05.Zad4;

public class OrderClass extends Decorator{
    double value;

    public OrderClass(double val) {
        super(null);
        this.value=val;
    }
    @Override
    public String getDescription()
    {
        return "Order";
    }

    @Override
    public double getCost() {
        return this.value;
    }
}
