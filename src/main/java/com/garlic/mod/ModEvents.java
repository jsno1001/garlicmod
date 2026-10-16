package com.garlic.mod;

import net.minecraft.world.item.Items;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber(modid=garlicmod.MODID)
public class ModEvents {

    //public ModEvents() {
    //    NeoForge.EVENT_BUS.register(this);
    //}

    @SubscribeEvent
    public static void onEvent(BlockEvent.BreakEvent event) {
    }

}
