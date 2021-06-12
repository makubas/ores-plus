package com.makubas.OresPlus.registry.tools;

import com.makubas.OresPlus.registry.materials.Tin_material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class Tin_sword extends SwordItem {
    public Tin_sword() {
        super(Tin_material.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
