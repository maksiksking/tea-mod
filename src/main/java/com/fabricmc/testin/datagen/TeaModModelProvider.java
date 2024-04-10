package com.fabricmc.testin.datagen;

import com.fabricmc.testin.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class TeaModModelProvider extends FabricModelProvider {
    public TeaModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GUELDER_ROSE_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.GINGER_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINT_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEA_BUCKTHORN_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.BERRY_JAM_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOURSOUP_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY_MINT_ICE_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYSTIC_RUNE_TEA, Models.GENERATED);
    }
}
