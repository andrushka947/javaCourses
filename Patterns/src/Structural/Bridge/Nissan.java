package Structural.Bridge;

import javax.jws.WebParam;

public class Nissan implements Model {
    @Override
    public void setModel() {
        System.out.println("Nissan model");
    }
}
