package Lab03.Zad5;

public class Main {
    public static void main(String[] args) {
        Exchange exchange = new Exchange();

        exchange.addCompany("Intel", 1000);
        exchange.addCompany("nVidia", 2000);

        Client client1 = new Client("Jan Kowalski",2500,exchange);
        Client client2 = new Client("Joanna Nowak", 3000, exchange);

        client1.Buy("Intel", 5);
        client2.Buy("nVidia", 3);
    }
}
