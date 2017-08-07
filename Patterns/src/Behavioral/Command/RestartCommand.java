package Behavioral.Command;

public class RestartCommand extends Command {

    public RestartCommand(Comp comp) {
        super(comp);
    }

    @Override
    public void execute() {
        comp.restart();
    }
}