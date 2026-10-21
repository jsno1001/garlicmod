package com.garlic.mod;

import com.garlic.mod.blocks.GarlicPlantBlock;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(garlicmod.MODID);

    public static DeferredBlock<GarlicPlantBlock> GARLIC_PLANT_BLOCK = BLOCKS.register("garlic_plant",
        () -> new GarlicPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noTerrainParticles().sound(SoundType.CROP).noCollission()));

    public static void register(IEventBus event) {
        BLOCKS.register(event);
    }
}
