package net.bart.economy.datagen;

import net.bart.economy.block.ModBlocks;
import net.bart.economy.item.ModItems;
import net.bart.economy.util.ModTags;
import net.minecraft.advancements.Criterion;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> COIN_FRAGMENT = List.of(ModItems.COPPER_NUGGET);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COPPER_INGOT)
                        .pattern("NNN")
                        .pattern("NNN")
                        .pattern("NNN")
                        .define('N', ModItems.COPPER_NUGGET.get())
                        .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                        .save(recipeOutput, "barteconomy:copper_ingot_from_nuggets");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPPER_NUGGET.get(), 9)
                .requires(Items.COPPER_INGOT)
                .unlockedBy("has_copper_nugget", has(ModItems.COPPER_NUGGET))
                .save(recipeOutput, "barteconomy:copper_nugget_from_ingot");



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BANKNOTE.get())
                .pattern("PPP")
                .pattern("PAP")
                .pattern("PPP")
                .define('P', Items.PAPER)
                .define('A', Items.AMETHYST_SHARD)
                .unlockedBy("has_banknote", has(ModItems.BANKNOTE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SMALL_COIN.get(), 1)
                .requires(ModItems.COIN_FRAGMENT.get(), 4)
                .unlockedBy("has_coin_fragment", has(ModItems.COIN_FRAGMENT))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN.get(), 1)
                .requires(ModItems.COIN_FRAGMENT.get(), 8)
                .unlockedBy("has_coin_fragment", has(ModItems.COIN_FRAGMENT))
                .save(recipeOutput);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HALF_ZLOTY.get(), 1)
                .requires(ModItems.SMALL_COIN.get(), 1)
                .requires(Items.COPPER_INGOT, 1)
                .unlockedBy("has_half_zloty", has(ModItems.HALF_ZLOTY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZLOTY.get(), 1)
                .requires(ModItems.COIN.get(), 1)
                .requires(Items.COPPER_INGOT, 1)
                .unlockedBy("has_zloty", has(ModItems.ZLOTY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TWO_ZLOTY.get(), 1)
                .requires(ModItems.COIN.get(), 1)
                .requires(Items.IRON_INGOT, 2)
                .unlockedBy("has_two_zloty", has(ModItems.TWO_ZLOTY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIVE_ZLOTY.get(), 1)
                .requires(ModItems.COIN.get(), 1)
                .requires(Items.GOLD_INGOT, 4)
                .unlockedBy("has_five_zloty", has(ModItems.FIVE_ZLOTY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TEN_ZLOTY.get(), 1)
                .requires(ModItems.BANKNOTE.get(), 1)
                .requires(Items.IRON_INGOT, 4)
                .requires(Items.GOLD_INGOT, 3)
                .requires(Items.DIAMOND, 1)
                .unlockedBy("has_ten_zloty", has(ModItems.TEN_ZLOTY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TWENTY_ZLOTY.get(), 1)
                .requires(ModItems.BANKNOTE.get(), 1)
                .requires(Items.IRON_INGOT, 3)
                .requires(Items.GOLD_INGOT, 3)
                .requires(Items.DIAMOND, 2)
                .unlockedBy("has_twenty_zloty", has(ModItems.TWENTY_ZLOTY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIFTY_ZLOTY.get(), 1)
                .requires(ModItems.BANKNOTE.get(), 1)
                .requires(Items.IRON_INGOT, 2)
                .requires(Items.GOLD_INGOT, 2)
                .requires(Items.DIAMOND, 4)
                .unlockedBy("has_fifty_zloty", has(ModItems.FIFTY_ZLOTY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ONE_HUNDRED_ZLOTY.get(), 1)
                .requires(ModItems.BANKNOTE.get(), 1)
                .requires(Items.DIAMOND, 8)
                .unlockedBy("has_one_hundred_zloty", has(ModItems.ONE_HUNDRED_ZLOTY))
                .save(recipeOutput);

        oreSmelting(recipeOutput, COIN_FRAGMENT, RecipeCategory.MISC, ModItems.COIN_FRAGMENT.get(), 0.25f, 120, "coin_fragment");
        oreBlasting(recipeOutput, COIN_FRAGMENT, RecipeCategory.MISC, ModItems.COIN_FRAGMENT.get(), 0.25f, 60, "coin_fragment");
    }
}
