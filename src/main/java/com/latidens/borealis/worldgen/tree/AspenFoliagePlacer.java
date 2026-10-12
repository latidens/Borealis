package com.latidens.borealis.worldgen.tree;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import org.jetbrains.annotations.NotNull;

public class AspenFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<AspenFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(aspenFoliagePlacerInstance ->
            foliagePlacerParts(aspenFoliagePlacerInstance).apply(aspenFoliagePlacerInstance, AspenFoliagePlacer::new));

    public AspenFoliagePlacer(IntProvider radius, IntProvider offset) {
        super(radius, offset);
    }

    @Override
    protected @NotNull FoliagePlacerType<?> type() {
        return ModFoliagePlacers.ASPEN_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(@NotNull LevelSimulatedReader level, @NotNull FoliageSetter setter, @NotNull RandomSource random,
                                 @NotNull TreeConfiguration config, int maxFreeTreeHeight, @NotNull FoliageAttachment attachment,
                                 int foliageHeight, int foliageRadius, int offset) {
        BlockPos origin = attachment.pos();

        for (int y = 0; y <= 2; y++) {
            place(level, setter, random, config, origin.above(y));
        }
        cross(level, setter, random, config, origin.above(0));

        ring(level, setter, random, config, origin.below(1));

        cross(level, setter, random, config, origin.below(2));
        cross(level, setter, random, config, origin.below(3));

        ring(level, setter, random, config, origin.below(4));

        cross(level, setter, random, config, origin.below(5));
    }

    private static void place(LevelSimulatedReader level, FoliageSetter setter, RandomSource random,
                              TreeConfiguration config, BlockPos pos) {
        tryPlaceLeaf(level, setter, random, config, pos);
    }

    private static void cross(LevelSimulatedReader level, FoliageSetter setter, RandomSource random,
                              TreeConfiguration config, BlockPos center) {
        place(level, setter, random, config, center.north());
        place(level, setter, random, config, center.south());
        place(level, setter, random, config, center.east());
        place(level, setter, random, config, center.west());
    }

    private static void ring(LevelSimulatedReader level, FoliageSetter setter, RandomSource random,
                             TreeConfiguration config, BlockPos center) {
        cross(level, setter, random, config, center);
        place(level, setter, random, config, center.north().east());
        place(level, setter, random, config, center.south().west());
        place(level, setter, random, config, center.north().west());
        place(level, setter, random, config, center.south().east());
    }

    @Override
    public int foliageHeight(@NotNull RandomSource random, int trunkHeight, @NotNull TreeConfiguration config) {
        return 8;
    }

    @Override
    protected boolean shouldSkipLocation(@NotNull RandomSource random, int localX, int localY, int localZ,
                                         int range, boolean large) {
        return false;
    }
}
