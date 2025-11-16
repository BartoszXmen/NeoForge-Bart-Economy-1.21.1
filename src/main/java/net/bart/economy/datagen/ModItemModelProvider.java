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
    }
}
