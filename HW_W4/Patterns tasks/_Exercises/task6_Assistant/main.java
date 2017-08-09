package _Exercises.task6_Assistant;

public class main {
    public static void main(String[] args) {
        Director andrey = new Director("Andrey");
        Employee worker = new Worker("Igor");
        Employee psychologist = new Worker("Valentina");

        Assistant assistant = new Assistant(andrey);

        assistant.setEmployee(worker);
        assistant.sendTo(psychologist);

    }
}
