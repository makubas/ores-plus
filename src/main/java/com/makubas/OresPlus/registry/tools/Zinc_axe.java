package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.custom_items.CustomAxeItem;
import com.makubas.OresPlus.registry.materials.Zinc_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Zinc_axe extends CustomAxeItem {
    public Zinc_axe() {
        super(Zinc_material.INSTANCE, 7, -3.1F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
