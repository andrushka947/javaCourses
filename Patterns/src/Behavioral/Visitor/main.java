package Behavioral.Visitor;

public class main {
    public static void main(String[] args) {

        /*Element body = new BodyElement();
        Element engine = new EngineElement();
        */Element car = new CarElement();
        Visitor badBoy = new CrackVisitor();
        /*body.accept(badBoy);
        engine.accept(badBoy);
        */car.accept(badBoy);

        Visitor mechanic = new MechanicVisitor();
        /*body.accept(mechanic);
        engine.accept(mechanic);
        */car.accept(mechanic);

    }
}
