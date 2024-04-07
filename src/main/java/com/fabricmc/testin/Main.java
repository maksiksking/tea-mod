package com.fabricmc.testin;

import com.fabricmc.testin.item.ModItemGroups;
import com.fabricmc.testin.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "teamod";
    public static final Logger LOGGER = LoggerFactory.getLogger("testinmod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric!");

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}