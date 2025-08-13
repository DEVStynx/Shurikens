package de.stynxyxy.shurikens.item.shuriken;

import net.minecraft.item.Item;

public class ShurikenItem extends Item {
    private final int maxCount;
    private final String lable;
    public ShurikenItem(int maxCount, String lable) {
        super(new Settings().maxCount(maxCount));
        this.maxCount = maxCount;
        this.lable = lable;
    }


    @Override
    public int getMaxCount() {
        return maxCount;
    }

    public String getLable() {
        return lable;
    }
}
