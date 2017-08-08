package Behavioral.Memento;

public class main {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL 1", 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL 2", 60000);
        System.out.println(game);

        game.load(file.getSave());
        System.out.println(game);

    }
}
