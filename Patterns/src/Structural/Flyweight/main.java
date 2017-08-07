package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));

        Random rnd = new Random();
        for (Shape sh : shapes) {
            int x = rnd.nextInt(200);
            int y = rnd.nextInt(200);
            sh.draw(x,y);
        }
    }
}
