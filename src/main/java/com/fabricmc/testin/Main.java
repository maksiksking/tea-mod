package com.fabricmc.testin;

import com.fabricmc.testin.block.ModBlocks;
import com.fabricmc.testin.effects.CorrosionStatusEffect;
import com.fabricmc.testin.event.AttackEntityWithTeaHandler;
import com.fabricmc.testin.event.SleepAfterMicrocosmTeaDrunkHandler;
import com.fabricmc.testin.item.ModItemGroups;
import com.fabricmc.testin.item.ModItems;
import com.fabricmc.testin.item.custom.EssenceOfLonelinessTea;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;


import net.fabricmc.fabric.api.event.player.AttackEntityCallback;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.fabricmc.testin.event.SleepAfterMicrocosmTeaDrunkHandler.tryGivingDreamEnergy;
import static com.fabricmc.testin.item.custom.EssenceOfLonelinessTea.*;

public class Main implements ModInitializer {
	public static final String MOD_ID = "teamod";
    public static final Logger LOGGER = LoggerFactory.getLogger("testinmod");

	public static StatusEffect CORROSION = new CorrosionStatusEffect();

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric!");
		// item groups
		ModItemGroups.registerItemGroups();

		// items
		ModItems.registerModItems();

		// item recipes


		// blocks
		ModBlocks.registerModBlocks();

		// events
		AttackEntityCallback.EVENT.register(new AttackEntityWithTeaHandler());
		SleepAfterMicrocosmTeaDrunkHandler.EVENT.register(new SleepAfterMicrocosmTeaDrunkHandler());

		// effects
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "corrosion"), CORROSION);

		// dims
//		ModDimensions.register();


		// tick
		ServerTickEvents.END_SERVER_TICK.register(server -> {
			boolean ifWaitForSleep = SleepAfterMicrocosmTeaDrunkHandler.ifTickForSleep;
			if (ifWaitForSleep) {
				tryGivingDreamEnergy();
			}
			if (ifTickForCorrosion) {
				tryCorroding();
			}
		});
	}


}