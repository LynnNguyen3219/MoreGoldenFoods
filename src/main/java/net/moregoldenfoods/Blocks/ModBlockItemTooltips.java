package net.moregoldenfoods.Blocks;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public class ModBlockItemTooltips extends BlockItem {

    public ModBlockItemTooltips(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        textConsumer.accept(Component.literal("More Golden Foods").withStyle(ChatFormatting.GOLD));
        textConsumer.accept(Component.literal("Made by @lynnnguyen3219").withStyle(ChatFormatting.GOLD));
    }
}
