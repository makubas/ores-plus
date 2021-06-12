package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.custom_items.CustomAxeItem;
import com.makubas.OresPlus.registry.materials.Lead_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Lead_axe extends CustomAxeItem {
    public Lead_axe() {
        super(Lead_material.INSTANCE, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
