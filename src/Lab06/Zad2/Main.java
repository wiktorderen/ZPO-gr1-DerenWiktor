package Lab06.Zad2;

public class Main {
    public static void main(String[] args) {
        FactoryTruck truck = new FactoryTruck();
        FactoryShip ship = new FactoryShip();

        truck.LoadVehicle("water");
        ship.LoadVehicle("oil");

    }
}
