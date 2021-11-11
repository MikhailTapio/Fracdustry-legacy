package com.teamfractal.fracdustry.common.world.init;

import com.teamfractal.fracdustry.common.world.generation.OreGeneration;
import cpw.mods.fml.common.registry.GameRegistry;

public class FDWorldGenerationRegistry {
    public static void GenerationRegistry(){
        GameRegistry.registerWorldGenerator(new OreGeneration(),0);
    }
}
