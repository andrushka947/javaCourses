package Structural.Proxy;

public class RealImage implements Image {
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Loading: " + file);
    }

    @Override
    public void display() {
        System.out.println("Watching: " + file);
    }


}
