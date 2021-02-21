package com.gildedrose.proxy;

import com.gildedrose.Item;

public class AgedBrie implements UpdatableItem {
    private final static String name = "Aged Brie";
    private Item item;

    public AgedBrie(int sellIn, int quality) {
        item = new Item(name, sellIn, quality);
    }

    public static String name() {
        return name;
    }

    @Override
    public String getName(){
        return item.name;
    }

    @Override
    public void update() {
        --item.sellIn;
        if (item.quality < 50)
            item.quality++;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
