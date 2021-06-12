package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.custom_items.CustomAxeItem;
import com.makubas.OresPlus.registry.materials.Tin_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Tin_axe extends CustomAxeItem {
    public Tin_axe() {
        super(Tin_material.INSTANCE, 7, -3.1F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
