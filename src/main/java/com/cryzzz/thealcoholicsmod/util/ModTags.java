package com.cryzzz.thealcoholicsmod.util;

import com.cryzzz.thealcoholicsmod.TheAlcoholicsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks{
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(new ResourceLocation(TheAlcoholicsMod.MOD_ID, name));
        }
        private static TagKey<Block> createForgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items{
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(new ResourceLocation(TheAlcoholicsMod.MOD_ID, name));
        }
        private static TagKey<Item> createForgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
