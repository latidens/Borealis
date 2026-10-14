package com.latidens.borealis.item;

import com.latidens.borealis.Borealis;
import com.latidens.borealis.block.ModBlocks;
import com.latidens.borealis.util.ModEnumParams;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Properties;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Borealis.MOD_ID);

    public static final DeferredItem<SignItem> ASPEN_SIGN = ITEMS.register("aspen_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.ASPEN_SIGN.get(), ModBlocks.ASPEN_WALL_SIGN.get()));
    public static final DeferredItem<HangingSignItem> ASPEN_HANGING_SIGN = ITEMS.register("aspen_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ASPEN_HANGING_SIGN.get(),
                    ModBlocks.ASPEN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<BoatItem> ASPEN_BOAT = ITEMS.register("aspen_boat",
            () -> new BoatItem(false, ModEnumParams.ASPEN_BOAT_TYPE.getValue(), new Item.Properties().stacksTo(1)));
    public static final DeferredItem<BoatItem> ASPEN_CHEST_BOAT = ITEMS.register("aspen_chest_boat",
            () -> new BoatItem(true, ModEnumParams.ASPEN_BOAT_TYPE.getValue(), new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
