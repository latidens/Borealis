package com.latidens.borealis.block;

import com.latidens.borealis.Borealis;
import com.latidens.borealis.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Borealis.MOD_ID);

    public static final DeferredBlock<RotatedPillarBlock> ASPEN_LOG = registerBlock("aspen_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WOOD)
                    .ignitedByLava()
            )
    );

    public static final DeferredBlock<RotatedPillarBlock> ASPEN_WOOD = registerBlock("aspen_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WOOD)
                    .ignitedByLava()
            )
    );

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ASPEN_LOG = registerBlock("stripped_aspen_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WOOD)
                    .ignitedByLava()
            )
    );

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ASPEN_WOOD = registerBlock("stripped_aspen_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WOOD)
                    .ignitedByLava()
            )
    );

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
