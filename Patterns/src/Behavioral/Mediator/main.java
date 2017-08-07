package Behavioral.Mediator;

public class main {
    public static void main(String[] args) {

        TextChat chat = new TextChat();
        User admin = new Admin(chat);
        User user1 = new Client(chat, "user1");
        User user2 = new Client(chat, "user2");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("Hi");
        admin.sendMessage("admin is in chat now ");
    }
}
