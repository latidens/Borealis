package com.latidens.borealis.datagen;

import com.latidens.borealis.Borealis;
import com.latidens.borealis.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Borealis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        withExistingParent(ModBlocks.ASPEN_SAPLING.getId().getPath(), mcLoc("item/generated"))
                .texture("layer0", modLoc("block/aspen_sapling"));
        withExistingParent(ModBlocks.GOLDEN_ASPEN_SAPLING.getId().getPath(), mcLoc("item/generated"))
                .texture("layer0", modLoc("block/golden_aspen_sapling"));
    }
}
