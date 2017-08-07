package Behavioral.ChainOfResponsibility;

public class SMSLogger extends Logger{
    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS: " + message);
    }
}
