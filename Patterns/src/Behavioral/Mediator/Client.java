package Behavioral.Mediator;

public class Client implements User {
    Chat chat;
    String name;

    public Client(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name + " got a message: " + message);
    }
}
