package Lab05.Zad6_7;

public class Start extends SterownikDekorator{

    public Start(int x, int y, int ink)
    {
        super(null,x,y);
        this.ink = ink;
        Position(x,y);
    }

    @Override
    public void Start(int x, int y) {

    }

    @Override
    public void End(int x, int y) {

    }
}
