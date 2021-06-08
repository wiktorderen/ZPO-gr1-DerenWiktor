package Lab07.Zad4;

public class Italics implements Font{
    @Override
    public void useFont(String text) {
        System.out.println("Using italics for: " + text);
    }
}
