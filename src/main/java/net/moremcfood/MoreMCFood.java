package net.moremcfood;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import net.moremcfood.Items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMCFood implements ModInitializer {
    public static final String MOD_ID = "moremcfood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        ModItems.initialize();
        LOGGER.info("Mod loaded!");
    }
}