package com.teamfractal.fracdustry.common.block.init;

import com.teamfractal.fracdustry.common.creativeTab.init.FDTabRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreBlock extends Block {
    protected OreBlock() {
        super(Material.rock);
        setCreativeTab(FDTabRegistry.tabMaterial);
    }
}
