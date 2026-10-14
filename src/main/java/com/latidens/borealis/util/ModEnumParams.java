package com.latidens.borealis.util;

import com.latidens.borealis.Borealis;
import com.latidens.borealis.block.ModBlocks;
import com.latidens.borealis.item.ModItems;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Items;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;

public class ModEnumParams {

    public static final EnumProxy<Boat.Type> ASPEN_BOAT_TYPE = new EnumProxy<>(
            Boat.Type.class, ModBlocks.ASPEN_PLANKS, Borealis.MOD_ID + ":aspen", ModItems.ASPEN_BOAT, ModItems.ASPEN_CHEST_BOAT, Items.STICK, false
    );

}
