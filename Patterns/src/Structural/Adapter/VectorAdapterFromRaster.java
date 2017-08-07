package Structural.Adapter;

public class VectorAdapterFromRaster extends RasterGraphic implements VectorGraphicInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
