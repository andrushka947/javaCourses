package Creational.Factory;

public class IOSPhone implements Phone {
    @Override
    public void create() {
        System.out.println("IOS phone");
    }
}
