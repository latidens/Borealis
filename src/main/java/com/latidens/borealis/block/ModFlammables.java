package com.latidens.borealis.block;

import com.latidens.borealis.integration.NoMansLandIntegration;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.neoforged.fml.common.Mod;

public class ModFlammables {
    public static void register() {
        FireBlock fire = (FireBlock) Blocks.FIRE;
        fire.setFlammable(ModBlocks.ASPEN_LOG.get(), 5, 5);
        fire.setFlammable(ModBlocks.STRIPPED_ASPEN_LOG.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_WOOD.get(), 5, 5);
        fire.setFlammable(ModBlocks.STRIPPED_ASPEN_WOOD.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_PLANKS.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_STAIRS.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_SLAB.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_FENCE.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_FENCE_GATE.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_PRESSURE_PLATE.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_BUTTON.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_DOOR.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_TRAPDOOR.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_LEAVES.get(), 30, 60);
        fire.setFlammable(ModBlocks.GOLDEN_ASPEN_LEAVES.get(), 30, 60);
        fire.setFlammable(NoMansLandIntegration.TRIMMED_ASPEN_PLANKS.get(), 5, 5);
        fire.setFlammable(NoMansLandIntegration.ASPEN_BOOKSHELF.get(), 5, 5);
    }
}