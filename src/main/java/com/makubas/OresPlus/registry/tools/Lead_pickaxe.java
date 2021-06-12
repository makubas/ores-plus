package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.custom_items.CustomPickaxeItem;
import com.makubas.OresPlus.registry.materials.Lead_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Lead_pickaxe extends CustomPickaxeItem {
    public Lead_pickaxe() {
        super(Lead_material.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
