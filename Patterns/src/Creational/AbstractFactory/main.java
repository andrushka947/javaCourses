package Creational.AbstractFactory;

public class main {
    public static void main(String[] args) {

        StuffFactory sf = new RuStuffFactory();
        Mouse m = sf.getMouse();
        TouchPad tp = sf.getTouchPad();
        Keyboard k = sf.getKeyboard();

        m.click();
        tp.touch();
        k.print();
    }
}
