package com.nan0mk.endosynthesis2.core.init;

import com.nan0mk.endosynthesis2.EndoSynthesis2;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.lang.reflect.Array;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EndoSynthesis2.MODID);

    //The items here
    //Detolite
    public static final DeferredItem<Item> DETOLITE = ITEMS.register("detolite", () -> new Item(
            new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant()
    ));
    //Detolite Dust
    public static final DeferredItem<Item> DETOLITE_DUST = ITEMS.register("detolite_dust", () -> new Item(
            new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant()
    ));
    //Refined Detolite (Ingot)
    public static final DeferredItem<Item> DETOLITE_REFINED = ITEMS.register("detolite_refined", () -> new Item(
            new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .fireResistant()
    ));

    //Adonite Dust
    public static final DeferredItem<Item> ADONITE_DUST = ITEMS.register("adonite_dust", () -> new Item(
            new Item.Properties()
                    .rarity(Rarity.RARE)
                    .fireResistant()
    ));
    //Refined Adonite
    public static final DeferredItem<Item> ADONITE_REFINED = ITEMS.register("adonite_refined", () -> new Item(
            new Item.Properties()
                    .rarity(Rarity.RARE)
                    .fireResistant()
    ));
}
