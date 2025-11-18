package net.bart.economy.item;

import net.bart.economy.EconomyMod;
import net.bart.economy.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EconomyMod.MOD_ID);

    public static final Supplier<CreativeModeTab> BART_ECONOMY_TAB = CREATIVE_MODE_TAB.register("bart_economy_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ZLOTY.get()))
                    .title(Component.translatable("creativetab.barteconomy.tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                      output.accept(ModItems.HALF_ZLOTY);
                      output.accept(ModItems.ZLOTY);
                      output.accept(ModItems.TWO_ZLOTY);
                      output.accept(ModItems.FIVE_ZLOTY);
                      output.accept(ModItems.TEN_ZLOTY);
                      output.accept(ModItems.TWENTY_ZLOTY);
                      output.accept(ModItems.FIFTY_ZLOTY);
                      output.accept(ModItems.ONE_HUNDRED_ZLOTY);
                      output.accept(ModItems.COPPER_NUGGET);
                      output.accept(ModItems.COIN_FRAGMENT);
                      output.accept(ModItems.SMALL_COIN);
                      output.accept(ModItems.COIN);
                      output.accept(ModItems.BANKNOTE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
