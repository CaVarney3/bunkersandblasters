package net.cmoney03.bunkersandblasters.datagen;

import net.cmoney03.bunkersandblasters.BunkersAndBlasters;
import net.cmoney03.bunkersandblasters.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BunkersAndBlasters.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.VISCOROK_INGOT);
        simpleItem(ModItems.VISCOROK_CHUNK);
        simpleItem(ModItems.PLASTEEL_INGOT);
        simpleItem(ModItems.MOLTEN_PLASTEEL);
        simpleItem(ModItems.RAW_SANGUINITE);
        simpleItem(ModItems.SANGUINITE_INGOT);
        simpleItem(ModItems.METAL_DETECTOR);



        handheldItem(ModItems.SANGUINITE_SWORD);
        handheldItem(ModItems.SANGUINITE_PICKAXE);
        handheldItem(ModItems.SANGUINITE_AXE);
        handheldItem(ModItems.SANGUINITE_SHOVEL);
        handheldItem(ModItems.SANGUINITE_HOE);

        handheldItem(ModItems.VISCOROK_SWORD);
        handheldItem(ModItems.VISCOROK_PICKAXE);
        handheldItem(ModItems.VISCOROK_AXE);
        handheldItem(ModItems.VISCOROK_SHOVEL);
        handheldItem(ModItems.VISCOROK_HOE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(BunkersAndBlasters.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld"))
                .texture("layer0", new ResourceLocation(BunkersAndBlasters.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(BunkersAndBlasters.MOD_ID, "item/" + block.getId().getPath()));
    }
}

