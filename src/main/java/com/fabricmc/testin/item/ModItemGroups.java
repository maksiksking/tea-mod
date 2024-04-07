package com.fabricmc.testin.item;

import com.fabricmc.testin.Main;
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
                        entries.add(new ItemStack(ModItems.BLACK_TEA));
                        entries.add(new ItemStack(ModItems.GREEN_TEA));
                    }).build());

    public static void registerItemGroups() {
        Main.LOGGER.info("Regiser Item Groups for: " + Main.MOD_ID);
    }
}
