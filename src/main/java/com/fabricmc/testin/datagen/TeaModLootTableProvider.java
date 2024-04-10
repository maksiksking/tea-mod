package com.fabricmc.testin.datagen;

import com.fabricmc.testin.block.ModBlocks;
import com.fabricmc.testin.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.loottable.LootTableProvider;

public class TeaModLootTableProvider extends FabricBlockLootTableProvider {
    public TeaModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.HAZARD_BLOCK, ModItems.MUSHROOM_TEA);
    }
}
