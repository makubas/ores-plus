package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.custom_items.CustomHoeItem;
import com.makubas.OresPlus.registry.materials.Lead_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Lead_hoe extends CustomHoeItem {
    public Lead_hoe() {
        super(Lead_material.INSTANCE, -1, 1F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
