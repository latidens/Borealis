package com.latidens.borealis.block;

import com.latidens.borealis.Borealis;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType ASPEN = WoodType.register(
            new WoodType(Borealis.MOD_ID + ":aspen", BlockSetType.OAK));
}
