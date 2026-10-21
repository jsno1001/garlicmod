package com.garlic.mod;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import com.garlic.mod.blocks.GarlicPlantBlock;
import com.garlic.mod.items.*;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.effect.*;

public class ModItems {
    //public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(mcmod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, garlicmod.MODID);

    public static final DeferredHolder<Item, ItemNameBlockItem> GARLIC_HUSK_ITEM = ITEMS.register("garlic_husk", () -> new ItemNameBlockItem(ModBlocks.GARLIC_PLANT_BLOCK.get(), new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, GarlicItem> GARLIC_ITEM = ITEMS.register("garlic",
        () -> new GarlicItem(new Item.Properties().stacksTo(64)
            .food(new FoodProperties(1, 1, true, 3, Optional.of(new ItemStack(GARLIC_HUSK_ITEM)), Collections.emptyList()))
        )
    );

    public static final DeferredHolder<Item, GoldenGarlicItem> GOLDEN_GARLIC_ITEM = ITEMS.register("golden_garlic",
        () -> new GoldenGarlicItem(new Item.Properties().stacksTo(32)
            .food(new FoodProperties(1, 3, true, 3, Optional.empty(), Collections.emptyList())
            )
        )
    );

    public static final DeferredHolder<Item, ItemNameBlockItem> GARLIC_SEED_ITEM = ITEMS.register("garlic_seed", () -> new ItemNameBlockItem(ModBlocks.GARLIC_PLANT_BLOCK.get(), new Item.Properties().stacksTo(64)));


    public static void register(IEventBus event) {
        ITEMS.register(event);
    }
}
