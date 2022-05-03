package com.cryzzz.thealcoholicsmod.item.custom;

import com.cryzzz.thealcoholicsmod.item.ModCreativeModeTab;
import com.cryzzz.thealcoholicsmod.util.ModSoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class Drug extends Item implements DrugSound{
    public Drug(Item.Properties p_41383_) {
        super(p_41383_);

    }
    protected final CreativeModeTab category = ModCreativeModeTab.THE_ALCOHOLICS_MOD;




    @Override
    public UseAnim getUseAnimation(ItemStack p_41452_) {
        return UseAnim.DRINK;
    }

    @Override
    public int getUseDuration(ItemStack p_41454_) {
        return 32;
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.BLAZE_BURN;
    }

    /*
    public final CreativeModeTab getItemCategory() { return this.category; }
    */




}
