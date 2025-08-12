package de.stynxyxy.shurikens.neoforge;

import net.neoforged.fml.common.Mod;

import de.stynxyxy.shurikens.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
