package Behavioral.Mediator.v2;

public class Client extends User {

    public Client (Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void getMessage(String message) {
        System.out.println("Client " + getName() + " got a message: " + message);
    }
}