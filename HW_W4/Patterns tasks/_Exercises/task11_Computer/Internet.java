package _Exercises.task11_Computer;

public class Internet {
    private boolean isConnected;

    public void connect() {
        isConnected = true;
        System.out.println("Internet is connected");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Internet is disconnected");
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }
}
