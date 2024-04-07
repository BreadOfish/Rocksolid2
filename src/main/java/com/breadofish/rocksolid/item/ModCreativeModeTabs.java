package com.breadofish.rocksolid.item;

import com.breadofish.rocksolid.blocks.ModBlocks;
import com.breadofish.rocksolid.rocksolid;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    //TODO: Make this work.
    public static final DeferredRegister<CreativeModeTab> CREATE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, rocksolid.MODID);

    //Tools tab. TODO: Use the enderite sword when programmed in.
    public static final RegistryObject<CreativeModeTab> TOOLS_TAB = CREATE_TABS.register("tools_tab", ()-> CreativeModeTab.builder().icon(()->
            new ItemStack(ModBlocks.stone_glass.get()))
            .title(Component.translatable("creative.tools_tab")) //Translation element, this is what is used in the lang files.
            .displayItems((pParameters, pOutput)-> {                      //This is where the blocks go. EX: pOutput.accept(ModItems.amongus.get());

            })
            .build());
    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATE_TABS.register("blocks_tab", ()-> CreativeModeTab.builder().icon(()->
            new ItemStack(ModBlocks.stone_glass.get()))
            .title(Component.translatable("creative.blocks_tab"))
            .displayItems((pParameters, pOutput)-> {                      //This is where the blocks go.
                pOutput.accept(ModBlocks.stone_glass.get());
                pOutput.accept(ModBlocks.smooth_glass.get());
                pOutput.accept(ModBlocks.diorite_glass.get());
                pOutput.accept(ModBlocks.smooth_glass.get());
                pOutput.accept(ModBlocks.deepslatebrick_glass.get());
                pOutput.accept(ModBlocks.grante_glass.get());
                pOutput.accept(ModBlocks.framedsmglass.get());
                pOutput.accept(ModBlocks.deepslate_glass.get());
                pOutput.accept(ModBlocks.framedandersiteglass.get());
                pOutput.accept(ModBlocks.framedgranteglass.get());
                pOutput.accept(ModBlocks.framedstoneglass.get());
                pOutput.accept(ModBlocks.framedblackstoneglass.get());
                pOutput.accept(ModBlocks.frameddioriteglass.get());
                pOutput.accept(ModBlocks.frameddeepslateglass.get());
                pOutput.accept(ModBlocks.diorite_diamond.get());
                pOutput.accept(ModBlocks.andersite_diamond.get());
                pOutput.accept(ModBlocks.granite_diamond.get());
                pOutput.accept(ModBlocks.tuffblock.get());

            })

            .build());
    public static final RegistryObject<CreativeModeTab> ITEM_TAB = CREATE_TABS.register("item_tab", ()-> CreativeModeTab.builder().icon(()->
            new ItemStack(ModBlocks.stone_glass.get()))
            .title(Component.translatable("creative.item_tab"))
            .displayItems((pParameters, pOutput)-> {                      //This is where the blocks go.
                pOutput.accept(ModItems.amongus.get());

            })
            .build());

    //Forge trying not to change literally everything on the mdk for five minutes (impossible)
    public static void register(IEventBus bus){
        CREATE_TABS.register(bus);
    }
}
