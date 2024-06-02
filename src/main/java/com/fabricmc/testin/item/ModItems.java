package com.fabricmc.testin.item;

import com.fabricmc.testin.Main;
import com.fabricmc.testin.block.ModBlocks;
import com.fabricmc.testin.item.custom.EssenceOfLonelinessTea;
import com.fabricmc.testin.item.custom.HoneySoundTeaItem;
import com.fabricmc.testin.item.custom.MicrocosmTeaItem;
import com.fabricmc.testin.item.custom.TeaItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // teas
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
    public static final Item ESSENCE_OF_LONELINESS = registerItem("essence_of_loneliness", new EssenceOfLonelinessTea(new FabricItemSettings()
            .food(ModFoodComponents.CORROSION_TEA)));


    // uf tdb (no texture)
    public static final Item ICE_TEA = registerItem("ice_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item OOLONG_TEA = registerItem("oolong_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item PUERH_TEA = registerItem("puerh_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // google the pronoun pls
    public static final Item CHAMOMILE_TEA = registerItem("chamomile_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item FRUIT_TEA = registerItem("fruit_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // some sorta idk, under q
    public static final Item CHAI = registerItem("chai", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // gl naming it lmao
    public static final Item APRICOT_TEA = registerItem("apricot_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // is it even a thing
    public static final Item APPLE_TEA = registerItem("apple_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // it is a thing apparently

    // special teas
    public static final Item MYSTIC_RUNE_TEA = registerItem("mystic_rune_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA)));
    public static final Item MUSHROOM_TEA = registerItem("mushroom_tea", new HoneySoundTeaItem(new FabricItemSettings()
            .food(ModFoodComponents.MUSHROOM_TEA)));
    public static final Item URANIUM_TEA = registerItem("uranium_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // no uranium yet
    public static final Item SUPER_HEALTHY_AND_TASTY_TEA = registerItem("super_healthy_and_tasty_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // what would you even craft this with

    // tba
    public static final Item ASTRO_TEA = registerItem("astro_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); //name w space
    public static final Item SLEEPYTIME_TEA = registerItem("sleepytime_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // afterplace
    public static final Item MICROCOSM_TEA = registerItem("microcosm_tea", new MicrocosmTeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // bed thing
    public static final Item VOID_TEA = registerItem("void_tea", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.GENERIC_TEA))); // no bottle o void yet

    // literally anything that's not a tea
    // tea ingredients
    public static final Item TEA_LEAVES = registerItem("tea_leaves", new AliasedBlockItem(ModBlocks.TEA_BUSH_BLOCK,
            new FabricItemSettings()
            .food(ModFoodComponents.CHEWY_GRASSES)));
    public static final Item CHERRY = registerItem("cherry", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.SMALL_FRUIT)));
    public static final Item MINT = registerItem("mint", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.CHEWY_GRASSES))); // retexture duh
    public static final Item URANIUM = registerItem("uranium", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.CHEWY_GRASSES))); // keep it chewy

    // tbd
    public static final Item APRICOT = registerItem("apricot", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.SMALL_FRUIT)));
    public static final Item CHAMOMILE = registerItem("chamomile", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.CHEWY_GRASSES)));
    public static final Item MELISSA = registerItem("melissa", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.CHEWY_GRASSES))); // find English name
    public static final Item BOTTLE_OF_VOID = registerItem("bottle_of_void", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.CHEWY_GRASSES))); // keep it chewy

    // hilvan
    public static final Item HILVAN = registerItem("hilvan", new TeaItem(new FabricItemSettings()
            .food(ModFoodComponents.MUSHROOM_TEA)));


    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        // teas
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
        entries.add(SLEEPYTIME_TEA);
        entries.add(ESSENCE_OF_LONELINESS);
        // add lots of stuff here later on

        // not teas
        entries.add(new ItemStack(ModItems.TEA_LEAVES));
    }

    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, id), item);
    }

    public static void registerModItems() {
        Main.LOGGER.info("Registering Mod Items for " + Main.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
    }
}
