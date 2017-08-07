package Behavioral.Mediator.v2;

public abstract class User {
    private Chat chat;
    private String name;
    private boolean isEnable = true;


    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
    public boolean isEnable() {
        return isEnable;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }
    abstract void getMessage(String message);
}
