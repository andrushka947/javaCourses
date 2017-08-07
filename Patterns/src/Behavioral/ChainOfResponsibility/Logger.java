package Behavioral.ChainOfResponsibility;


public abstract class Logger {
    int priority;
    Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }
    public void setNext(Logger next) {
        this.next = next;
    }

    void writeMessage(String message, int level) {
        if (level<=priority) write(message);
        if (next != null) next.writeMessage(message, level);
    };
    abstract void write(String message);
}
