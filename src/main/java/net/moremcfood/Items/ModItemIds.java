package net.moremcfood.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.moremcfood.MoreMCFood;

public class ModItemIds {
    public static final ResourceKey<Item> GOLDEN_CHICKEN = create("golden_chicken");

    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, MoreMCFood.id(name));
    }
}
