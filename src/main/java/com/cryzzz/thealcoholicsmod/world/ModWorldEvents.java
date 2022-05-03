package com.cryzzz.thealcoholicsmod.world;

import com.cryzzz.thealcoholicsmod.TheAlcoholicsMod;
import com.cryzzz.thealcoholicsmod.world.gen.ModFlowerGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheAlcoholicsMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModFlowerGeneration.generateFlowers(event);

    }
}
