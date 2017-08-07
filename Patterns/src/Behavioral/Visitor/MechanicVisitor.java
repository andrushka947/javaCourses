package Behavioral.Visitor;

public class MechanicVisitor implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Engine check");
    }

    @Override
    public void visit(CarElement engine) {
        System.out.println("________________________________");
        System.out.println("Checking the whole car:");
    }

    @Override
    public void visit(WheelElement engine) {
        System.out.println("Checked " + engine.getName() + " wheel");
    }

    @Override
    public void visit(BodyElement engine) {
        System.out.println("Body check");
    }
}
