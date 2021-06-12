package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.custom_items.CustomPickaxeItem;
import com.makubas.OresPlus.registry.materials.Zinc_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Zinc_pickaxe extends CustomPickaxeItem {
    public Zinc_pickaxe() {
        super(Zinc_material.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
