package com.cryzzz.thealcoholicsmod.world.feature;

import com.cryzzz.thealcoholicsmod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> WEED_BUSH_CONFIG = FeatureUtils.register("weed_bush",
            Feature.FLOWER.configured(new RandomPatchConfiguration(16, 6, 2, () -> {return Feature.SIMPLE_BLOCK
                    .configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WEED_BUSH.get()))).onlyWhenEmpty();})));

    public static final ConfiguredFeature<RandomPatchConfiguration, ?> COCA_PLANT_CONFIG = FeatureUtils.register("coca_bush",
            Feature.FLOWER.configured(new RandomPatchConfiguration(8, 4, 2, () -> {return Feature.SIMPLE_BLOCK
                    .configured(new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COCA_BUSH.get()))).onlyWhenEmpty();})));




    private static <FC extends FeatureConfiguration> ConfiguredFeature<FC, ?> register(String p_127056_, ConfiguredFeature<FC, ?> p_127057_) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, p_127056_, p_127057_);
    }


}
