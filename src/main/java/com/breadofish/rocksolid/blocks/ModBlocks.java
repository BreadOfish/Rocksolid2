package com.breadofish.rocksolid.blocks;

import com.breadofish.rocksolid.item.ModItems;
import com.breadofish.rocksolid.rocksolid;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, rocksolid.MODID);

    //Section defines blocks. For example, the first one defines stone glass.
    public static final RegistryObject<Block> stone_glass = registerBlock("stone_glass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> andersite_diamond = registerBlock("andersite_diamond", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).noCollission()));
    public static final RegistryObject<Block> blackstone_glass = registerBlock("blackstone_glass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> deepslate_glass = registerBlock("deepslate_glass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> deepslatebrick_glass = registerBlock("deepslatebrick_glass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> diorite_diamond = registerBlock("diorite_diamond", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).noCollission()));
    public static final RegistryObject<Block> diorite_glass = registerBlock("diorite_glass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f).));
    public static final RegistryObject<Block> framedandersiteglass = registerBlock("framedandersiteglass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> framedblackstoneglass = registerBlock("framedblackstoneglass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> frameddeepslateglass = registerBlock("frameddeepslateglass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> frameddioriteglass = registerBlock("frameddioriteglass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));

    public static final RegistryObject<Block> framedgranteglass = registerBlock("framedgranteglass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> framedsmglass = registerBlock("framedsmglass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> framedstoneglass = registerBlock("framedstoneglass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> granite_diamond = registerBlock("granite_diamond", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).noCollission()));
    public static final RegistryObject<Block> grante_glass = registerBlock("grante_glass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> smooth_glass = registerBlock("smooth_glass", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noCollission().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> tuffblock = registerBlock("tuffblock", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).noCollission()));

    //This section is complex java stuff which basically passes info along to forge.
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> returnObj = BLOCKS.register(name, block);
        registerBlockItem(name, returnObj);
        return returnObj;
    }
    //I hate Java. (Registers items)
    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
