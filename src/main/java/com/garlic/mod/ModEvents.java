package com.garlic.mod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.EventBus;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber(modid=garlicmod.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void AddCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.GARLIC_ITEM.get());
            event.accept(ModItems.GOLDEN_GARLIC_ITEM.get());
        }
    }

    //@SubscribeEvent (priority = EventPriority.LOWEST)
    //public static void gatherData(GatherDataEvent event) {
    //    var generator = event.getGenerator();
    //    generator.addProvider(event.includeServer(),
    //                          new RecipesGenerator(generator.getPackOutput(), event.getLookupProvider())
    //    );
    //
    //}

    @SubscribeEvent
    public static void onEvent(BlockEvent.BreakEvent event) {
    }

}
