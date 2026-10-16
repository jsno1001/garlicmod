package com.garlic.mod.items;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GarlicItem extends Item {
    public GarlicItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        livingEntity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1000, 1));
        if (level.random.nextBoolean() == true) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 20));
        }

        return super.finishUsingItem(stack, level, livingEntity);
    }
}
