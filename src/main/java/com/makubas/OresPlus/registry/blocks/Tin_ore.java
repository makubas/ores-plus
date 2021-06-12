package com.makubas.OresPlus.registry.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;

public class Tin_ore extends OreBlock {
    public Tin_ore() {
        super(FabricBlockSettings
                .of(Material.METAL)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .strength(4F, 30));

    }
}
