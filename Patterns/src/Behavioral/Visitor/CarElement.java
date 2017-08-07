package Behavioral.Visitor;

public class CarElement implements Element{
    private Element[] elements;

    public CarElement() {
        this.elements = new Element[]{
                new WheelElement("Front left"),
                new WheelElement("Front right"),
                new WheelElement("Rare left"),
                new WheelElement("Rare right"),
                new BodyElement(),
                new EngineElement()};
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element element : elements) {
            element.accept(visitor);
        }
      }
}
