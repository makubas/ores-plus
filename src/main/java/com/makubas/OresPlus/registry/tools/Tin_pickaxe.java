package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.custom_items.CustomPickaxeItem;
import com.makubas.OresPlus.registry.materials.Tin_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Tin_pickaxe extends CustomPickaxeItem {
    public Tin_pickaxe() {
        super(Tin_material.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
