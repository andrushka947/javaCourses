package _Exercises.task2_SomeHobbies;

import _Exercises.task2_SomeHobbies.Hobbies.Fisherman;
import _Exercises.task2_SomeHobbies.Hobbies.Hunter;
import _Exercises.task2_SomeHobbies.Hobbies.Mushroomer;

public class main {
    public static void main(String[] args) {

        Hunter hunter = new Hunter();
        Mushroomer mushroomer = new Mushroomer();
        Fisherman fisherman= new Fisherman();

        Human human = new Human();
        human.addState(hunter);
        human.printState();

        human.addState(mushroomer);
        human.addState(fisherman);
        human.printState();

        human.removeState(mushroomer);
        human.printState();

    }
}
