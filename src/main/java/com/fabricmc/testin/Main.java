package com.fabricmc.testin;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.registry.Registry;

public class Main implements ModInitializer {
	public static final String MOD_ID = "testingmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("testinmod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabri!");
	}
}