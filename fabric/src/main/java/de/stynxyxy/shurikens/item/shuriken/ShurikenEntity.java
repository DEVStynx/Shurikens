package de.stynxyxy.shurikens.item.shuriken;

import de.stynxyxy.shurikens.entity.ModEntities;
import de.stynxyxy.shurikens.item.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.server.network.EntityTrackerEntry;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

public class ShurikenEntity extends ThrownItemEntity {
    public ShurikenEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public ShurikenEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.BASIC_SHURIKEN_PROJECTILE, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.BASIC_SHURIKEN;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket(EntityTrackerEntry entityTrackerEntry) {
        return new EntitySpawnS2CPacket(this,entityTrackerEntry);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        MinecraftClient.getInstance().player.sendMessage(Text.of("Hit ground!"));
        super.onBlockHit(blockHitResult);
    }
}
