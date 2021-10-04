package com.teamfractal.fracdustry.common.recipe;

import com.teamfractal.fracdustry.common.block.init.FDBlockRegistry;
import com.teamfractal.fracdustry.common.item.init.FDItemRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class FDRecipeRegistry {
    public static void RecipeRegistry(){
        GameRegistry.addSmelting(FDBlockRegistry.blockBauxiteOre, new ItemStack(FDItemRegistry.itemAluminumIngot), 5.0F);
        GameRegistry.addSmelting(FDBlockRegistry.blockCassiteriteOre, new ItemStack(FDItemRegistry.itemTinIngot), 5.0F);
        GameRegistry.addSmelting(FDBlockRegistry.blockIlmeniteOre, new ItemStack(FDItemRegistry.itemTitaniumIngot), 5.0F);
        GameRegistry.addSmelting(FDBlockRegistry.blockSpodumeneOre, new ItemStack(FDItemRegistry.itemLithiumIngot), 5.0F);
    }
}
