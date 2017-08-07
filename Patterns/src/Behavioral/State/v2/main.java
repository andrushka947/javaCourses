package Behavioral.State.v2;

public class main {
    public static void main(String[] args) {

        Human human = new Human();
        human.setActivity(new Work());

        for (int i = 0; i < 10; i++) {
            human.doSmth();
        }
    }

}
