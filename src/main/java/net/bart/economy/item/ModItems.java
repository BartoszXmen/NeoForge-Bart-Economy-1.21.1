package net.bart.economy.item;

import net.bart.economy.EconomyMod;
import net.bart.economy.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EconomyMod.MOD_ID);

    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HALF_ZLOTY = ITEMS.register("half_zloty",
            () -> new Item(new Item.Properties().stacksTo(99)));
    public static final DeferredItem<Item> ZLOTY = ITEMS.register("zloty",
            () -> new Item(new Item.Properties().stacksTo(99)));
    public static final DeferredItem<Item> TWO_ZLOTY = ITEMS.register("two_zloty",
            () -> new Item(new Item.Properties().stacksTo(99)));
    public static final DeferredItem<Item> FIVE_ZLOTY = ITEMS.register("five_zloty",
            () -> new Item(new Item.Properties().stacksTo(99)));
    public static final DeferredItem<Item> TEN_ZLOTY = ITEMS.register("ten_zloty",
            () -> new Item(new Item.Properties().stacksTo(99)));
    public static final DeferredItem<Item> TWENTY_ZLOTY = ITEMS.register("twenty_zloty",
            () -> new Item(new Item.Properties().stacksTo(99)));
    public static final DeferredItem<Item> FIFTY_ZLOTY = ITEMS.register("fifty_zloty",
            () -> new Item(new Item.Properties().stacksTo(99)));
    public static final DeferredItem<Item> ONE_HUNDRED_ZLOTY = ITEMS.register("one_hundred_zloty",
            () -> new Item(new Item.Properties().stacksTo(99)));
    public static final DeferredItem<Item> COIN_FRAGMENT = ITEMS.register("coin_fragment",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltips.items.coin_fragment"));
                }
            });
    public static final DeferredItem<Item> SMALL_COIN = ITEMS.register("small_coin",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltips.items.small_coin"));
                }
            });
    public static final DeferredItem<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltips.items.coin"));
                }
            });
    public static final DeferredItem<Item> BANKNOTE = ITEMS.register("banknote",
            () -> new Item(new Item.Properties()) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltips.items.banknote"));
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
