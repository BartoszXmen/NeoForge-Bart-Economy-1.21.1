package net.bart.economy.datagen;

import net.bart.economy.block.ModBlocks;
import net.bart.economy.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZLOTY_BLOCK.get())
                .pattern("ZZZ")
                .pattern("ZZZ")
                .pattern("ZZZ")
                .define('Z', ModItems.ZLOTY.get())
                .unlockedBy("has_zloty", has(ModItems.ZLOTY)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZLOTY.get(), 9)
                .requires(ModBlocks.ZLOTY_BLOCK)
                .unlockedBy("has_zloty_block", has(ModBlocks.ZLOTY_BLOCK)).save(recipeOutput, "barteconomy:zloty_from_zloty_block");
    }
}
