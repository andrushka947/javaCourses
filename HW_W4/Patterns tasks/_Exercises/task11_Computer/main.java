package _Exercises.task11_Computer;

public class main {
    public static void main(String[] args) {

        Computer comp = new Computer(new Memory(), new Internet(), new Screen());

        comp.turnOn();
        comp.turnOff();

    }
}
