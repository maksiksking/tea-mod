package com.fabricmc.testin.item.custom;

// corrosion

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EssenceOfLonelinessTea extends Item {
    public EssenceOfLonelinessTea(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    public static boolean ifTickForCorrosion = false;
    public static int corrosionTicks = 0;
    public static int corrosionIter = 0;

    private static World world1;
    private static LivingEntity user1;

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        world1 = world;
        user1 = user;

        corrosionTicks = 0;
        ifTickForCorrosion = true;

        return super.finishUsing(stack, world, user);
    }

    public static void tryCorroding() {
        if (user1.getHealth()>2 && user1.isAlive() && corrosionTicks<300) {
            user1.sendMessage(Text.literal(user1.getDisplayName().getString() + " Vibe Check: " ));
            user1.sendMessage(Text.literal(user1.getDisplayName().getString() + " Vibe Check: " + corrosionTicks ));
            user1.sendMessage(Text.literal(user1.getDisplayName().getString() + " Vibe Check: " + corrosionIter ));
            user1.sendMessage(Text.literal(user1.getDisplayName().getString() + " Vibe Check: " + user1.damage(world1.getDamageSources().wither(), 1.0f)));

            user1.damage(world1.getDamageSources().magic(), 1.0f);
        } else {
            ifTickForCorrosion = false;
        }
        corrosionTicks++;

    }

//    public static void iterateCorrosion() {
//        user1.sendMessage(Text.literal(user1.getDisplayName().getString() + " Vibe Check: " + corrosionIter ));
//        corrosionIter++;
//    }

    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ITEM_BUCKET_FILL_LAVA;
    }
}
