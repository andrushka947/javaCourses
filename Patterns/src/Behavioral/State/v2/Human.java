package Behavioral.State.v2;

public class Human {
    private Activity state;

    public void setActivity(Activity state) {
        this.state = state;
    }

    public void doSmth() {
        state.doSmth(this);
    }
}
