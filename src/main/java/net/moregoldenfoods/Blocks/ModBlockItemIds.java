package net.moregoldenfoods.Blocks;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.moregoldenfoods.MoreGoldenFoods;

public class ModBlockItemIds {
    public static final BlockItemId GOLDEN_CAKE = create("golden_cake");

    private static BlockItemId create(String name) {
        Identifier id = MoreGoldenFoods.id(name);
        return BlockItemId.create(id, id);
    }
}
