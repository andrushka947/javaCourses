package Behavioral.Command;

public class main {
    public static void main(String[] args) {
        Comp comp = new Comp();
        User user = new User(new StartCommand(comp),
                            new StopCommand(comp),
                            new RestartCommand(comp   ));

        user.startComp();
        user.restartComp();
        user.stopComp();
    }
}
