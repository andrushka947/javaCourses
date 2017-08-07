package Behavioral.Command;

public class StartCommand extends Command {

    public StartCommand(Comp comp) {
        super(comp);
    }

    @Override
    public void execute() {
        comp.start();
    }
}
