package com.latidens.borealis.datagen;

import com.latidens.borealis.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

import java.util.concurrent.CompletableFuture;

public class DatamapProvider extends DataMapProvider {

    protected DatamapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        builder(NeoForgeDataMaps.STRIPPABLES)
                .add(ModBlocks.ASPEN_LOG.getId(), new Strippable(ModBlocks.STRIPPED_ASPEN_LOG.get()), false)
                .add(ModBlocks.ASPEN_WOOD.getId(), new Strippable(ModBlocks.STRIPPED_ASPEN_WOOD.get()), false);
    }
}
