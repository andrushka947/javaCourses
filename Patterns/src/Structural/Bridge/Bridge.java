package Structural.Bridge;

public class Bridge {
    public static void main(String[] args) {

        Car c = new Sedan(new Nissan());
        c.showDetails();
    }
}
