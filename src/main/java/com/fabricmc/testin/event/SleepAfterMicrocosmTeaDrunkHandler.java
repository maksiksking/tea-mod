package com.fabricmc.testin.event;

import com.fabricmc.testin.item.custom.MicrocosmTeaItem;
import com.fabricmc.testin.item.ModItems;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.registry.tag.BlockTags.BEDS;

public class SleepAfterMicrocosmTeaDrunkHandler implements UseBlockCallback {
    public static boolean ifTickForSleep = false;
    private static PlayerEntity player1 = null;
    private World world1 = null;
    private Hand hand1 = null;
    private BlockHitResult hitResult1 = null;


    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {
        boolean ifSleepTeleports = MicrocosmTeaItem.ifSleepTeleports;

        // redec
        player1 = player;
        world1 = world;
        hand1 = hand;
        hitResult1 = hitResult;

        TagKey<Block> tagKey = BEDS;
        BlockState state = world.getBlockState(hitResult.getBlockPos());

        if (!world.isClient && isBed(state, tagKey) && ifSleepTeleports && world1.getDimension().bedWorks()) {
            ifTickForSleep = true;
        }

        return ActionResult.PASS;
    }

    public static final Logger LOGGER = LoggerFactory.getLogger("testinmod");

    public static void tryGivingDreamEnergy() {
        player1.sendMessage(Text.literal(player1.getDisplayName().getString() + " Vibe Check: " + player1.getSleepTimer()), false);
        player1.sendMessage(Text.literal(player1.getDisplayName().getString() + " Vibe Check: " + player1.canResetTimeBySleeping()), false);
        if (player1.canResetTimeBySleeping()) {
            player1.sendMessage(Text.literal(player1.getDisplayName().getString() + " Get a mint: " + player1.canResetTimeBySleeping()), false);
            player1.giveItemStack(new ItemStack(ModItems.MINT));

            MicrocosmTeaItem.ifSleepTeleports = false;
            ifTickForSleep = false;
        }
    }

    // replace mint with dream energy or something

    private static boolean isBed(BlockState state, TagKey<Block> tagKey) {
        return state.isIn(tagKey);
    }
}
