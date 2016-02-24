package nl.nijenhuis.runecraft.init;

import net.minecraft.item.Item;
import nl.nijenhuis.runecraft.help.RegisterHelper;
import nl.nijenhuis.runecraft.items.ItemRunecraft;

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
		

	}
	
}
