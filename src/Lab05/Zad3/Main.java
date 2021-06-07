package Lab05.Zad3;

public class Main {
    public static void main(String[] args) {
        Decorator dough = new Dough();

        System.out.println(dough.getDescription());
        System.out.println(dough.getCost());

        Decorator greek = new Greek(dough);
        System.out.println("Components: " + greek.getDescription());
        System.out.println("Price " + greek.getCost());

        Decorator capriciosa = new Capriciosa(dough);
        System.out.println("Components: " + capriciosa.getDescription());
        System.out.println("Price: " + capriciosa.getCost());
    }
}
