package _Exercises.task1_Hobby;

public class Human {
    private Hobby hobby;

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public void nextLocation() {
        if (hobby instanceof Hunter) {
            hobby = new Fisherman();
        } else if (hobby instanceof Fisherman) {
            hobby = new Mushroomer();
        } else if (hobby instanceof Mushroomer) {
            hobby = new Hunter();
        }
    }

    public void printLocation() {
        hobby.printAction();
    }
}
