package com.cryzzz.thealcoholicsmod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class VesselItem extends Item {

    public VesselItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack container = itemStack.copy();
        return container;
    }
}
