package de.stynxyxy.shurikens.entity;

import de.stynxyxy.shurikens.ShurikensMod;
import de.stynxyxy.shurikens.item.shuriken.ShurikenEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<ShurikenEntity> BASIC_SHURIKEN_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(ShurikensMod.MOD_ID,"basic_shuriken_projectile"),
            FabricEntityTypeBuilder.<ShurikenEntity>create(SpawnGroup.MISC, ShurikenEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f,0.25f))
                    .build());

}
