package com.fabricmc.testin.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GREEN_TEA = new FoodComponent.Builder().hunger(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 1.0F)
            .build();
    public static final FoodComponent BLACK_TEA = new FoodComponent.Builder().hunger(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 1.0F)
            .build();
}
