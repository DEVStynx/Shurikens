package de.stynxyxy.shurikens;

import de.stynxyxy.shurikens.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class ShurikensModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BASIC_SHURIKEN_PROJECTILE, FlyingItemEntityRenderer::new);
    }
}
