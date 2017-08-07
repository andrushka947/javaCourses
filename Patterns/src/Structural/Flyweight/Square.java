package Structural.Flyweight;

public class Square implements Shape {
    private int a = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("Square with center in x=" + x + ", y= " + y + ", side = " + a);
    }
}
