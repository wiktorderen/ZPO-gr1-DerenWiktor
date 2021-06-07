package Lab06.Zad2;

public class FactoryTruck  extends Factory{
    @Override
    protected Deliver deliver() {
        return new Truck();
    }
}
