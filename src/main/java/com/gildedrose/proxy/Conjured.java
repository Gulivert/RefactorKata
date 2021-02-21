package com.gildedrose.proxy;

import com.gildedrose.Item;

public class Conjured implements UpdatableItem {
    private Item item;

    public Conjured(String name, int sellIn, int quality) {
        item = new Item(name,sellIn,quality);
    }

    @Override
    public void update() {
        --item.sellIn;
        degradateDouble();

    }

    private void degradate() {
        if(item.quality>0)
            --item.quality ;
    }

    private void degradateDouble() {
        degradate();
        degradate();
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
