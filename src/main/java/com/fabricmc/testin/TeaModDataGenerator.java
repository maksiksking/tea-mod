package com.fabricmc.testin;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;


public class TeaModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        // copy over if I need and stuff
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
    }

//    @Override
//    public void buildRegistry(RegistryBuilder registryBuilder) {
//        registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, tbdModDimensions::bootstrapType);
//    }
}