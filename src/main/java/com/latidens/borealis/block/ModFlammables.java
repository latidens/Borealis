package com.latidens.borealis.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

public class ModFlammables {
    public static void register() {
        FireBlock fire = (FireBlock) Blocks.FIRE;
        fire.setFlammable(ModBlocks.ASPEN_LOG.get(), 5, 5);
        fire.setFlammable(ModBlocks.STRIPPED_ASPEN_LOG.get(), 5, 5);
        fire.setFlammable(ModBlocks.ASPEN_WOOD.get(), 5, 5);
        fire.setFlammable(ModBlocks.STRIPPED_ASPEN_WOOD.get(), 5, 5);
    }
}