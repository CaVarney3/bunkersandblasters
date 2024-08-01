package net.cmoney03.bunkersandblasters.datagen;

import net.cmoney03.bunkersandblasters.BunkersAndBlasters;
import net.cmoney03.bunkersandblasters.block.ModBlocks;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BunkersAndBlasters.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.VISCOROK_BLOCK);
        blockWithItem(ModBlocks.PLASTEEL_BLOCK);

        blockWithItem(ModBlocks.VISCOROK_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_VISCOROK_ORE);

        blockWithItem(ModBlocks.NETHER_SANGUINITE_ORE);
        blockWithItem(ModBlocks.SANGUINITE_BLOCK);



    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
