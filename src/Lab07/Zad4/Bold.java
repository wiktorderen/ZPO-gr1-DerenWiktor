package Lab07.Zad4;

public class Bold implements Font{
    @Override
    public void useFont(String text) {
        System.out.println("Using bold for: " + text);
    }
}
