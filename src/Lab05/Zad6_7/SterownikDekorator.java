package Lab05.Zad6_7;

public abstract class SterownikDekorator implements IDraw{
    protected SterownikDekorator st;
    int startX;
    int startY;
    int endX;
    int endY;
    int ink;

    public SterownikDekorator(SterownikDekorator st, int x, int y){
        this.st=st;
        Draw(x,y);
    }

    public String History(){
        return st.History();
    }

    public int Check(){
        return st.Check();
    }

    public void Position(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    public void Draw(int x, int y) {
        this.endX = x;
        this.endY = y;
    }

}
