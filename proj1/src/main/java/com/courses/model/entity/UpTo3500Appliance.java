package com.courses.model.entity;

public class UpTo3500Appliance extends Appliance{
    private final static int MIN_POWER = 2510;
    private final static int MAX_POWER = 3500;

    public UpTo3500Appliance(String name, int power) {
        super(name, power);
    }


}
