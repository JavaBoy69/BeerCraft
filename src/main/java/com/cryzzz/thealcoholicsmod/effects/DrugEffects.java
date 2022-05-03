package com.cryzzz.thealcoholicsmod.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;

import java.util.Random;

public class DrugEffects extends MobEffects {

    public static final MobEffect RANDOM_BENEFICIAL_EFFECT = chooseRandomBeneficialEffect();
    public static final MobEffect RANDOM_HARMFUL_EFFECT = chooseRandomHarmfulEffect();



    private static MobEffect chooseRandomBeneficialEffect(){
        MobEffect[] beneficialEffects = {MobEffects.MOVEMENT_SPEED, MobEffects.DIG_SPEED, MobEffects.DAMAGE_BOOST, MobEffects.HEAL, MobEffects.JUMP,
                                         MobEffects.REGENERATION, MobEffects.DAMAGE_RESISTANCE, MobEffects.FIRE_RESISTANCE, MobEffects.WATER_BREATHING,
                                         MobEffects.INVISIBILITY, MobEffects.NIGHT_VISION, MobEffects.HEALTH_BOOST, MobEffects.ABSORPTION, MobEffects.GLOWING};

        Random generator = new Random();
        int randomIndex = generator.nextInt(beneficialEffects.length);

        return beneficialEffects[randomIndex];
    }

    private static MobEffect chooseRandomHarmfulEffect(){

        MobEffect[] harmfulEffects = { MobEffects.MOVEMENT_SLOWDOWN, MobEffects.DIG_SLOWDOWN, MobEffects.HARM, MobEffects.BLINDNESS,
                                       MobEffects.HUNGER, MobEffects.WEAKNESS, MobEffects.POISON, MobEffects.WITHER, MobEffects.GLOWING };

        Random generator = new Random();
        int randomIndex = generator.nextInt(harmfulEffects.length);

        return harmfulEffects[randomIndex];
    }


}
