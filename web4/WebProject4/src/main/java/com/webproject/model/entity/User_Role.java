package com.webproject.model.entity;

public enum User_Role {
    GUEST(1),
    USER(2),
    ADMIN(3);
    private int id;

    User_Role(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

