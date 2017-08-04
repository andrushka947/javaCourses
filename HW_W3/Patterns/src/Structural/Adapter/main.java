package Structural.Adapter;

public class main {
    public static void main(String[] args) {
        //1. inheritance
        VectorGraphicInterface vgi = new VectorAdapterFromRaster();
        vgi.drawLine();
        vgi.drawSquare();

        //2. Composition



    }
}
