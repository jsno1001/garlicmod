package com.garlic.mod.blocks;

import java.util.ArrayList;
import java.util.List;

import com.garlic.mod.ModItems;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;

public class GarlicPlantBlock extends CropBlock {
    public GarlicPlantBlock(Properties properties) {
        super(properties);
    }
    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        List<ItemStack> drops = new ArrayList<>();

        if (this.isMaxAge(state)) {
            drops.add(new ItemStack(ModItems.GARLIC_ITEM.get(), 1));
            drops.add(new ItemStack(ModItems.GARLIC_SEED_ITEM.get()));
        }
        else drops.add(new ItemStack(ModItems.GARLIC_HUSK_ITEM.get()));

        return drops;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.GARLIC_HUSK_ITEM.get();
    }
    @Override
    public final int getMaxAge() {
        return 7;
    }

}
