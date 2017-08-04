package Structural.Facade;

class Computer {
    Monitor monitor;
    Memory memory;
    Internet internet;

    public Computer(Monitor monitor, Memory memory, Internet internet) {
        this.monitor = monitor;
        this.memory = memory;
        this.internet = internet;
    }

    void turnOn() {
        monitor.on();
        memory.load();
        internet.connect();
    }
    void turnOff() {
        internet.disconnect();
        memory.unload();
        monitor.off();
    }
}