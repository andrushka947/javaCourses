package Behavioral.Mediator.v2;

public class main {
    public static void main(String[] args) {

        TextChat chat = new TextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new Client(chat, "User 1");
        User user2 = new Client(chat, "User 2");
        User user3 = new Client(chat, "User 3");

        user3.setEnable(false);
        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.sendMessage("Hi from u1");
        System.out.println("______");
        //user2.sendMessage("Hi from u2");
        admin.sendMessage("Hi from admin");
        System.out.println("_______");
        user3.sendMessage("Hi from u3");
    }
}
