package net.moregoldenfoods;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import net.moregoldenfoods.Blocks.ModBlocks;
import net.moregoldenfoods.Items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreGoldenFoods implements ModInitializer {
    public static final String MOD_ID = "moregoldenfoods";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModBlocks.initialize();
        LOGGER.info("Mod loaded!");
    }
}