package net.bart.economy.item;

import net.bart.economy.EconomyMod;
import net.bart.economy.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EconomyMod.MOD_ID);

    public static final DeferredItem<Item> HALF_ZLOTY = ITEMS.register("half_zloty",
            () -> new BlockItem(ModBlocks.HALF_ZLOTY_PLACEABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZLOTY = ITEMS.register("zloty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TWO_ZLOTY = ITEMS.register("two_zloty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIVE_ZLOTY = ITEMS.register("five_zloty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TEN_ZLOTY = ITEMS.register("ten_zloty",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
