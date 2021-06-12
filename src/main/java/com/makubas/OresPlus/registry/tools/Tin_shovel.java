package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.materials.Tin_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class Tin_shovel extends ShovelItem {
    public Tin_shovel() {
        super(Tin_material.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
