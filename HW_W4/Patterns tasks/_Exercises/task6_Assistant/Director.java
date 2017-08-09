package _Exercises.task6_Assistant;

public class Director extends Employee {

    public Director(String name) {
        super(name);
    }

    @Override
    public void printPosition() {
        System.out.print("Director");
    }

    public void sendTo(Employee employeeBeingSent, Employee sendToEmployee) {
        employeeBeingSent.print();
        System.out.println("was send to ");
        sendToEmployee.print();
    }
}
