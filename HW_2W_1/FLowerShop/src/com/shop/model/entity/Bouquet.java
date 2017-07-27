package com.shop.model.entity;

import com.shop.model.entity.constants.*;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private List<Plant> flowers = new ArrayList<>();
    private Attribute attribute;
    private BouquetPrice price;
    private BouquetStem stem;
    private BouquetEvent event;
    private BouquetSize size;

    public Bouquet() {}

    public Bouquet(List<Plant> flowers){
        this.flowers = flowers;
    }

    public Bouquet(List<Plant> flowers, BouquetPrice price, BouquetStem stem, BouquetEvent event, BouquetSize size) {
        this.flowers = flowers;
        this.price = price;
        this.stem = stem;
        this.event = event;
        this.size = size;
    }

    public void addFlower(Plant flower) {
        flowers.add(flower);
    }

    public List<Plant> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Plant> flowers) {
        this.flowers = flowers;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttributes(Attribute attribute) {
        this.attribute = attribute;
    }

    public BouquetPrice getPrice() {
        return price;
    }

    public void setPrice(BouquetPrice price) {
        this.price = price;
    }

    public BouquetStem getStem() {
        return stem;
    }

    public void setStem(BouquetStem stem) {
        this.stem = stem;
    }

    public BouquetEvent getEvent() {
        return event;
    }

    public void setEvent(BouquetEvent event) {
        this.event = event;
    }

    public BouquetSize getSize() {
        return size;
    }

    public void setSize(BouquetSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", attribute=" + attribute +
                ", price=" + price +
                ", stem=" + stem +
                ", event=" + event +
                ", size=" + size +
                '}';
    }
}
