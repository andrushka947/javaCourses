package _Exercises.task11_Computer;

public class Memory {
    private boolean isLoaded;

    public void load(){
        isLoaded = true;
        System.out.println("Memory is loaded");
    }
    public void unLoad(){
        isLoaded = true;
        System.out.println("Memory is unloaded");
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
}
