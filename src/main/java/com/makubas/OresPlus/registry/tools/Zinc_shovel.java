package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.materials.Zinc_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class Zinc_shovel extends ShovelItem {
    public Zinc_shovel() {
        super(Zinc_material.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
