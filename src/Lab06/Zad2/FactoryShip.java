package Lab06.Zad2;

public class FactoryShip extends Factory{
    @Override
    protected Deliver deliver() {
        return new Ship();
    }
}
