package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.materials.Lead_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;

public class Lead_shovel extends ShovelItem {
    public Lead_shovel() {
        super(Lead_material.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
