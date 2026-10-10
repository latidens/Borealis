package com.latidens.borealis.datagen;

import com.latidens.borealis.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ASPEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_ASPEN_LOG.get());
        dropSelf(ModBlocks.ASPEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_ASPEN_WOOD.get());
        dropSelf(ModBlocks.ASPEN_PLANKS.get());
        dropSelf(ModBlocks.ASPEN_STAIRS.get());
        dropSelf(ModBlocks.ASPEN_FENCE.get());
        dropSelf(ModBlocks.ASPEN_FENCE_GATE.get());
        dropSelf(ModBlocks.ASPEN_TRAPDOOR.get());
        dropSelf(ModBlocks.ASPEN_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ASPEN_BUTTON.get());

        add(ModBlocks.ASPEN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ASPEN_SLAB.get()));

        add(ModBlocks.ASPEN_DOOR.get(),
                block -> createDoorTable(ModBlocks.ASPEN_DOOR.get()));

        add(ModBlocks.ASPEN_LEAVES.get(),
                BlockLootSubProvider::createShearsOnlyDrop);
        add(ModBlocks.GOLDEN_ASPEN_LEAVES.get(),
                BlockLootSubProvider::createShearsOnlyDrop);
    }


    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
