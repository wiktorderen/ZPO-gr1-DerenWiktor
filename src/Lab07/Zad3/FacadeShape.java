package Lab07.Zad3;

public class FacadeShape {
    private Shape line;
    private Shape rectangle;

    public FacadeShape(){
        line = new Line();
        rectangle = new Rectangle();
    }

    public void drawLine(int x, int y, int z, int w){
        line.draw(x,y,z,w);
    }

    public void drawRectangle(int x, int y, int z, int w){
        rectangle.draw(x,y,z,w);
    }
}
