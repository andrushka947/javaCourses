package com.courses.model.entity;

public abstract class Appliance {
    private static int counter = 0;
    private int id;
    private String name;
    private int power;
    private boolean pluggedIn;

    public Appliance(String name, int power) {
        this.name = name;
        this.power = power;
        id = counter;
        counter++;
    }

    public void changeState() {
        if (pluggedIn) unPlug();
        else plugIn();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public boolean isPluggedIn() {
        return pluggedIn;
    }
    public void plugIn() {
        pluggedIn = true;
    }
    public void unPlug() {
        pluggedIn = false;
    }

    @Override
    public String toString() {
        return  "{name='" + name + '\'' +
                ", power=" + power +
                ", pluggedIn=" + pluggedIn +
                '}';
    }

}
