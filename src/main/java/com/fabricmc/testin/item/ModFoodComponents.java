package com.fabricmc.testin.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GENERIC_TEA = new FoodComponent.Builder()
            .hunger(1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent CORROSION_TEA = new FoodComponent.Builder()
            .hunger(-1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1), 1.0F)
            .alwaysEdible()
            .build();


    public static final FoodComponent SMALL_FRUIT = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.6f)
            .build();

    public static final FoodComponent CHEWY_GRASSES = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.6f)
            .build();

    public static final FoodComponent MUSHROOM_TEA = new FoodComponent.Builder().hunger(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 400), 0.5F)
            .alwaysEdible()
            .build();
}
