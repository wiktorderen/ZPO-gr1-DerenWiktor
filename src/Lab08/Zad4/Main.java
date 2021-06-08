package Lab08.Zad4;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaM = new Margherita();
        Pizza pizzaS = new Sicilian();

        pizzaM.isReady();
        System.out.println("--------------------");
        pizzaS.isReady();
    }
}
