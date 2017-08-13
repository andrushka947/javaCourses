package com.courses.model.util;

import com.courses.model.entity.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApplianceUtil {
    private static ApplianceUtil applianceUtil;
    private static List<Appliance> appliances;

    public static ApplianceUtil getInstance() {
        if (applianceUtil == null) {
            synchronized (ApplianceUtil.class) {
                if (applianceUtil == null) {
                    applianceUtil = new ApplianceUtil();
                    appliances = init();
                }
            }
        }
        return applianceUtil;
    }

    private static List<Appliance> init() {
        Appliance lamp = new UpTo500Appliance("Lamp", 250);
        Appliance fan = new UpTo500Appliance("Fan", 500);
        Appliance tv = new UpTo500Appliance("TV", 400);

        Appliance computer = new UpTo1500Appliance("Computer", 750);
        Appliance toaster = new UpTo1500Appliance("Toaster", 1000);
        Appliance coffeeMachine = new UpTo1500Appliance("Coffee machine", 1400);

        Appliance hairDryer = new UpTo2500Appliance("Hair dryer", 1900);
        Appliance iron = new UpTo2500Appliance("Iron", 2200);
        Appliance vacuumCleaner = new UpTo2500Appliance("Vacuum cleaner", 2000);

        Appliance washingMachine = new UpTo3500Appliance("Washing machine", 2500);
        Appliance airConditioner = new UpTo3500Appliance("Air conditioner", 2800);
        Appliance electricStove = new UpTo3500Appliance("Vacuum cleaner", 3500);

        List<Appliance> appliances = new ArrayList<>();
        appliances.add(lamp);
        appliances.add(fan);
        appliances.add(tv);
        appliances.add(computer);
        appliances.add(toaster);
        appliances.add(coffeeMachine);
        appliances.add(hairDryer);
        appliances.add(iron);
        appliances.add(vacuumCleaner);
        appliances.add(washingMachine);
        appliances.add(airConditioner);
        appliances.add(electricStove);

        computer.plugIn();
        airConditioner.plugIn();
        return appliances;
    }

    public List<Appliance> getAppliancesBetweenMaxAndMinPower(int minPower, int maxPower) {
        return appliances.
                stream().
                filter(a -> minPower < a.getPower() && a.getPower() < maxPower).
                sorted(Comparator.comparingLong(Appliance::getPower)).
                collect(Collectors.toList());
    }

    public List<Appliance> getPluggedInAppliances() {
        return appliances.
                stream().
                filter(Appliance::isPluggedIn).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public int getTotalPower() {
        return appliances.
                stream().
                filter(Appliance::isPluggedIn).
                mapToInt(Appliance::getPower).
                sum();
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }

}
