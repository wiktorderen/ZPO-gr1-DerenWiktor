package Lab07.Zad4;

public class Main {
    public static void main(String[] args) {
        String text="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        FacadeFont font = new FacadeFont();
        System.out.println("Text: " + text);
        font.useBold(text);
        font.useItalics(text);
    }
}

