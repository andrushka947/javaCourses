package _Exercises.task2_SomeHobbies;

import _Exercises.task2_SomeHobbies.Hobbies.State;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private List<State> states = new ArrayList<>();

    public List<State> getState() {
        return states;
    }

    public void addState(State state) {
        if (states.contains(state)) System.out.println("That state is already initialized");
        else {
            states.add(state);
        }
    }

    public void removeState(State state) {
        if (states.contains(state)) states.remove(state);
        else System.out.println("No such state initialized");
    }

    public void printState() {
        System.out.println("__States:__");
        states.forEach(State::printAction);
        System.out.println("________________");
    }
}
