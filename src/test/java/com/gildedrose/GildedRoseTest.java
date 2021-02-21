package com.gildedrose;


import com.gildedrose.exception.ItemException;
import com.gildedrose.proxy.UpdatableItem;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GildedRoseTest {
    @Test
    public void foo() throws ItemException {
        UpdatableItem[] items = new UpdatableItem[] { ItemFactory.getItem("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].getName());
    }
}
