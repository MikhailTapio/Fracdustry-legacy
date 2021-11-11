package com.teamfractal.fracdustry.common.util;

import com.teamfractal.fracdustry.common.block.init.FDBlockRegistry;
import com.teamfractal.fracdustry.common.creativeTab.init.FDTabRegistry;
import com.teamfractal.fracdustry.common.item.init.FDItemRegistry;
import com.teamfractal.fracdustry.common.recipe.FDRecipeRegistry;
import com.teamfractal.fracdustry.common.world.init.FDWorldGenerationRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        FDTabRegistry.CreativeTabRegistry();
        FDItemRegistry.ItemRegistry();
        FDBlockRegistry.BlockRegistry();
        FDRecipeRegistry.RecipeRegistry();
        FDWorldGenerationRegistry.GenerationRegistry();
    }

    //Proxy, BlockEntity, Entity, GUI, and Packet registration.
    public void init(FMLInitializationEvent event)
    {
    }


    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
