package Lab05.Zad5;

public class Main {
    public static void main(String[] args) {
        Decorator printer = new Start(0,0,50);
        Decorator line1 = new Draw(printer, 10, 10);
        Decorator line2 = new Draw(line1, 20, 20);
        Decorator line3 = new Draw(line2, 30, 30);
        Decorator line4 = new Draw(line3, 40, 40);

        line4.Position(6,7);

        System.out.println("Actions: ");
        System.out.println(line4.History());
        System.out.println();
        System.out.println("Ink: " + line4.getInk());
    }
}
