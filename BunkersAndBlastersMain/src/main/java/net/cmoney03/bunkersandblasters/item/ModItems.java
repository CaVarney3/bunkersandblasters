package net.cmoney03.bunkersandblasters.item;

import net.cmoney03.bunkersandblasters.BunkersAndBlasters;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BunkersAndBlasters.MOD_ID);

    public static final RegistryObject<Item> PLASTEEL_INGOT = ITEMS.register("plasteel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_PLASTEEL = ITEMS.register("molten_plasteel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VISCOROK_SHARD = ITEMS.register("viscorok_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VISCOROK_INGOT = ITEMS.register("viscorok_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRACHITE_INGOT = ITEMS.register("brachite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
