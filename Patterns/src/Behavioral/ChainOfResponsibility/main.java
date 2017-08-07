package Behavioral.ChainOfResponsibility;

public class main {
    public static void main(String[] args) {
        Logger sms = new SMSLogger(Level.ERROR);
        Logger file = new FileLogger(Level.DEBUG);
        Logger email = new EmailLogger(Level.INFO);
        sms.setNext(file);
        file.setNext(email);

        sms.writeMessage("email test", Level.INFO);
        sms.writeMessage("debug test", Level.DEBUG);
        sms.writeMessage("error test", Level.ERROR);
    }
}
