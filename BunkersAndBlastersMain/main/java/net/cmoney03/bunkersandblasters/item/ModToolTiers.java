package net.cmoney03.bunkersandblasters.item;

import net.cmoney03.bunkersandblasters.BunkersAndBlasters;
import net.cmoney03.bunkersandblasters.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraft.world.item.Tier;

import java.util.List;

public class ModToolTiers {
    public static final Tier SANGUINITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 750, 5f, 3f, 15,
                    ModTags.Blocks.NEEDS_SANGUINITE_TOOL, () -> Ingredient.of(ModItems.SANGUINITE_INGOT.get())),
            new ResourceLocation(BunkersAndBlasters.MOD_ID, "sanguinite"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier VISCOROK = TierSortingRegistry.registerTier(
            new ForgeTier(1, 250, 5f, 2f, 8,
                    ModTags.Blocks.NEEDS_VISCOROK_TOOL, () -> Ingredient.of(ModItems.VISCOROK_INGOT.get())),
            new ResourceLocation(BunkersAndBlasters.MOD_ID, "viscorok"), List.of(Tiers.IRON), List.of());

}
