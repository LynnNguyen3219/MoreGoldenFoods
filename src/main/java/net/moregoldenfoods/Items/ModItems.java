package net.moregoldenfoods.Items;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.moregoldenfoods.Blocks.ModBlocks;

import java.util.function.Function;

public class ModItems {
    public static final Consumable GOLDEN_FOOD_CONSUMABLE_COMPONENT_1 = Consumables.defaultFood()
            // The duration is in ticks, 20 ticks = 1 second
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1, false, true, true), 1.0f))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0, false, true, true), 1.0f))
            .build();

    public static final Consumable GOLDEN_FOOD_CONSUMABLE_COMPONENT_2 = Consumables.defaultFood()
            // The duration is in ticks, 20 ticks = 1 second
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2, false, true, true), 1.0f))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1, false, true, true), 1.0f))
            .build();

    public static final Item GOLDEN_CHICKEN = register(ModItemIds.GOLDEN_CHICKEN, Item::new, new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.75f)
            .alwaysEdible()
            .build(),
            GOLDEN_FOOD_CONSUMABLE_COMPONENT_1
    ));

    public static final Item GOLDEN_STEAK = register(ModItemIds.GOLDEN_STEAK, Item::new, new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationModifier(0.85f)
                    .alwaysEdible()
                    .build(),
            GOLDEN_FOOD_CONSUMABLE_COMPONENT_2
    ));

    public static final Item GOLDEN_PORKCHOP = register(ModItemIds.GOLDEN_PORKCHOP, Item::new, new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationModifier(0.85f)
                    .alwaysEdible()
                    .build(),
            GOLDEN_FOOD_CONSUMABLE_COMPONENT_2
    ));

    public static final Item GOLDEN_RABBIT = register(ModItemIds.GOLDEN_RABBIT, Item::new, new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationModifier(0.7f)
                    .alwaysEdible()
                    .build(),
            GOLDEN_FOOD_CONSUMABLE_COMPONENT_1
    ));

    public static final Item GOLDEN_MUTTON = register(ModItemIds.GOLDEN_MUTTON, Item::new, new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationModifier(0.7f)
                    .alwaysEdible()
                    .build(),
            GOLDEN_FOOD_CONSUMABLE_COMPONENT_1
    ));

    public static final Item GOLDEN_COOKIE = register(ModItemIds.GOLDEN_COOKIE, Item::new, new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2)
                    .saturationModifier(0.2f)
                    .alwaysEdible()
                    .build(),
            GOLDEN_FOOD_CONSUMABLE_COMPONENT_1
    ));

    public static final Item GOLDEN_PUMPKIN_PIE = register(ModItemIds.GOLDEN_PUMPKIN_PIE, Item::new, new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationModifier(0.45f)
                    .alwaysEdible()
                    .build(),
            GOLDEN_FOOD_CONSUMABLE_COMPONENT_1
    ));

    public static final Item GOLDEN_BREAD = register(ModItemIds.GOLDEN_BREAD, Item::new, new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationModifier(0.7f)
                    .alwaysEdible()
                    .build(),
            GOLDEN_FOOD_CONSUMABLE_COMPONENT_1
    ));

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        // Create the item instance.
        Item item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((creativeTab) -> {
                    creativeTab.accept(ModItems.GOLDEN_CHICKEN);
                    creativeTab.accept(ModItems.GOLDEN_STEAK);
                    creativeTab.accept(ModItems.GOLDEN_PORKCHOP);
                    creativeTab.accept(ModItems.GOLDEN_RABBIT);
                    creativeTab.accept(ModItems.GOLDEN_MUTTON);
                    creativeTab.accept(ModItems.GOLDEN_COOKIE);
                    creativeTab.accept(ModItems.GOLDEN_PUMPKIN_PIE);
                    creativeTab.accept(ModItems.GOLDEN_BREAD);
                    creativeTab.accept(ModBlocks.GOLDEN_CAKE.asItem());
                });
    }}