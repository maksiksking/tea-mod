package com.fabricmc.testin.item;

import com.fabricmc.testin.Main;
import com.fabricmc.testin.item.custom.HoneySoundTeaItem;
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
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item BLACK_TEA = registerItem("black_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item GUELDER_ROSE_TEA = registerItem("guelder_rose_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item GINGER_TEA = registerItem("ginger_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item MINT_TEA = registerItem("mint_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item SEA_BUCKTHORN_TEA = registerItem("sea_buckthorn_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item BERRY_JAM_TEA = registerItem("berry_jam_mix_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item SOURSOUP_TEA = registerItem("soursoup_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item CHERRY_TEA = registerItem("cherry_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item HONEY_TEA = registerItem("honey_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item STRAWBERRY_MINT_ICE_TEA = registerItem("strawberry_mint_ice_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));


    public static final Item MYSTIC_RUNE_TEA = registerItem("mystic_rune_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item MUSHROOM_TEA = registerItem("mushroom_tea", new HoneySoundTeaItem(new FabricItemSettings()
            .food(ModFoodComponents.MUSHROOM_TEA)));


    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(GREEN_TEA);
        entries.add(BLACK_TEA);
        entries.add(GUELDER_ROSE_TEA);
        entries.add(GINGER_TEA);
        entries.add(MINT_TEA);
        entries.add(SEA_BUCKTHORN_TEA);
        entries.add(BERRY_JAM_TEA);
        entries.add(SOURSOUP_TEA);
        entries.add(CHERRY_TEA);
        entries.add(HONEY_TEA);
        entries.add(STRAWBERRY_MINT_ICE_TEA);
        entries.add(MYSTIC_RUNE_TEA);
        entries.add(MUSHROOM_TEA);
    }

    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, id), item);
    }

    public static void registerModItems() {
        Main.LOGGER.info("Registering Mod Items for " + Main.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
    }
}
