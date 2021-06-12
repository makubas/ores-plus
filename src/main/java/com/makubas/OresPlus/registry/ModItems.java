package com.makubas.OresPlus.registry;

import com.makubas.OresPlus.OresPlus;
import com.makubas.OresPlus.registry.items.Lead_ingot;
import com.makubas.OresPlus.registry.items.Tin_ingot;
import com.makubas.OresPlus.registry.items.Zinc_ingot;
import com.makubas.OresPlus.registry.tools.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.makubas.OresPlus.registry.ModBlocks.*;


public class ModItems {

    //Items
    public static final Item LEAD_INGOT = new Lead_ingot();
    public static final Item TIN_INGOT = new Tin_ingot();
    public static final Item ZINC_INGOT = new Zinc_ingot();


    //Tools
    public static ToolItem LEAD_PICKAXE = new Lead_pickaxe();
    public static ToolItem LEAD_AXE = new Lead_axe();
    public static ToolItem LEAD_SWORD = new Lead_sword();
    public static ToolItem LEAD_HOE = new Lead_hoe();
    public static ToolItem LEAD_SHOVEL = new Lead_shovel();

    public static ToolItem TIN_PICKAXE = new Tin_pickaxe();
    public static ToolItem TIN_AXE = new Tin_axe();
    public static ToolItem TIN_SWORD = new Tin_sword();
    public static ToolItem TIN_HOE = new Tin_hoe();
    public static ToolItem TIN_SHOVEL = new Tin_shovel();

    public static ToolItem ZINC_PICKAXE = new Zinc_pickaxe();
    public static ToolItem ZINC_AXE = new Zinc_axe();
    public static ToolItem ZINC_SWORD = new Zinc_sword();
    public static ToolItem ZINC_HOE = new Zinc_hoe();
    public static ToolItem ZINC_SHOVEL = new Zinc_shovel();


    public static void registerItems() {
        //Registering Items
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "lead_ingot"), LEAD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "zinc_ingot"), ZINC_INGOT);

        //Registering Tools
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "lead_pickaxe"), LEAD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "lead_axe"), LEAD_AXE);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "lead_sword"), LEAD_SWORD);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "lead_hoe"), LEAD_HOE);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "lead_shovel"), LEAD_SHOVEL);

        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "tin_pickaxe"), TIN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "tin_axe"), TIN_AXE);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "tin_sword"), TIN_SWORD);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "tin_hoe"), TIN_HOE);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "tin_shovel"), TIN_SHOVEL);

        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "zinc_pickaxe"), ZINC_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "zinc_axe"), ZINC_AXE);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "zinc_sword"), ZINC_SWORD);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "zinc_hoe"), ZINC_HOE);
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "zinc_shovel"), ZINC_SHOVEL);



    }

    public static void registerBlockItems() {
        //Registering Items responsible for Blocks
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "lead_block"),
                new BlockItem(LEAD_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "tin_block"),
                new BlockItem(TIN_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "zinc_block"),
                new BlockItem(ZINC_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "lead_ore"),
                new BlockItem(LEAD_ORE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "tin_ore"),
                new BlockItem(TIN_ORE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, "zinc_ore"),
                new BlockItem(ZINC_ORE, new FabricItemSettings().group(ItemGroup.MISC)));


    }

}
