package com.fabricmc.testin;

import com.fabricmc.testin.datagen.TeaModLootTableProvider;
import com.fabricmc.testin.datagen.TeaModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;


public class TeaModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
//        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
//
//        pack.addProvider(TeaModLootTableProvider::new);
//        pack.addProvider(TeaModModelProvider::new);
    }
}
