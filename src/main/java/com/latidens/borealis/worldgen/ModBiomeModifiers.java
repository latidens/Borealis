package com.latidens.borealis.worldgen;

import com.latidens.borealis.Borealis;
import com.latidens.borealis.util.ModTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_TREE_GOLDEN_ASPEN = registerKey("add_tree_golden_aspen");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_TREE_GOLDEN_ASPEN, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.HAS_GOLDEN_ASPEN),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GOLDEN_ASPEN_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Borealis.MOD_ID, name));
    }
}
