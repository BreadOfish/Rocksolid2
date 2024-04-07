package com.breadofish.rocksolid.world.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    //Test food.
    public static final FoodProperties AmongUs = (new FoodProperties.Builder()).nutrition(2555).saturationMod(255F).effect(new MobEffectInstance(MobEffects.REGENERATION, 255, 255), 255F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 255), 255.0F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0F).alwaysEat().build();
    //TODO: Add the GLOW_BERRIES property to the regular glow berries.
    public static final FoodProperties GLOW_BERRIES = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1), 1.0f).alwaysEat().build();

}
