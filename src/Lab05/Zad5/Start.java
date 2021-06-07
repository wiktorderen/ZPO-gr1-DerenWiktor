package Lab05.Zad5;

public class Start extends Decorator{

    public Start(int x, int y, int ink) {
        super(null, x, y);
        this.ink = ink;
        Position(x,y);
    }

    @Override
    public String History() {
        return "Start from("+this.startX+", "+this.startY+", "+this.endX+", "+this.endY+")";
    }

    @Override
    public double getInk() {
        return this.ink;
    }
}
