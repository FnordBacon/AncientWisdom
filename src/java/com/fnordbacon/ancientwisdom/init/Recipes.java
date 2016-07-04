package com.fnordbacon.ancientwisdom.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.carvingRod), "  d", " r ", "r  ", 'd', "gemDiamond", 'r', "stone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chiselSpade), " dd", " rd", "r  ", 'd', "gemDiamond", 'r', "stone"));
    }
}
