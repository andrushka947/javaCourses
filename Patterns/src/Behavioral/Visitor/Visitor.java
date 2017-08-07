package Behavioral.Visitor;

public interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement engine);
    void visit(CarElement engine);
    void visit(WheelElement engine);

}
