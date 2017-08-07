package Behavioral.Visitor;

public class EngineElement implements Element{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
