package net.moregoldenfoods.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.moregoldenfoods.MoreGoldenFoods;

public class ModItemIds {
    public static final ResourceKey<Item> GOLDEN_CHICKEN = create("golden_chicken");
    public static final ResourceKey<Item> GOLDEN_STEAK = create("golden_steak");
    public static final ResourceKey<Item> GOLDEN_PORKCHOP = create("golden_porkchop");
    public static final ResourceKey<Item> GOLDEN_RABBIT = create("golden_rabbit");
    public static final ResourceKey<Item> GOLDEN_MUTTON = create("golden_mutton");
    public static final ResourceKey<Item> GOLDEN_COOKIE = create("golden_cookie");
    public static final ResourceKey<Item> GOLDEN_PUMPKIN_PIE = create("golden_pumpkin_pie");
    public static final ResourceKey<Item> GOLDEN_BREAD = create("golden_bread");

    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, MoreGoldenFoods.id(name));
    }
}
