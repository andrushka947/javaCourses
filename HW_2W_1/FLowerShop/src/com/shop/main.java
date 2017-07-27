package com.shop;

import com.shop.model.entity.Bouquet;
import com.shop.model.entity.Flower;
import com.shop.model.entity.Plant;
import com.shop.model.entity.constants.*;
import com.shop.view.View;

import java.util.Arrays;

enum Plants {
    ROSE_RED(new Flower("Rose", CareType.SUPPORT, FlowerColor.RED, FlowerFreshness.SUPER_FRESH, FlowerType.SINGLE)),
    ROSE_WHITE(new Flower("Rose", CareType.SUPPORT, FlowerColor.WHITE, FlowerFreshness.SUPER_FRESH, FlowerType.SINGLE)),
    ROSE_YELLOW(new Flower("Rose", CareType.SUPPORT, FlowerColor.YELLOW, FlowerFreshness.SUPER_FRESH, FlowerType.SINGLE)),

    CHAMOMILE_SINGLE(new Flower("Chamomile", CareType.SUPPORT, FlowerColor.WHITE, FlowerFreshness.AFRESH, FlowerType.MULTIFLOROUS)),
    CHAMOMILE_MULTI(new Flower("Chamomile", CareType.SUPPORT, FlowerColor.WHITE, FlowerFreshness.AFRESH, FlowerType.SINGLE)),
    ASTER(new Flower("Aster", CareType.SUPPORT, FlowerColor.WHITE, FlowerFreshness.AFRESH, FlowerType.MULTIFLOROUS)),
    GERBER(new Flower("Gerber", CareType.SUPPORT, FlowerColor.PURPLE, FlowerFreshness.FRESH, FlowerType.SINGLE));

    private Plant plant;
    Plants(Plant plant) {
        this.plant = plant;
    }
    public Plant getValue(){
        return plant;
    }
}
public class main {
    public static void main(String[] args) {



        Plant[] flowers = {
            Plants.ROSE_WHITE.getValue(),
            Plants.ROSE_RED.getValue(),
            Plants.ROSE_YELLOW.getValue()
        };
        Bouquet bouquet1 = new Bouquet();
        bouquet1.setFlowers(Arrays.asList(flowers));

        bouquet1.setAttributes(Attribute.BASKET);
        bouquet1.setEvent(BouquetEvent.FESTIVE);
        bouquet1.setSize(BouquetSize.AVERAGE);
        bouquet1.setStem(BouquetStem.MIDDLE_STEM);
        bouquet1.setPrice(BouquetPrice.BUDGET);

        View.print(bouquet1);

        Plant[] flowers2 = {
                Plants.CHAMOMILE_MULTI.getValue(),
                Plants.CHAMOMILE_SINGLE.getValue(),
                Plants.CHAMOMILE_SINGLE.getValue()
        };

        Bouquet bouquet2 = new Bouquet();
        bouquet2.setFlowers(Arrays.asList(flowers2));

        bouquet2.setAttributes(Attribute.BASKET);
        bouquet2.setEvent(BouquetEvent.FESTIVE);
        bouquet2.setSize(BouquetSize.SMALL);
        bouquet2.setStem(BouquetStem.LONG_STEM);
        bouquet2.setPrice(BouquetPrice.BUDGET);

        View.print(bouquet1);

    }
}
