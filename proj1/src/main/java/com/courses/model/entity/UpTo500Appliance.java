package com.courses.model.entity;

public class UpTo500Appliance extends Appliance{
    private final static int MIN_POWER = 0;
    private final static int MAX_POWER = 500;
    public UpTo500Appliance(String name, int power) {
        super(name, power);
    }

}
