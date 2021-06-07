package Lab06.Zad1;

public class PostOffice implements Deliver{
    @Override
    public void Deliver(String pack) {
        System.out.println("Delivering pack " + pack);
    }
}
