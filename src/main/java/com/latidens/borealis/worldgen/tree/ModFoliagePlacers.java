package com.latidens.borealis.worldgen.tree;

import com.latidens.borealis.Borealis;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFoliagePlacers {

    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, Borealis.MOD_ID);

    public static final DeferredHolder<FoliagePlacerType<?>, FoliagePlacerType<AspenFoliagePlacer>> ASPEN_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("aspen_foliage_placer",
                    () -> new FoliagePlacerType<>(AspenFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
