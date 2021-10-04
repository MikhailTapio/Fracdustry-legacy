package com.teamfractal.fracdustry.common.item.init;

import com.teamfractal.fracdustry.common.item.FDMaterialItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class FDItemRegistry {

    public static Item itemAluminumIngot;
    public static Item itemAluminumPlate;
    public static Item itemBronzeIngot;
    public static Item itemBronzePlate;
    public static Item itemLithiumIngot;
    public static Item itemSteelIngot;
    public static Item itemSteelPlate;
    public static Item itemTinIngot;
    public static Item itemTinPlate;
    public static Item itemTitaniumIngot;
    public static Item itemTitaniumPlate;


    public static void ItemRegistry(){
        itemAluminumIngot = new FDMaterialItems().setUnlocalizedName("AluminumIngot").setTextureName("fracdustry:aluminum_ingot");
        itemAluminumPlate = new FDMaterialItems().setUnlocalizedName("AluminumPlate").setTextureName("fracdustry:aluminum_plate");
        itemBronzeIngot = new FDMaterialItems().setUnlocalizedName("BronzeIngot").setTextureName("fracdustry:bronze_ingot");
        itemBronzePlate = new FDMaterialItems().setUnlocalizedName("BronzePlate").setTextureName("fracdustry:bronze_plate");
        itemLithiumIngot = new FDMaterialItems().setUnlocalizedName("LithiumIngot").setTextureName("fracdustry:lithium_ingot");
        itemSteelIngot = new FDMaterialItems().setUnlocalizedName("SteelIngot").setTextureName("fracdustry:steel_ingot");
        itemSteelPlate = new FDMaterialItems().setUnlocalizedName("SteelPlate").setTextureName("fracdustry:steel_plate");
        itemTinIngot = new FDMaterialItems().setUnlocalizedName("TinIngot").setTextureName("fracdustry:tin_ingot");
        itemTinPlate = new FDMaterialItems().setUnlocalizedName("TinPlate").setTextureName("fracdustry:tin_plate");
        itemTitaniumIngot = new FDMaterialItems().setUnlocalizedName("TitaniumIngot").setTextureName("fracdustry:titanium_ingot");
        itemTitaniumPlate = new FDMaterialItems().setUnlocalizedName("TitaniumPlate").setTextureName("fracdustry:titanium_plate");


        GameRegistry.registerItem( itemAluminumIngot, itemAluminumIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemAluminumPlate, itemAluminumPlate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemBronzeIngot, itemBronzeIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemBronzePlate, itemBronzePlate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemLithiumIngot, itemLithiumIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemSteelIngot, itemSteelIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemSteelPlate, itemSteelPlate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemTinIngot, itemTinIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemTinPlate, itemTinPlate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemTitaniumIngot, itemTitaniumIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem( itemTitaniumPlate, itemTitaniumPlate.getUnlocalizedName().substring(5));

    }
}
