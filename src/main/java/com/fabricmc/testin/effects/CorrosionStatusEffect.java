package com.fabricmc.testin.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.text.Text;

public class CorrosionStatusEffect extends StatusEffect {
    public CorrosionStatusEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public CorrosionStatusEffect() {
        super(
                StatusEffectCategory.HARMFUL,
                0x2A2A2A);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.getWorld().isClient() && pLivingEntity.getHealth()>2 && pLivingEntity.isAlive()) {
            pLivingEntity.sendMessage(Text.literal(pLivingEntity.getDisplayName().getString() +
                    " Vibe Check: " ));
            pLivingEntity.sendMessage(Text.literal(pLivingEntity.getDisplayName().getString() +
                    " Vibe Check: " + pLivingEntity.damage(pLivingEntity.getWorld().getDamageSources().wither(), 1.0f)));

            pLivingEntity.damage(pLivingEntity.getWorld().getDamageSources().outOfWorld(), 1.0f);
        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
