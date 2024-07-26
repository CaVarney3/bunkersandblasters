package net.cmoney03.bunkersandblasters.item;

import net.cmoney03.bunkersandblasters.BunkersAndBlasters;
import net.cmoney03.bunkersandblasters.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BunkersAndBlasters.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BUNKERSANDBLASTERS_TAB = CREATIVE_MODE_TABS.register("bunkersandblasters_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PLASTEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.bunkersandblasters_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.MOLTEN_PLASTEEL.get());
                        pOutput.accept(ModItems.PLASTEEL_INGOT.get());
                        pOutput.accept(ModBlocks.PLASTEEL_BLOCK.get());
                        pOutput.accept(ModItems.VISCOROK_SHARD.get());
                        pOutput.accept(ModItems.VISCOROK_INGOT.get());
                        pOutput.accept(ModBlocks.VISCOROK_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_VISCOROK_ORE.get());
                        pOutput.accept(ModBlocks.VISCOROK_BLOCK.get());
                        pOutput.accept(ModItems.BRACHITE_INGOT.get());
                        pOutput.accept(ModBlocks.BRACHITE_ORE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());








                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
