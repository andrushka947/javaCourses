package Fundamental.Delegate;

public class Painter  {

    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

}
