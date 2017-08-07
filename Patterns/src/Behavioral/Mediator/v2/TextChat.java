package Behavioral.Mediator.v2;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else throw new RuntimeException("Wrong rights");
    }

    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("No admin defined");
        }
        if (user instanceof Client) users.add(user);
        else throw new RuntimeException("Admin cant enter different chat");
    }
    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof Admin) {
            for (User u : users) u.getMessage(user.getName() + ": " + message);
        }
        if (user instanceof Client) {
            for (User u : users) {
                if (u != user && u.isEnable()){
                    u.getMessage(user.getName() + ": " + message);
                }
            }
            if (admin.isEnable()) {
                admin.getMessage(user.getName() + ": " + message);
            }
        }
    }
}
