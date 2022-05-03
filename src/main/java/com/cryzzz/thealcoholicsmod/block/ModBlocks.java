package com.cryzzz.thealcoholicsmod.block;

import com.cryzzz.thealcoholicsmod.TheAlcoholicsMod;
import com.cryzzz.thealcoholicsmod.item.ModCreativeModeTab;
import com.cryzzz.thealcoholicsmod.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheAlcoholicsMod.MOD_ID);

    public static final RegistryObject<Block> WEED_PACKAGE = registerBlock("weed_package",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> COCAINE_PACKAGE = registerBlock("cocaine_package",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> WEED = BLOCKS.register("weed_crop",
            () -> new WeedCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> COCA_CROP = BLOCKS.register("coca_crop",
            () -> new CocaineCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> WEED_BUSH = BLOCKS.register("weed_bush",
            () -> new FlowerBlock(MobEffects.LEVITATION, 5, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> COCA_BUSH = BLOCKS.register("coca_bush",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 20, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion()));








    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){            //T muss UK von Blocks sein
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));
    }

    public static void register(IEventBus eventbus){
        BLOCKS.register(eventbus);
    }
}
