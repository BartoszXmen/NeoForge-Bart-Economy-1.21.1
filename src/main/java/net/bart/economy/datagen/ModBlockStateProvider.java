package net.bart.economy.datagen;

import net.bart.economy.EconomyMod;
import net.bart.economy.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EconomyMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ZLOTY_BLOCK);
        blockWithItem(ModBlocks.TWO_ZLOTY_BLOCK);
        simpleBlock(ModBlocks.HALF_ZLOTY_PLACEABLE.get(), models().getExistingFile(modLoc("block/half_zloty_placeable")));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
