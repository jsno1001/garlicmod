package com.garlic.mod;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import com.garlic.mod.items.GarlicItem;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Items {
    //public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(mcmod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, garlicmod.MODID);

    public static final DeferredHolder<Item, Item> HUSK_ITEM = ITEMS.register("husk", () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, GarlicItem> GARLIC_ITEM = ITEMS.register("garlic",
        () -> new GarlicItem(new Item.Properties().stacksTo(32)
            .food(new FoodProperties(1, 10, true, 3, Optional.of(new ItemStack(HUSK_ITEM)), Collections.emptyList()))
        )
    );


    public static void register(IEventBus event) {
        ITEMS.register(event);
    }
}
