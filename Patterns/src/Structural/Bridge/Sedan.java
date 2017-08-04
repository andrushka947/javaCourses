package Structural.Bridge;

public class Sedan extends Car{
    public Sedan(Model type) {
        super(type);
    }

    @Override
    void showType() {
        System.out.println("Sedan");
    }
}
