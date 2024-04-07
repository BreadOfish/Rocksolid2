package com.breadofish.rocksolid.item;

import com.breadofish.rocksolid.rocksolid;
import com.breadofish.rocksolid.world.food.ModFoods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //Gets a list of items and lets forge register the item.
    //TODO: Implement every other item... (That's used, not the unused stuff from 1.0)

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, rocksolid.MODID);

    public static final RegistryObject<Item> amongus = ITEMS.register("amongus",
            ()-> new Item(new Item.Properties().food(ModFoods.AmongUs)));


    //I don't know what the fuck that function does
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
