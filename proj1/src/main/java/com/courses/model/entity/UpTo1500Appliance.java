package com.courses.model.entity;

public class UpTo1500Appliance extends Appliance{
    private final static int MIN_POWER = 510;
    private final static int MAX_POWER = 1500;

    public UpTo1500Appliance(String name, int power) {
        super(name, power);
    }


}
