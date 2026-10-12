package com.latidens.borealis.util;

import com.latidens.borealis.Borealis;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class ModTags {
    public static final TagKey<Biome> HAS_GOLDEN_ASPEN = TagKey.create(Registries.BIOME,
            ResourceLocation.fromNamespaceAndPath(Borealis.MOD_ID, "has_golden_aspen"));
}
