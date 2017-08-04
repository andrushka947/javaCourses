package Structural.Facade;

public class main {
    public static void main(String[] args) {

        Computer computer = new Computer(new Monitor(), new Memory(), new Internet());
        computer.turnOn();
        computer.turnOff();

    }
}
