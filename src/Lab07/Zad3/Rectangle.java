package Lab07.Zad3;

public class Rectangle implements Shape{
    @Override
    public void draw(int x, int y, int z, int w) {
        System.out.println("Drawing a rectangle from: " + x +", " + y + "; to: "+ z + ", " +w);
    }
}
