package com.makubas.OresPlus.registry.materials;

import com.makubas.OresPlus.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Zinc_material implements ToolMaterial {

    @Override
    public int getDurability() {
        return 360;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }

    @Override
    public float getAttackDamage() {
        return 2.0F;
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
        return Ingredient.ofItems(ModItems.ZINC_INGOT);
    }

    public static final Zinc_material INSTANCE = new Zinc_material();
}
