package com.teamfractal.fracdustry.block.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class FDBlockRegistry {

    public static Block blockBauxiteOre;
    public static Block blockCassiteriteOre;
    public static Block blockIlmeniteOre;
    public static Block blockSpodumeneOre;

    public static void BlockRegistry(){
        blockBauxiteOre = new OreBlock().setBlockName("BauxiteOre").setBlockTextureName("fracdustry:bauxite_ore");
        blockCassiteriteOre = new OreBlock().setBlockName("CassiteriteOre").setBlockTextureName("fracdustry:cassiterite_ore");
        blockIlmeniteOre = new OreBlock().setBlockName("IlmeniteOre").setBlockTextureName("fracdustry:ilmenite_ore");
        blockSpodumeneOre = new OreBlock().setBlockName("SpodumeneOre").setBlockTextureName("fracdustry:spodumene_ore");

        GameRegistry.registerBlock(blockBauxiteOre, blockBauxiteOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockCassiteriteOre, blockCassiteriteOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockIlmeniteOre, blockIlmeniteOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockSpodumeneOre, blockSpodumeneOre.getUnlocalizedName().substring(5));
    }
}
