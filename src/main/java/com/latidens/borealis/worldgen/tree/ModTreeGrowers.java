package com.latidens.borealis.worldgen.tree;

import com.latidens.borealis.Borealis;
import com.latidens.borealis.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {

    public static final TreeGrower ASPEN = new TreeGrower(Borealis.MOD_ID + ":aspen",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ASPEN_KEY), Optional.empty());

    public static final TreeGrower GOLDEN_ASPEN = new TreeGrower(Borealis.MOD_ID + ":golden_aspen",
            Optional.empty(), Optional.of(ModConfiguredFeatures.GOLDEN_ASPEN_KEY), Optional.empty());
}
