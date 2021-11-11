package com.teamfractal.fracdustry.common.item;

import com.teamfractal.fracdustry.common.creativeTab.init.FDTabRegistry;
import net.minecraft.item.Item;

public class FDMaterialItems extends Item {
    public FDMaterialItems(){
        setCreativeTab(FDTabRegistry.tabMaterial);
    }
}
