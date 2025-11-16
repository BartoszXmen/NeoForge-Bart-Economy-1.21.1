package net.bart.economy.datagen;

import net.bart.economy.EconomyMod;
import net.bart.economy.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EconomyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ZLOTY_BLOCK.get())
                .add(ModBlocks.TWO_ZLOTY_BLOCK.get())
                .add(ModBlocks.HALF_ZLOTY_PLACEABLE.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ZLOTY_BLOCK.get())
                .add(ModBlocks.TWO_ZLOTY_BLOCK.get());

    }
}
