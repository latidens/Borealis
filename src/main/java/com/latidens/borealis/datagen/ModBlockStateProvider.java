package com.latidens.borealis.datagen;

import com.latidens.borealis.Borealis;
import com.latidens.borealis.block.ModBlocks;
import net.minecraft.client.model.Model;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Borealis.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ResourceLocation planks = blockTexture(ModBlocks.ASPEN_PLANKS.get());
        logBlock(ModBlocks.ASPEN_LOG.get());
        simpleBlockItem(ModBlocks.ASPEN_LOG.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/aspen_log")));
        logBlock(ModBlocks.STRIPPED_ASPEN_LOG.get());
        simpleBlockItem(ModBlocks.STRIPPED_ASPEN_LOG.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/stripped_aspen_log")));
        axisBlock(ModBlocks.ASPEN_WOOD.get(),
                blockTexture(ModBlocks.ASPEN_LOG.get()),
                blockTexture(ModBlocks.ASPEN_LOG.get()));
        simpleBlockItem(ModBlocks.ASPEN_WOOD.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/aspen_wood")));
        axisBlock(ModBlocks.STRIPPED_ASPEN_WOOD.get(),
                blockTexture(ModBlocks.STRIPPED_ASPEN_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ASPEN_LOG.get()));
        simpleBlockItem(ModBlocks.STRIPPED_ASPEN_WOOD.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/stripped_aspen_wood")));
        simpleBlock(ModBlocks.ASPEN_PLANKS.get());
        simpleBlockItem(ModBlocks.ASPEN_PLANKS.get(),
            new ModelFile.UncheckedModelFile(modLoc("block/aspen_planks")));


        stairsBlock(ModBlocks.ASPEN_STAIRS.get(), planks);
        simpleBlockItem(ModBlocks.ASPEN_STAIRS.get(),
            new ModelFile.UncheckedModelFile(modLoc("block/aspen_stairs")));
        slabBlock(ModBlocks.ASPEN_SLAB.get(), planks, planks);
        simpleBlockItem(ModBlocks.ASPEN_SLAB.get(),
            new ModelFile.UncheckedModelFile(modLoc("block/aspen_slab")));
        pressurePlateBlock(ModBlocks.ASPEN_PRESSURE_PLATE.get(), planks);
        simpleBlockItem(ModBlocks.ASPEN_PRESSURE_PLATE.get(),
            new ModelFile.UncheckedModelFile(modLoc("block/aspen_pressure_plate")));
        buttonBlock(ModBlocks.ASPEN_BUTTON.get(), planks);
        simpleBlockItem(ModBlocks.ASPEN_BUTTON.get(),
                models().singleTexture("aspen_button_inventory",
                        mcLoc("block/button_inventory"), "texture", planks));
        fenceBlock(ModBlocks.ASPEN_FENCE.get(), planks);
        simpleBlockItem(ModBlocks.ASPEN_FENCE.get(),
        models().fenceInventory("aspen_fence_inventory", planks));
        fenceGateBlock(ModBlocks.ASPEN_FENCE_GATE.get(), planks);
        simpleBlockItem(ModBlocks.ASPEN_FENCE_GATE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/aspen_fence_gate")));
        doorBlockWithRenderType(ModBlocks.ASPEN_DOOR.get(),
                modLoc("block/aspen_door_bottom"),
                modLoc("block/aspen_door_top"),
        "cutout");
        itemModels().basicItem(ModBlocks.ASPEN_DOOR.asItem());
        trapdoorBlockWithRenderType(ModBlocks.ASPEN_TRAPDOOR.get(),
                modLoc("block/aspen_trapdoor"), true, "cutout");
        simpleBlockItem(ModBlocks.ASPEN_TRAPDOOR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/aspen_trapdoor_bottom")));
        simpleBlockWithItem(ModBlocks.ASPEN_LEAVES.get(),
        models().singleTexture("aspen_leaves", mcLoc("block/leaves"), "all",
                blockTexture(ModBlocks.ASPEN_LEAVES.get())));
        simpleBlockWithItem(ModBlocks.GOLDEN_ASPEN_LEAVES.get(),
                models().singleTexture("golden_aspen_leaves", mcLoc("block/leaves"), "all",
                        blockTexture(ModBlocks.GOLDEN_ASPEN_LEAVES.get())));
    }
}
