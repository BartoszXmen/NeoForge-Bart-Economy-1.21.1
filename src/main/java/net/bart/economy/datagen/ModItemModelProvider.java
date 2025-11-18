package net.bart.economy.datagen;

import net.bart.economy.EconomyMod;
import net.bart.economy.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EconomyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.HALF_ZLOTY.get());
        basicItem(ModItems.ZLOTY.get());
        basicItem(ModItems.TWO_ZLOTY.get());
        basicItem(ModItems.FIVE_ZLOTY.get());
        basicItem(ModItems.TEN_ZLOTY.get());
        basicItem(ModItems.TWENTY_ZLOTY.get());
        basicItem(ModItems.FIFTY_ZLOTY.get());
        basicItem(ModItems.ONE_HUNDRED_ZLOTY.get());
        basicItem(ModItems.COIN_FRAGMENT.get());
        basicItem(ModItems.SMALL_COIN.get());
        basicItem(ModItems.COIN.get());
        basicItem(ModItems.BANKNOTE.get());
        basicItem(ModItems.COPPER_NUGGET.get());
    }
}
