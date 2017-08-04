package Structural.Bridge;

public class Coupe extends Car {

    public Coupe(Model model) {
        super(model);
    }

    @Override
    void showType() {
        System.out.println("Coupe");
    }

}
