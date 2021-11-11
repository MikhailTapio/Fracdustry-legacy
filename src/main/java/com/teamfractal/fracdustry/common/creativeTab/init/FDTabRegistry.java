package com.teamfractal.fracdustry.common.creativeTab.init;

import com.teamfractal.fracdustry.common.item.init.FDItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FDTabRegistry {
    public static CreativeTabs tabMaterial;

    public static void CreativeTabRegistry(){
        tabMaterial = new CreativeTabs("tabMaterials") {
            @Override
            public Item getTabIconItem() {
                return FDItemRegistry.itemSteelIngot;
            }
        };
    }
}
