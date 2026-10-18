package net.moregoldenfoods.Items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class ModItemTooltips extends Item {
    public ModItemTooltips(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        textConsumer.accept(Component.literal("More Golden Foods").withStyle(ChatFormatting.GOLD));
        textConsumer.accept(Component.literal("Made by @lynnnguyen3219").withStyle(ChatFormatting.GOLD));
    }
}

