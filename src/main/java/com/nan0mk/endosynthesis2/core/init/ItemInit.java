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
}
