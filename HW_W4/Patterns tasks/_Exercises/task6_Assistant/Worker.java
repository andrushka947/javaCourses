package _Exercises.task6_Assistant;

public class Worker extends Employee {
    public Worker(String name) {
        super(name);
    }

    @Override
    public void printPosition() {
        System.out.print("Worker");
    }
}
