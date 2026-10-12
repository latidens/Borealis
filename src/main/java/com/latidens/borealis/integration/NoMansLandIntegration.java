package com.latidens.borealis.integration;

import com.latidens.borealis.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import com.farcr.nomansland.common.block.TrimmedPlankBlock;

import static com.latidens.borealis.block.ModBlocks.registerBlock;

public class NoMansLandIntegration {
    public static final DeferredBlock<TrimmedPlankBlock> TRIMMED_ASPEN_PLANKS = registerBlock("trimmed_aspen_planks",
            () -> new TrimmedPlankBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.ASPEN_PLANKS.get())
            )
    );
    public static final DeferredBlock<Block> ASPEN_BOOKSHELF = registerBlock("aspen_bookshelf",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF)
            )
    );

    public static void init() {

    }
}
