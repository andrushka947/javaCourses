package _Exercises.task1_Hobby;

public class main {
    public static void main(String[] args) {

        Human human = new Human();
        human.setHobby(new Mushroomer());

        human.printLocation();

        for (int i = 0; i < 5; i++) {
            human.nextLocation();
            human.printLocation();
        }

    }
}
