package com.gildedrose;

import com.gildedrose.exception.ItemException;
import com.gildedrose.proxy.AgedBrie;
import com.gildedrose.proxy.Backstage;
import com.gildedrose.proxy.GeneralItem;
import com.gildedrose.proxy.Sulfuras;
import com.gildedrose.proxy.UpdatableItem;

public class ItemFactory {
    public static UpdatableItem getItem(String name, int sellIn, int quality) throws ItemException {
        if (name.equals(Sulfuras.name()))
            return new Sulfuras(sellIn, quality);
        else if (name.equals(Backstage.name()))
            return new Backstage(sellIn, quality);
        else if (name.equals(AgedBrie.name()))
            return new AgedBrie(sellIn, quality);
        else
            return new GeneralItem(name, sellIn, quality);
    }
}
