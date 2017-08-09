package _Exercises.task10_DVI_SVGA;

public class DVIAdapterFromSVGA extends SVGAConnector implements DVIConnector {
    @Override
    public void connectToDVI() {
        connectSVGA();
        System.out.println(" DVI port.");
    }
}
