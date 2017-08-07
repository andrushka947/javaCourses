package Behavioral.State.v2;


public class Work implements Activity {

    @Override
    public void doSmth(Human context) {
        System.out.println("Working");
        context.setActivity(new Weekend());
    }
}
