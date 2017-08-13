package com.courses.view;

import com.courses.model.entity.Appliance;

import java.util.List;

public class View {

    private static String TOTAL_POWER = "Total appliance's power = ";

    public void printAppliances(List<Appliance> list) {
        list.forEach(System.out::println);
    }

    public void printTotalPower(int value) {
        System.out.println(TOTAL_POWER + value);
    }

}
