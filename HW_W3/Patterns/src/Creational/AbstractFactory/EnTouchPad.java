package Creational.AbstractFactory;

public class EnTouchPad implements TouchPad {
    @Override
    public void touch() {
        System.out.println("track");
    }
}
