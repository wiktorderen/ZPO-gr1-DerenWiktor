package Lab06.Zad1;

public class Postman implements Deliver{
    @Override
    public void Deliver(String pack) {
        System.out.println("Postman delivering pack " + pack);
    }
}
