package Behavioral.Visitor;

public class BodyElement implements Element{

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
