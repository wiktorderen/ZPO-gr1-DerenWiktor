package Lab05.Zad4;

public class Main {
    public static void main(String[] args) {
        Decorator order = new OrderClass(20);
        Decorator mascot = new Mascot(order);
        Decorator leash = new Leash(mascot);
        Decorator discount = new Discount(mascot);
        Decorator transport = new TransportCost(discount);

        System.out.println("All order: " + transport.getDescription());
        System.out.println("All cost: " + transport.getCost());
    }
}
