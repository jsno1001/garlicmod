package com.garlic.mod.items;

import net.minecraft.world.level.block.Block;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.*;

public class GarlicItem extends Item {
    public GarlicItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        if (!level.isClientSide()) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1000, 0));
            if (level.random.nextBoolean() == true) {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 400, 2));
            }
        }
        return super.finishUsingItem(stack, level, livingEntity);
    }
}
