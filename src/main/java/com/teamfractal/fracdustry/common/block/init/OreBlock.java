package com.teamfractal.fracdustry.common.block.init;

import com.teamfractal.fracdustry.Fracdustry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreBlock extends Block {
    protected OreBlock() {
        super(Material.rock);
        setCreativeTab(Fracdustry.fdmaterials);
    }
}
