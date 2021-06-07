package Lab06.Zad2;

public class Ship implements Deliver{
    @Override
    public void deliver(String stuff) {
        System.out.println("Delivering " + stuff + " by a ship");
    }
}
