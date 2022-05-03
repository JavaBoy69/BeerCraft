package com.cryzzz.thealcoholicsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab THE_ALCOHOLICS_MOD = new CreativeModeTab("alcoholicsmodTab"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.WEED_LEAF.get());
        }
    };
}
