package com.cryzzz.thealcoholicsmod.world.gen;

import com.cryzzz.thealcoholicsmod.world.feature.ModPlacedFeaturres;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;


public class ModFlowerGeneration {

    public static void generateFlowers(final BiomeLoadingEvent event){
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.JUNGLE) || types.contains(BiomeDictionary.Type.SAVANNA)){
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> ModPlacedFeaturres.WEED_BUSH_PLACED);
        }

        if(types.contains(BiomeDictionary.Type.JUNGLE)){
            List<Supplier<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
            base.add(() -> ModPlacedFeaturres.COCA_BUSH_PLACED);
        }
    }
}
