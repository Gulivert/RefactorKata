package com.gildedrose.proxy;

import com.gildedrose.Item;

public class GeneralItem implements UpdatableItem {
    private Item item;

    public GeneralItem(String name, int sellIn, int quality) {
        item = new Item(name,sellIn,quality);
    }

    @Override
    public void update() {
        --item.sellIn;
        if(item.sellIn<=0)
            degradateDouble();
        else
            degradate();

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
    public String toString() {
        return item.toString();
    }


    @Override
    public String getName(){
        return item.name;
    }
}
