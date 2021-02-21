package com.gildedrose.proxy;

import com.gildedrose.Item;
import com.gildedrose.exception.ItemException;

public class Sulfuras implements UpdatableItem {
    private final static String name = "Sulfuras, Hand of Ragnaros";
    private Item item;

    public Sulfuras() {
        item = new Item(name,0,80);
    }

    public Sulfuras(int sellIn, int quality) throws ItemException {
        if(sellIn>0)
        throw new ItemException("A Sulfuras couldn't be sold");
        if(quality!=80)
            throw new ItemException("Quality of Sulfuras is always 80");

        item = new Item(name,0,80);
    }

    public static String name() {
        return name;
    }


    @Override
    public void update() {
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
