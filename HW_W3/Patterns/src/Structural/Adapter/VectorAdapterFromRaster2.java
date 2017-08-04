package Structural.Adapter;

public class VectorAdapterFromRaster2 implements VectorGraphicInterface {

    RasterGraphic rg;

    public VectorAdapterFromRaster2(RasterGraphic rg) {
        this.rg = rg;
    }

    @Override
    public void drawLine() {
        rg.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rg.drowRasterSquare();
    }
}
