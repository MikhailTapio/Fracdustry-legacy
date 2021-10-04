package com.teamfractal.fracdustry;

import com.teamfractal.fracdustry.block.init.FDBlockRegistry;
import com.teamfractal.fracdustry.item.init.FDItemRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = Fracdustry.MODID,name = Fracdustry.MODNAME, version = Fracdustry.VERSION)
public class Fracdustry
{
    public static final String MODID = "fracdustry";
    public static final String MODNAME = "Fracdustry";
    public static final String VERSION = "1.0";

    //Items and blocks' init and registration;
    //Config handling.
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        FDItemRegistry.ItemRegistry();
        FDBlockRegistry.BlockRegistry();
    }

    //Proxy, BlockEntity, Entity, GUI, and Packet registration.
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }

    public static CreativeTabs fdmaterials = new CreativeTabs("tabMaterials") {
        @Override
        public Item getTabIconItem() {
            return FDItemRegistry.itemSteelIngot;
        }
    };
}
