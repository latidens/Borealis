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

        }
    }
}