package com.garlic.mod;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.level.BlockEvent;

@EventBusSubscriber(modid=garlicmod.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void AddCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.GARLIC_ITEM.get());
            event.accept(ModItems.GOLDEN_GARLIC_ITEM.get());
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModItems.GARLIC_SEED_ITEM.get());
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
