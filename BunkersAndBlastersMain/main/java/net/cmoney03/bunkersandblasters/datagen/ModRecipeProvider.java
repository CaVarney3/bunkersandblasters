package net.cmoney03.bunkersandblasters.datagen;

import net.cmoney03.bunkersandblasters.BunkersAndBlasters;
import net.cmoney03.bunkersandblasters.block.ModBlocks;
import net.cmoney03.bunkersandblasters.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> VISCOROK_SMELTABLES = List.of(
            ModItems.VISCOROK_SHARD.get(),
            ModBlocks.VISCOROK_ORE.get(),
            ModBlocks.DEEPSLATE_VISCOROK_ORE.get()
    );
    private static final List<ItemLike> SANGUINITE_SMELTABLES = List.of(
            ModItems.RAW_SANGUINITE.get(),
            ModBlocks.NETHER_SANGUINITE_ORE.get()
    );


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, VISCOROK_SMELTABLES, RecipeCategory.MISC, ModItems.VISCOROK_INGOT.get(), 0.25f, 200, "viscorok");
        oreBlasting(pWriter, VISCOROK_SMELTABLES, RecipeCategory.MISC, ModItems.VISCOROK_INGOT.get(), 0.25f, 100, "viscorok");
        oreSmelting(pWriter, SANGUINITE_SMELTABLES, RecipeCategory.MISC, ModItems.SANGUINITE_INGOT.get(), 0.25f, 200, "sanguinite");
        oreBlasting(pWriter, SANGUINITE_SMELTABLES, RecipeCategory.MISC, ModItems.SANGUINITE_INGOT.get(), 0.25f, 100, "sanguinite");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VISCOROK_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.VISCOROK_INGOT.get())
                .unlockedBy(getHasName(ModItems.VISCOROK_INGOT.get()), has(ModItems.VISCOROK_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SANGUINITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SANGUINITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SANGUINITE_INGOT.get()), has(ModItems.SANGUINITE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VISCOROK_INGOT.get(), 9)
                .requires(ModBlocks.VISCOROK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.VISCOROK_BLOCK.get()), has(ModBlocks.VISCOROK_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SANGUINITE_INGOT.get(), 9)
                .requires(ModBlocks.SANGUINITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SANGUINITE_BLOCK.get()), has(ModBlocks.SANGUINITE_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  BunkersAndBlasters.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
