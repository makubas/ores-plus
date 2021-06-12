package com.makubas.OresPlus.registry.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Tin_block extends Block {
    public Tin_block() {
        super((FabricBlockSettings.
                of(Material.METAL)
                .breakByTool(FabricToolTags.PICKAXES, 1)
                .requiresTool()
                .strength(4F, 30)));
    }
}
