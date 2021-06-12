package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.custom_items.CustomHoeItem;
import com.makubas.OresPlus.registry.materials.Zinc_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Zinc_hoe extends CustomHoeItem {
    public Zinc_hoe() {
        super(Zinc_material.INSTANCE, -1, 0F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
