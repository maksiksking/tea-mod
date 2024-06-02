package com.fabricmc.testin.block;

import com.fabricmc.testin.Main;
import com.fabricmc.testin.block.custom.TeaBushBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block HAZARD_BLOCK = registerBlock("hazard_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TEA_BUSH_BLOCK = registerBlock("tea_bush_block", new TeaBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));

    // reg
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Main.LOGGER.info("Registering ModBlocks for" + Main.MOD_ID);
    }
}
