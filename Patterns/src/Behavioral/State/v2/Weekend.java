package Behavioral.State.v2;


public class Weekend implements Activity {
    private int count;
    @Override
    public void doSmth(Human context) {
        if (count < 3) {
            System.out.println("Relaxing...");
            count++;
        } else {
            context.setActivity(new Work());
        }
    }
}
