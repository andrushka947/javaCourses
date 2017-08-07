package Behavioral.Command;

public class StopCommand  extends Command {

    public StopCommand(Comp comp) {
        super(comp);
    }

    @Override
    public void execute() {
        comp.stop();
    }
}