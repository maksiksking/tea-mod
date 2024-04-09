package com.fabricmc.testin;

import com.fabricmc.testin.block.ModBlocks;
import com.fabricmc.testin.event.AttackEntityWithTeaHandler;
import com.fabricmc.testin.item.ModItemGroups;
import com.fabricmc.testin.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "teamod";
    public static final Logger LOGGER = LoggerFactory.getLogger("testinmod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric!");
		// item groups
		ModItemGroups.registerItemGroups();

		// items
		ModItems.registerModItems();

		// blocks
		ModBlocks.registerModBlocks();

		// events
		AttackEntityCallback.EVENT.register(new AttackEntityWithTeaHandler());
	}
}