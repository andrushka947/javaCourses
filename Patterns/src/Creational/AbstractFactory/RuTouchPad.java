package Creational.AbstractFactory;

public class RuTouchPad implements TouchPad{

    @Override
    public void touch() {
        System.out.println("движение");
    }
}
