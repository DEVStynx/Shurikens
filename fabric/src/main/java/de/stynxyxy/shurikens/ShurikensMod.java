package de.stynxyxy.shurikens;

import de.stynxyxy.shurikens.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShurikensMod implements ModInitializer {
    public static final String MOD_ID = "shurikens-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItems.register();
    }
}
