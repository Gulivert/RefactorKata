package com.gildedrose.proxy;

import com.gildedrose.Item;

public class Backstage implements UpdatableItem {
    private final static String name = "Backstage passes to a TAFKAL80ETC concert";

    private Item item;

    public Backstage(int sellIn, int quality) {
        item = new Item(name, sellIn, quality);
    }

    public static String name() {
        return name;
    }

    @Override
    public void update() {
        if (item.sellIn == 1) {
            item.sellIn = 0;
            item.quality = 0;
        } else if (item.sellIn != 0) {
            --item.sellIn;
            updateQuality();
        }
    }

    private void updateQuality() {
        if (item.sellIn <= 5)
            item.quality += 3;
        else if (item.sellIn <= 10)
            item.quality += 2;
        else ++item.quality;

        if (item.sellIn > 50)
            item.quality = 50;
    }

    @Override
    public String getName(){
        return item.name;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
