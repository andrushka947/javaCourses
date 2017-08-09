package _Exercises.task6_Assistant;

public class Assistant {
    private Director director;
    private Employee employee;

    public Assistant(Director director) {
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void sendTo(Employee sendToEmployee) {
        director.sendTo(employee, sendToEmployee);
    }
}
