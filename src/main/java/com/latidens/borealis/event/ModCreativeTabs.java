package com.latidens.borealis.event;

import com.latidens.borealis.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class ModCreativeTabs {
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.insertAfter(
                    new ItemStack(Items.BIRCH_LOG),
                    new ItemStack(ModBlocks.ASPEN_LOG.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(Items.BIRCH_LEAVES),
                    new ItemStack(ModBlocks.ASPEN_LEAVES.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_LEAVES),
                    new ItemStack(ModBlocks.GOLDEN_ASPEN_LEAVES.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.insertAfter(
                    new ItemStack(Items.BIRCH_BUTTON),
                    new ItemStack(ModBlocks.ASPEN_LOG.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_LOG),
                    new ItemStack(ModBlocks.ASPEN_WOOD.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_WOOD),
                    new ItemStack(ModBlocks.STRIPPED_ASPEN_LOG.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.STRIPPED_ASPEN_LOG),
                    new ItemStack(ModBlocks.STRIPPED_ASPEN_WOOD.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.STRIPPED_ASPEN_WOOD),
                    new ItemStack(ModBlocks.ASPEN_PLANKS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_PLANKS),
                    new ItemStack(ModBlocks.ASPEN_STAIRS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_STAIRS),
                    new ItemStack(ModBlocks.ASPEN_SLAB.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_SLAB),
                    new ItemStack(ModBlocks.ASPEN_FENCE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_FENCE),
                    new ItemStack(ModBlocks.ASPEN_FENCE_GATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_FENCE_GATE),
                    new ItemStack(ModBlocks.ASPEN_DOOR.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_DOOR),
                    new ItemStack(ModBlocks.ASPEN_TRAPDOOR.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_TRAPDOOR),
                    new ItemStack(ModBlocks.ASPEN_PRESSURE_PLATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(ModBlocks.ASPEN_TRAPDOOR),
                    new ItemStack(ModBlocks.ASPEN_BUTTON.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

        }
    }
}