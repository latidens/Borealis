package com.latidens.borealis.block;

import com.latidens.borealis.Borealis;
import com.latidens.borealis.item.ModItems;
import com.latidens.borealis.worldgen.tree.ModTreeGrowers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Borealis.MOD_ID);

    public static final DeferredBlock<RotatedPillarBlock> ASPEN_LOG = registerBlock("aspen_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.COLOR_GRAY)
                    .ignitedByLava()
            )
    );

    public static final DeferredBlock<RotatedPillarBlock> ASPEN_WOOD = registerBlock("aspen_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2f,3f)
                    .sound(SoundType.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.COLOR_GRAY)
                    .ignitedByLava()
            )
    );

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ASPEN_LOG = registerBlock("stripped_aspen_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.COLOR_GRAY)
                    .ignitedByLava()
            )
    );

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ASPEN_WOOD = registerBlock("stripped_aspen_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.COLOR_GRAY)
                    .ignitedByLava()
            )
    );

    public static final DeferredBlock<Block> ASPEN_PLANKS = registerBlock("aspen_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.COLOR_GRAY)
                    .ignitedByLava()
            )
    );

    public static final DeferredBlock<StairBlock> ASPEN_STAIRS = registerBlock("aspen_stairs",
            () -> new StairBlock(ModBlocks.ASPEN_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .strength(2f, 3f)
                            .sound(SoundType.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .mapColor(MapColor.COLOR_GRAY)
                            .ignitedByLava()
            )
    );
    public static final DeferredBlock<SlabBlock> ASPEN_SLAB = registerBlock("aspen_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of()
                            .strength(2f, 3f)
                            .sound(SoundType.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .mapColor(MapColor.COLOR_GRAY)
                            .ignitedByLava()
            )
    );
    public static final DeferredBlock<PressurePlateBlock> ASPEN_PRESSURE_PLATE = registerBlock("aspen_pressure_plate",
            () -> new PressurePlateBlock(
                    BlockSetType.OAK,
                    BlockBehaviour.Properties.of()
                            .strength(0.5f)
                            .sound(SoundType.WOOD)
                            .mapColor(MapColor.COLOR_GRAY)
                            .ignitedByLava()
                            .forceSolidOn()
                            .noCollission()
                            .pushReaction(PushReaction.DESTROY)
                            .instrument(NoteBlockInstrument.BASS)
            )
    );
    public static final DeferredBlock<ButtonBlock> ASPEN_BUTTON = registerBlock("aspen_button",
            () -> new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    BlockBehaviour.Properties.of()
                            .strength(0.5f)
                            .sound(SoundType.WOOD)
                            .mapColor(MapColor.COLOR_GRAY)
                            .noCollission()
                            .pushReaction(PushReaction.DESTROY)
                            .ignitedByLava()
            )
    );
    public static final DeferredBlock<FenceBlock> ASPEN_FENCE = registerBlock("aspen_fence",
            () -> new FenceBlock(
                    BlockBehaviour.Properties.of()
                            .strength(2f, 3f)
                            .sound(SoundType.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .mapColor(MapColor.COLOR_GRAY)
                            .ignitedByLava()
            )
    );
    public static final DeferredBlock<FenceGateBlock> ASPEN_FENCE_GATE = registerBlock("aspen_fence_gate",
            () -> new FenceGateBlock(
                    WoodType.OAK,
                    BlockBehaviour.Properties.of()
                            .strength(2f, 3f)
                            .sound(SoundType.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .mapColor(MapColor.COLOR_GRAY)
                            .ignitedByLava()
                            .forceSolidOn()
            )
    );
    public static final DeferredBlock<DoorBlock> ASPEN_DOOR = registerBlock("aspen_door",
            () -> new  DoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.of()
                            .strength(3f)
                            .sound(SoundType.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .mapColor(MapColor.COLOR_GRAY)
                            .ignitedByLava()
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)
            )
    );
    public static final DeferredBlock<TrapDoorBlock> ASPEN_TRAPDOOR = registerBlock("aspen_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.of()
                            .strength(3f)
                            .sound(SoundType.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .mapColor(MapColor.COLOR_GRAY)
                            .ignitedByLava()
                            .noOcclusion()
                            .isValidSpawn(Blocks::never)
            )
    );
    public static final DeferredBlock<LeavesBlock> ASPEN_LEAVES = registerBlock("aspen_leaves",
            () -> new LeavesBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .strength(0.2f)
                            .randomTicks()
                            .sound(SoundType.GRASS)
                            .noOcclusion()
                            .isValidSpawn((state, level, pos, type) -> false)
                            .isSuffocating((state, level, pos) -> false)
                            .isViewBlocking((state, level, pos) -> false)
                            .isRedstoneConductor((state, level, pos) -> false)
                            .pushReaction(PushReaction.DESTROY)
                            .ignitedByLava()
            ));
    public static final DeferredBlock<LeavesBlock> GOLDEN_ASPEN_LEAVES = registerBlock("golden_aspen_leaves",
            () -> new LeavesBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .strength(0.2f)
                            .randomTicks()
                            .sound(SoundType.GRASS)
                            .noOcclusion()
                            .isValidSpawn((state, level, pos, type) -> false)
                            .isSuffocating((state, level, pos) -> false)
                            .isViewBlocking((state, level, pos) -> false)
                            .isRedstoneConductor((state, level, pos) -> false)
                            .pushReaction(PushReaction.DESTROY)
                            .ignitedByLava()
            ));

    public static final DeferredBlock<SaplingBlock> ASPEN_SAPLING = registerBlock("aspen_sapling",
            () -> new SaplingBlock(ModTreeGrowers.ASPEN, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final DeferredBlock<SaplingBlock> GOLDEN_ASPEN_SAPLING = registerBlock("golden_aspen_sapling",
            () -> new SaplingBlock(ModTreeGrowers.GOLDEN_ASPEN, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
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
