package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.materials.Zinc_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class Zinc_sword extends SwordItem {
    public Zinc_sword() {
        super(Zinc_material.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
