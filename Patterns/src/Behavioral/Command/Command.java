package Behavioral.Command;

public abstract class Command {
    Comp comp;

    public Command(Comp comp) {
        this.comp = comp;
    }

    abstract void execute();
}
