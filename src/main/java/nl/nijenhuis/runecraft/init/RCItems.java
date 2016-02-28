package nl.nijenhuis.runecraft.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import nl.nijenhuis.runecraft.help.RegisterHelper;
import nl.nijenhuis.runecraft.items.ItemRunecraft;
import nl.nijenhuis.runecraft.items.RunecraftPickaxe;

public class RCItems {
	
	public static Item orecopper = new ItemRunecraft().setUnlocalizedName("orecopper");
	public static Item oretin = new ItemRunecraft().setUnlocalizedName("oretin");
	public static Item oreiron = new ItemRunecraft().setUnlocalizedName("oreiron");
	public static Item oresilver = new ItemRunecraft().setUnlocalizedName("oresilver");
	
	public static Item oremithril = new ItemRunecraft().setUnlocalizedName("oremithril");
	public static Item oreadamantite = new ItemRunecraft().setUnlocalizedName("oreadamantite");
	public static Item orerunite = new ItemRunecraft().setUnlocalizedName("orerunite");
	public static Item oregold = new ItemRunecraft().setUnlocalizedName("oregold");
	public static Item orecoal = new ItemRunecraft().setUnlocalizedName("orecoal");
	
	public static Item pickaxebronze = new RunecraftPickaxe(ToolMaterial.EMERALD).setUnlocalizedName("pickaxebronze");
	public static Item pickaxeiron = new RunecraftPickaxe(ToolMaterial.EMERALD).setUnlocalizedName("pickaxeiron");
	public static Item pickaxesteel = new RunecraftPickaxe(ToolMaterial.EMERALD).setUnlocalizedName("pickaxesteel");
	public static Item pickaxemithril = new RunecraftPickaxe(ToolMaterial.EMERALD).setUnlocalizedName("pickaxemithril");
	public static Item pickaxeadamant = new RunecraftPickaxe(ToolMaterial.EMERALD).setUnlocalizedName("pickaxeadamant");
	public static Item pickaxerune = new RunecraftPickaxe(ToolMaterial.EMERALD).setUnlocalizedName("pickaxerune");
	
	
	

	public static void registerItems() {
		RegisterHelper.registerItem(orecopper);
		RegisterHelper.registerItem(oretin);
		RegisterHelper.registerItem(oreiron);
		RegisterHelper.registerItem(oresilver);
		
		RegisterHelper.registerItem(oremithril);
		RegisterHelper.registerItem(oreadamantite);
		RegisterHelper.registerItem(orerunite);
		
		RegisterHelper.registerItem(oregold);
		RegisterHelper.registerItem(orecoal);
		
		RegisterHelper.registerItem(pickaxebronze);
		RegisterHelper.registerItem(pickaxeiron);
		RegisterHelper.registerItem(pickaxesteel);
		RegisterHelper.registerItem(pickaxemithril);
		RegisterHelper.registerItem(pickaxeadamant);
		RegisterHelper.registerItem(pickaxerune);
		
		
	}
	
	public static void registerItemRenderer() {
		RegisterHelper.registerItemRenderer(orecopper);
		RegisterHelper.registerItemRenderer(oretin);
		RegisterHelper.registerItemRenderer(oreiron);
		RegisterHelper.registerItemRenderer(oresilver);
		
		RegisterHelper.registerItemRenderer(oremithril);
		RegisterHelper.registerItemRenderer(oreadamantite);
		RegisterHelper.registerItemRenderer(orerunite);
		
		RegisterHelper.registerItemRenderer(oregold);
		RegisterHelper.registerItemRenderer(orecoal);
		
		RegisterHelper.registerItemRenderer(pickaxebronze);
		RegisterHelper.registerItemRenderer(pickaxeiron);
		RegisterHelper.registerItemRenderer(pickaxesteel);
		RegisterHelper.registerItemRenderer(pickaxemithril);
		RegisterHelper.registerItemRenderer(pickaxeadamant);
		RegisterHelper.registerItemRenderer(pickaxerune);
				

	}
	
}
