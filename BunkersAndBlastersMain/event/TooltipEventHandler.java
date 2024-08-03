package net.cmoney03.bunkersandblasters.event;


import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.cmoney03.bunkersandblasters.BunkersAndBlasters;
import net.cmoney03.bunkersandblasters.item.ModItems;

@Mod.EventBusSubscriber(modid = BunkersAndBlasters.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class TooltipEventHandler {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack itemStack = event.getItemStack();

        if (itemStack.is(ModItems.PLASTEEL_INGOT.get())) {
            event.getToolTip().add(Component.translatable("A Strong, Malleable light blue ingot")
                    .setStyle(Style.EMPTY.withColor(TextColor.parseColor("#33CEFF"))));


        } else if (itemStack.is(ModItems.MOLTEN_PLASTEEL.get())) {
            event.getToolTip().add(Component.translatable("Refined and Smelted Plasteel, turned into a sheet.")
                    .setStyle(Style.EMPTY.withColor(TextColor.parseColor("#33CEFF"))));


        } else if (itemStack.is(ModItems.VISCOROK_CHUNK.get())) {
            event.getToolTip().add(Component.translatable("A Pink Chunk, Tastes salty!")
                    .setStyle(Style.EMPTY.withColor(TextColor.parseColor("#E74EA4"))));


        } else if (itemStack.is(ModItems.VISCOROK_INGOT.get())) {
            event.getToolTip().add(Component.translatable("A Pink, somewhat stretchy, Ingot.")
                    .setStyle(Style.EMPTY.withColor(TextColor.parseColor("#E74EA4"))));


        } else if (itemStack.is(ModItems.RAW_SANGUINITE.get())) {
            event.getToolTip().add(Component.translatable("You feel your hand getting weaker as you hold it.")
                    .setStyle(Style.EMPTY.withColor(TextColor.parseColor("#B91818"))));


        } else if (itemStack.is(ModItems.SANGUINITE_INGOT.get())) {
            event.getToolTip().add(Component.translatable("Refined and shaped into an ingot, imbued with a strange power.")
                    .setStyle(Style.EMPTY.withColor(TextColor.parseColor("#B91818"))));


        }
        // Add more items and their tooltips as needed
    }
}