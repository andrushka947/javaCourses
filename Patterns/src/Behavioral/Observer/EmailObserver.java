package Behavioral.Observer;

public class EmailObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Email sent: new temperature: " + temperature
        + ", pressure: " + pressure);
    }
}
