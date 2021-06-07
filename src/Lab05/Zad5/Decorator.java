package Lab05.Zad5;

public class Decorator implements DrawInterface {
    protected DrawInterface action;
    int startX;
    int startY;
    int endX;
    int endY;
    int ink;

    public Decorator(DrawInterface action, int x, int y)
    {
        this.action=action;
        Draw(x,y);
    }

    @Override
    public String History() {
        return action.History();
    }

    @Override
    public double getInk() {
        return action.getInk();
    }

    @Override
    public void Position(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void Draw(int x, int y) {
        this.endX = x;
        this.endY = y;
    }
}
