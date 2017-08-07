package Behavioral.Strategy;

public class main {
    public static void main(String[] args) {
        StrategyClient s = new StrategyClient();
        int[] arr = {5,10,15};

        s.setStrategy(new FirstNumber());
        s.executeStrategy(arr);

        s.setStrategy(new MiddleNumber());
        s.executeStrategy(arr);

        s.setStrategy(new LastNumber());
        s.executeStrategy(arr);

    }
}
