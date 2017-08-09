package _Exercises.task11_Computer;

import java.util.Scanner;

public class Computer {

    private Memory memory;
    private Internet internet;
    private Screen screen;

    public Computer(Memory memory, Internet internet, Screen screen) {
        this.memory = memory;
        this.internet = internet;
        this.screen = screen;
    }

    public void turnOn() {
        screen.turnOn();
        memory.load();
        internet.connect();
    }

    public void turnOff() {
        internet.disconnect();
        memory.unLoad();
        screen.turnOff();
    }

    public Memory getMemory() {
        return memory;
    }
    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    public Internet getInternet() {
        return internet;
    }
    public void setInternet(Internet internet) {
        this.internet = internet;
    }
    public Screen getScreen() {
        return screen;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
