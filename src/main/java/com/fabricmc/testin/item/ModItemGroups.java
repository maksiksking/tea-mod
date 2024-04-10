package com.fabricmc.testin.item;

import com.fabricmc.testin.Main;
import com.fabricmc.testin.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup TEA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Main.MOD_ID, "tea"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tea"))
                    .icon(() -> new ItemStack(ModItems.GREEN_TEA)).entries((displayContext, entries) -> {
                        // items
                        entries.add(new ItemStack(ModItems.GREEN_TEA));
                        entries.add(new ItemStack(ModItems.BLACK_TEA));
                        entries.add(new ItemStack(ModItems.GUELDER_ROSE_TEA));
                        entries.add(new ItemStack(ModItems.GINGER_TEA));
                        entries.add(new ItemStack(ModItems.MINT_TEA));
                        entries.add(new ItemStack(ModItems.SEA_BUCKTHORN_TEA));
                        entries.add(new ItemStack(ModItems.BERRY_JAM_TEA));
                        entries.add(new ItemStack(ModItems.SOURSOUP_TEA));
                        entries.add(new ItemStack(ModItems.CHERRY_TEA));
                        entries.add(new ItemStack(ModItems.HONEY_TEA));
                        entries.add(new ItemStack(ModItems.STRAWBERRY_MINT_ICE_TEA));
                        entries.add(new ItemStack(ModItems.MYSTIC_RUNE_TEA));
                        entries.add(new ItemStack(ModItems.MUSHROOM_TEA));

                        // blocks
                        entries.add(new ItemStack(ModBlocks.HAZARD_BLOCK));
                    }).build());

    public static void registerItemGroups() {
        Main.LOGGER.info("Regiser Item Groups for: " + Main.MOD_ID);
    }
}
