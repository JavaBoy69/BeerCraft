package com.cryzzz.thealcoholicsmod.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

public class CocaineDrug extends Drug implements DrugSound{
    public CocaineDrug(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.WITHER_SHOOT;
    }
}
