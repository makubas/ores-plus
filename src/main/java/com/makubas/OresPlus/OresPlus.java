package com.makubas.OresPlus;

import com.makubas.OresPlus.registry.ModBlocks;
import com.makubas.OresPlus.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OresPlus implements ModInitializer {

    public static final String MOD_ID = "ores_plus";
    private static final ConfiguredFeature<?, ?> TIN_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.TIN_ORE.getDefaultState(),
                    6)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    6,
                    48)))
            .spreadHorizontally()
            .repeat(8); // number of veins per chunk
    private static final ConfiguredFeature<?, ?> ZINC_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.ZINC_ORE.getDefaultState(),
                    5)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    30,
                    70)))
            .spreadHorizontally()
            .repeat(2); // number of veins per chunk
    private static final ConfiguredFeature<?, ?> LEAD_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.LEAD_ORE.getDefaultState(),
                    5)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    12)))
            .spreadHorizontally()
            .repeat(4); // number of veins per chunk

    @Override
    public void onInitialize() {

        ModItems.registerItems();
        ModItems.registerBlockItems();
        ModBlocks.registerBlocks();

        RegistryKey<ConfiguredFeature<?, ?>> oreTinOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("ores_plus", "tin_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinOverworld.getValue(), TIN_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreZincOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("ores_plus", "zinc_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreZincOverworld.getValue(), ZINC_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreZincOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreLeadOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("ores_plus", "lead_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLeadOverworld.getValue(), LEAD_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadOverworld);
    }
}

