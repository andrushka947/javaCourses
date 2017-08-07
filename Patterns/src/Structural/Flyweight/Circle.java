package Structural.Flyweight;

public class Circle implements Shape{
    private int r = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println("Circle with center in x=" + x
                + ", y= " + y + ", r = " + r);
    }
}
