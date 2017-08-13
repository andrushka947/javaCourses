package com.courses.model.entity;

public class UpTo2500Appliance extends Appliance{
    private final static int MIN_POWER = 1510;
    private final static int MAX_POWER = 2500;

    public UpTo2500Appliance(String name, int power) {
        super(name, power);
    }


}
