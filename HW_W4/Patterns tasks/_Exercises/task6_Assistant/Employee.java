package _Exercises.task6_Assistant;


public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print(name + "(");
        printPosition();
        System.out.println(")");
    }

    protected abstract void printPosition() ;
}
