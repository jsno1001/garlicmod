package com.garlic.mod.items;

import java.lang.Math;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GoldenGarlicItem extends Item {
    public GoldenGarlicItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        ItemStack item_stack = super.finishUsingItem(stack, level, livingEntity);
        if (!level.isClientSide()){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 2000, 0));
            livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000, 0));
            livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1));
            if (Math.abs(level.random.nextDouble()) > 0.9) {

                livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 300, 3));
                livingEntity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 1000, 99));
                livingEntity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 3000, 2));
            }
        }
        return item_stack;
    }
}
