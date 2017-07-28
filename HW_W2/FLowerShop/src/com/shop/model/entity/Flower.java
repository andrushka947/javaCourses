package com.shop.model.entity;

import com.shop.model.entity.constants.CareType;
import com.shop.model.entity.constants.FlowerColor;
import com.shop.model.entity.constants.FlowerFreshness;
import com.shop.model.entity.constants.FlowerType;

public class Flower extends Plant{

    private FlowerColor color;
    private FlowerType type;
    private FlowerFreshness freshness;
    private CareType careType;

    public Flower(String name, CareType careType, FlowerColor color, FlowerFreshness freshness, FlowerType type) {
        super(name);
        this.careType = careType;
        this.color = color;
        this.freshness = freshness;
        this.type = type;
    }

    public FlowerFreshness getFreshness() {
        return freshness;
    }

    public void setFreshness(FlowerFreshness freshness) {
        this.freshness = freshness;
    }

    public CareType getCareType() {
        return careType;
    }

    public void setCareType(CareType careType) {
        this.careType = careType;
    }

    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color=" + color +
                ", type=" + type +
                ", freshness=" + freshness +
                ", careType=" + careType +
                '}';
    }
}
