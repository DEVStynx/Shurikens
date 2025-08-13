package de.stynxyxy.shurikens.item;

import de.stynxyxy.shurikens.ShurikensMod;
import de.stynxyxy.shurikens.item.shuriken.shurikens.BasicShurikenItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static Item BASIC_SHURIKEN = registerItem("basic_shuriken",new BasicShurikenItem());



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ShurikensMod.MOD_ID,name),item);
    }

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register( entries -> {
            entries.add(new ItemStack(BASIC_SHURIKEN,1));
        });
    }
}
