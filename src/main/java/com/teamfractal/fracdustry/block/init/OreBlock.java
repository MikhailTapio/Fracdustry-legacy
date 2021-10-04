package com.teamfractal.fracdustry.block.init;

import com.teamfractal.fracdustry.Fracdustry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreBlock extends Block {
    protected OreBlock() {
        super(Material.rock);
        setCreativeTab(Fracdustry.fdmaterials);
    }
}
