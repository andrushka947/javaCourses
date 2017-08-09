package _Exercises.task11_Computer;

public class Screen {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Screen is on");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Screen is off");
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
