package com.makubas.OresPlus.registry;

import com.makubas.OresPlus.OresPlus;
import com.makubas.OresPlus.registry.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block LEAD_BLOCK = new Lead_block();
    public static final Block TIN_BLOCK = new Tin_block();
    public static final Block ZINC_BLOCK = new Zinc_block();

    public static final Block LEAD_ORE = new Lead_ore();
    public static final Block TIN_ORE = new Tin_ore();
    public static final Block ZINC_ORE = new Zinc_ore();


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(OresPlus.MOD_ID, "lead_block"), LEAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OresPlus.MOD_ID, "tin_block"), TIN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OresPlus.MOD_ID, "zinc_block"), ZINC_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(OresPlus.MOD_ID, "lead_ore"), LEAD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(OresPlus.MOD_ID, "tin_ore"), TIN_ORE);
        Registry.register(Registry.BLOCK, new Identifier(OresPlus.MOD_ID, "zinc_ore"), ZINC_ORE);


    }



}
