package Lab07.Zad4;

public class FacadeFont {
    private Font bold;
    private Font italics;

    public FacadeFont(){
        bold = new Bold();
        italics = new Italics();
    }

    public void useBold(String text){
        bold.useFont(text);
    }

    public void useItalics(String text){
        italics.useFont(text);
    }
}
