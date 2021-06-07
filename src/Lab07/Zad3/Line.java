package Lab07.Zad3;

public class Line implements Shape{
    @Override
    public void draw(int x, int y, int z, int w) {
        System.out.println("Drawing a line from: " + x +", " + y + "; to: "+ z + ", " +w);
    }
}
