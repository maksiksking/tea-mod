package com.fabricmc.testin.item;

import com.fabricmc.testin.Main;
import com.fabricmc.testin.item.custom.TeaItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GREEN_TEA = registerItem("green_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GREEN_TEA)));
    public static final Item BLACK_TEA = registerItem("black_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GREEN_TEA)));

    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(GREEN_TEA);
        entries.add(BLACK_TEA);
    }

    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, id), item);
    }

    public static void registerModItems() {
        Main.LOGGER.info("Registering Mod Items for " + Main.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
    }
}
