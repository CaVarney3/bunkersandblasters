package net.cmoney03.bunkersandblasters.item;

import net.cmoney03.bunkersandblasters.BunkersAndBlasters;
import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> RAW_SANGUINITE = ITEMS.register("raw_sanguinite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SANGUINITE_INGOT = ITEMS.register("sanguinite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SANGUINITE_SWORD = ITEMS.register("sanguinite_sword",
            () -> new SwordItem(ModToolTiers.SANGUINITE,4,-2, new Item.Properties()));
    public static final RegistryObject<Item> SANGUINITE_AXE = ITEMS.register("sanguinite_axe",
            () -> new AxeItem(ModToolTiers.SANGUINITE,5,-3, new Item.Properties()));
    public static final RegistryObject<Item> SANGUINITE_PICKAXE = ITEMS.register("sanguinite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SANGUINITE,1,2, new Item.Properties()));
    public static final RegistryObject<Item> SANGUINITE_SHOVEL = ITEMS.register("sanguinite_shovel",
            () -> new ShovelItem(ModToolTiers.SANGUINITE,1,2, new Item.Properties()));
    public static final RegistryObject<Item> SANGUINITE_HOE = ITEMS.register("sanguinite_hoe",
            () -> new HoeItem(ModToolTiers.SANGUINITE,2,2, new Item.Properties()));

    public static final RegistryObject<Item> VISCOROK_SWORD = ITEMS.register("viscorok_sword",
            () -> new SwordItem(ModToolTiers.VISCOROK,2,-2, new Item.Properties()));
    public static final RegistryObject<Item> VISCOROK_AXE = ITEMS.register("viscorok_axe",
            () -> new AxeItem(ModToolTiers.VISCOROK,3,-3, new Item.Properties()));
    public static final RegistryObject<Item> VISCOROK_PICKAXE = ITEMS.register("viscorok_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VISCOROK,1,2, new Item.Properties()));
    public static final RegistryObject<Item> VISCOROK_SHOVEL = ITEMS.register("viscorok_shovel",
            () -> new ShovelItem(ModToolTiers.VISCOROK,1,2, new Item.Properties()));
    public static final RegistryObject<Item> VISCOROK_HOE = ITEMS.register("viscorok_hoe",
            () -> new HoeItem(ModToolTiers.VISCOROK,2,2, new Item.Properties()));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
