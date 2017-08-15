package com.webproject.model.entity;

public enum Subject {
    MATH(1, "MATH"),
    UKRAINIAN_LANGUAGE(2, "UKRAINIAN_HISTORY"),
    CHEMISTRY(3, "CHEMISTRY"),
    PHYSICS(4, "PHYSICS"),
    UKRAINIAN_HISTORY(5, "UKRAINIAN_HISTORY"),
    ENGLISH_LANGUAGE(6, "ENGLISH_LANGUAGE"),
    GEOGRAPHY(7, "GEOGRAPHY"),
    BIOLOGY(8, "BIOLOGY");

    private String name;
    private int id;

    Subject(int id, String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
