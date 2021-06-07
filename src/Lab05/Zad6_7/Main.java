package Lab05.Zad6_7;

public class Main {
    public static void main(String[] args) {
        SterownikDekorator point = new Start(0,0,1);
        SterownikDekorator line1 = new Draw(point, 2,2);
        line1.Position(10,10);
        //SterownikDekorator line2 = new Draw();

        //Client client = new Client();
    }
}
