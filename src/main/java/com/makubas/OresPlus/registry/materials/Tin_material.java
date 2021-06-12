package com.makubas.OresPlus.registry.materials;

import com.makubas.OresPlus.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Tin_material implements ToolMaterial {

    @Override
    public int getDurability() {
        return 600;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3.0F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.TIN_INGOT);
    }

    public static final Tin_material INSTANCE = new Tin_material();
}
