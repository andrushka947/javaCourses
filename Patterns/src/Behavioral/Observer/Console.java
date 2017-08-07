package Behavioral.Observer;

public class Console implements Observer{
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("The weather has changed. Temperature: " + temperature
            + " , pressure: " + pressure);
    }
}
