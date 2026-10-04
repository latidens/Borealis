package com.latidens.borealis.datagen;

import com.latidens.borealis.Borealis;
import com.latidens.borealis.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Borealis.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
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
    }
}
