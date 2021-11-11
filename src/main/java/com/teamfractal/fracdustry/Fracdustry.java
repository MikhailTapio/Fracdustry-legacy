package com.teamfractal.fracdustry;

import com.teamfractal.fracdustry.common.util.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Fracdustry.MODID,name = Fracdustry.MODNAME, version = Fracdustry.VERSION)
public class Fracdustry
{
    public static final String MODID = "fracdustry";
    public static final String MODNAME = "Fracdustry";
    public static final String VERSION = "1.0";
    public static final String COMMON_PROXY = "com.teamfractal.fracdustry.common.util.CommonProxy";
    public static final String CLIENT_PROXY = "com.teamfractal.fracdustry.client.util.ClientProxy";
    
    @Mod.Instance(Fracdustry.MODID)
    public static Fracdustry instance;
    @SidedProxy(clientSide = CLIENT_PROXY,serverSide = COMMON_PROXY)
    public static CommonProxy proxy;
    //Items and blocks' init and registration;
    //Config handling.
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    //Proxy, BlockEntity, Entity, GUI, and Packet registration.
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
