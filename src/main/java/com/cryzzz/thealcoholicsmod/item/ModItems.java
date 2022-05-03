package com.cryzzz.thealcoholicsmod.item;

import com.cryzzz.thealcoholicsmod.TheAlcoholicsMod;
import com.cryzzz.thealcoholicsmod.block.ModBlocks;
import com.cryzzz.thealcoholicsmod.effects.DrugEffects;
import com.cryzzz.thealcoholicsmod.item.custom.CocaineDrug;
import com.cryzzz.thealcoholicsmod.item.custom.Drug;
import com.cryzzz.thealcoholicsmod.item.custom.Knife;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {


    public static final DeferredRegister <Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheAlcoholicsMod.MOD_ID);  // List of Items --> Tracking of items

    public static final RegistryObject<Item> JOINT = ITEMS.register("joint", () -> new Drug(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)
            .food(new FoodProperties.Builder().nutrition(0).saturationMod(0)
                    .effect(()-> new MobEffectInstance(MobEffects.CONFUSION, 300), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.LEVITATION, 150), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.SLOW_FALLING, 325), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.NIGHT_VISION, 1200), 1)
                    .alwaysEat().build())));

    public static final RegistryObject<Item> WEED_LEAF = ITEMS.register("weed_leaf", () -> new ItemNameBlockItem(ModBlocks.WEED.get(), new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> WEED_COOKIE = ITEMS.register("weed_cookie", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD).
            food(new FoodProperties.Builder().nutrition(3).saturationMod(0.2f)
                    .effect(()-> new MobEffectInstance(MobEffects.CONFUSION, 150), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.LEVITATION, 75), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.INVISIBILITY, 100), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.SLOW_FALLING, 150), 1)
                    .alwaysEat().build())));

    public static final RegistryObject<Item> COCA_SEED = ITEMS.register("coca_seed", () -> new ItemNameBlockItem(ModBlocks.COCA_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> COCAINE_LEAF = ITEMS.register("cocaine_leaf", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> CUTTED_COCA_LEAFS = ITEMS.register("cutted_coca_leafs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> COCAINE_RAW = ITEMS.register("cocaine_raw", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> COCA_DRY = ITEMS.register("coca_dry", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> COCAINE_SNIFF = ITEMS.register("cocaine_with_paper", () -> new CocaineDrug(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)
            .food(new FoodProperties.Builder().nutrition(0).saturationMod(0)
                    .effect(()-> new MobEffectInstance(MobEffects.CONFUSION, 900), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.JUMP, 1200, 1), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 1), 1)
                    .effect(()-> new MobEffectInstance(MobEffects.GLOWING, 3600, 1), 1)
                    .alwaysEat().build())));


    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife", () -> new Knife(Tiers.IRON, 0, 5f, new Item.Properties().durability(80).tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> CANISTER_EMPTY = ITEMS.register("canister_empty", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> CANISTER_WITH_ACID = ITEMS.register("canister_with_acid", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> CRACK = ITEMS.register("crack", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> CRACK_PIPE = ITEMS.register("crack_pipe", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)));

    public static final RegistryObject<Item> PIPE_WITH_CRACK = ITEMS.register("crack_pipe_filled", () -> new Drug(new Item.Properties().tab(ModCreativeModeTab.THE_ALCOHOLICS_MOD)
            .food(new FoodProperties.Builder().nutrition(0).saturationMod(0)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 1f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_BENEFICIAL_EFFECT, 1200), 0.25f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_BENEFICIAL_EFFECT, 1200), 0.3f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_BENEFICIAL_EFFECT, 1200), 0.4f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_BENEFICIAL_EFFECT, 1200), 0.33f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_BENEFICIAL_EFFECT, 1200), 0.25f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_BENEFICIAL_EFFECT, 1200), 0.27f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_HARMFUL_EFFECT, 1200), 0.4f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_HARMFUL_EFFECT, 1200), 0.39f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_HARMFUL_EFFECT, 1200), 0.41f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_HARMFUL_EFFECT, 1200), 0.5f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_HARMFUL_EFFECT, 1200), 0.4f)
                    .effect(() -> new MobEffectInstance(DrugEffects.RANDOM_HARMFUL_EFFECT, 1200), 0.33f)
                    .alwaysEat().build())));













    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
