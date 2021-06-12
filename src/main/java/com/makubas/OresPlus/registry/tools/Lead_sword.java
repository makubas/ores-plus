package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.materials.Lead_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class Lead_sword extends SwordItem {
    public Lead_sword() {
        super(Lead_material.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
