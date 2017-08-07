package Behavioral.Visitor;

public class CrackVisitor  implements Visitor{

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Broke the engine");
    }

    @Override
    public void visit(BodyElement engine) {
        System.out.println("Broke body part");
    }

    @Override
    public void visit(WheelElement engine) {
        System.out.println("Broke " + engine.getName() + " wheel");
    }

    @Override
    public void visit(CarElement engine) {
        System.out.println("________________________________");
        System.out.println("Breaking the whole car:");
    }
}
