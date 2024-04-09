package com.fabricmc.testin.event;

import com.fabricmc.testin.item.ModItems;
import com.fabricmc.testin.item.custom.TeaItem;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AttackEntityWithTeaHandler implements AttackEntityCallback {
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity,
                                 @Nullable EntityHitResult hitResult) {
        if (entity instanceof PigEntity && player.getMainHandStack().getItem() == ModItems.GREEN_TEA && !world.isClient()) {
            player.sendMessage(Text.literal(player.getDisplayName().getString() + " tried to give a pig a tea"), false);

            world.addParticle(ParticleTypes.HEART, entity.getX(), entity.getY() + 2.0, entity.getZ(), 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.HEART, entity.getX(), entity.getY() + 2.0, entity.getZ(), 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.HEART, entity.getX(), entity.getY() + 2.0, entity.getZ(), 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.SONIC_BOOM, player.getX(), player.getY() + 2, player.getZ()+0.5, 2D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.SONIC_BOOM, player.getX(), player.getY() + 2, player.getZ(), 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.SONIC_BOOM, player.getX(), player.getY() + 2.0, player.getZ(), 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.SONIC_BOOM, player.getX(), player.getY() + 2.0, player.getZ(), 0.0D, 0.0D, 0.0D);
        }

        return ActionResult.PASS;
    }


}
