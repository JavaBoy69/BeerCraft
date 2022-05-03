package com.cryzzz.thealcoholicsmod.world.feature;

import com.cryzzz.thealcoholicsmod.world.feature.ModConfiguredFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeaturres {
    public static final PlacedFeature WEED_BUSH_PLACED = PlacementUtils.register("weed_bush_placed",
            ModConfiguredFeatures.WEED_BUSH_CONFIG.placed(RarityFilter.onAverageOnceEvery(8), InSquarePlacement
                    .spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature COCA_BUSH_PLACED = PlacementUtils.register("coca_bush_placed",
            ModConfiguredFeatures.COCA_PLANT_CONFIG.placed(RarityFilter.onAverageOnceEvery(48), InSquarePlacement
                    .spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));


}
