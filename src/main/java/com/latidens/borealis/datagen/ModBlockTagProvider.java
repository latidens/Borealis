package com.latidens.borealis.datagen;

import com.farcr.nomansland.NoMansLand;
import com.farcr.nomansland.common.registry.NMLTags;
import com.latidens.borealis.Borealis;
import com.latidens.borealis.block.ModBlocks;
import com.latidens.borealis.integration.NoMansLandIntegration;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Borealis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.ASPEN_LOG.get())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get())
                .add(ModBlocks.ASPEN_WOOD.get())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get())
                .add(ModBlocks.ASPEN_PLANKS.get())
                .add(ModBlocks.ASPEN_STAIRS.get())
                .add(ModBlocks.ASPEN_SLAB.get())
                .add(ModBlocks.ASPEN_BUTTON.get())
                .add(ModBlocks.ASPEN_PRESSURE_PLATE.get())
                .add(ModBlocks.ASPEN_DOOR.get())
                .add(ModBlocks.ASPEN_TRAPDOOR.get())
                .add(ModBlocks.ASPEN_FENCE.get())
                .add(ModBlocks.ASPEN_FENCE_GATE.get())
                .add(NoMansLandIntegration.TRIMMED_ASPEN_PLANKS.get())
                .add(NoMansLandIntegration.ASPEN_BOOKSHELF.get())
                .add(ModBlocks.ASPEN_SIGN.get())
                .add(ModBlocks.ASPEN_WALL_SIGN.get())
                .add(ModBlocks.ASPEN_HANGING_SIGN.get())
                .add(ModBlocks.ASPEN_WALL_HANGING_SIGN.get());
        tag(BlockTags.LOGS)
                .add(ModBlocks.ASPEN_LOG.get())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get())
                .add(ModBlocks.ASPEN_WOOD.get())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get());
        tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ASPEN_LOG.get())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get())
                .add(ModBlocks.ASPEN_WOOD.get())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get());
        tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(ModBlocks.ASPEN_LOG.get());
        tag(BlockTags.PLANKS)
                .add(ModBlocks.ASPEN_PLANKS.get())
                .add(NoMansLandIntegration.TRIMMED_ASPEN_PLANKS.get());
        tag(BlockTags.FENCES)
                .add(ModBlocks.ASPEN_FENCE.get());
        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ASPEN_FENCE.get());
        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ASPEN_FENCE_GATE.get());
        tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.ASPEN_BUTTON.get());
        tag(BlockTags.BUTTONS)
                .add(ModBlocks.ASPEN_BUTTON.get());
        tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.ASPEN_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.ASPEN_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.ASPEN_DOOR.get());
        tag(BlockTags.DOORS)
                .add(ModBlocks.ASPEN_DOOR.get());
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.ASPEN_TRAPDOOR.get());
        tag(BlockTags.STAIRS)
                .add(ModBlocks.ASPEN_STAIRS.get());
        tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.ASPEN_STAIRS.get());
        tag(BlockTags.SLABS)
                .add(ModBlocks.ASPEN_SLAB.get());
        tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.ASPEN_SLAB.get());
        tag(BlockTags.TRAPDOORS)
                .add(ModBlocks.ASPEN_TRAPDOOR.get());
        tag(BlockTags.LEAVES)
                .add(ModBlocks.ASPEN_LEAVES.get())
                .add(ModBlocks.GOLDEN_ASPEN_LEAVES.get());
        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.ASPEN_LEAVES.get())
                .add(ModBlocks.GOLDEN_ASPEN_LEAVES.get());
        tag(BlockTags.SAPLINGS)
                .add(ModBlocks.ASPEN_SAPLING.get())
                .add(ModBlocks.GOLDEN_ASPEN_SAPLING.get());
        tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(NoMansLandIntegration.ASPEN_BOOKSHELF.get());
        tag(NMLTags.TRIMMED_PLANKS.blockTag())
                .add(NoMansLandIntegration.TRIMMED_ASPEN_PLANKS.get());
        tag(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.ASPEN_SIGN.get());
        tag(BlockTags.WALL_SIGNS)
                .add(ModBlocks.ASPEN_WALL_SIGN.get());
        tag(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.ASPEN_HANGING_SIGN.get());
        tag(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.ASPEN_WALL_HANGING_SIGN.get());
        tag(BlockTags.ALL_SIGNS)
                .add(ModBlocks.ASPEN_SIGN.get())
                .add(ModBlocks.ASPEN_WALL_SIGN.get());
        tag(BlockTags.ALL_HANGING_SIGNS)
                .add(ModBlocks.ASPEN_HANGING_SIGN.get())
                .add(ModBlocks.ASPEN_WALL_HANGING_SIGN.get());
    }
}
