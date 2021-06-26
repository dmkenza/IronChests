package io.github.cyberanner.ironchests.registry;

import io.github.cyberanner.ironchests.IronChests;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Items
    public static final Item WOOD_COPPER_UPGRADE = new Item(new Item.Settings().group(IronChests.TAB));

    // Block Items
    public static final BlockItem COPPER_CHEST = new BlockItem(ModBlocks.COPPER_CHEST, new Item.Settings().group(IronChests.TAB));
    public static final BlockItem IRON_CHEST = new BlockItem(ModBlocks.IRON_CHEST, new Item.Settings().group(IronChests.TAB));

    public static void registerItems() {
        // Item
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "wood_copper_upgrade"), WOOD_COPPER_UPGRADE);

        // Block Items
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "copper_chest"), COPPER_CHEST);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "iron_chest"), IRON_CHEST);
    }
}