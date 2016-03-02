package nl.nijenhuis.runecraft.init;

import net.minecraft.item.Item;
import nl.nijenhuis.runecraft.help.RegisterHelper;
import nl.nijenhuis.runecraft.help.RunecraftArmory;
import nl.nijenhuis.runecraft.items.ItemHammer;
import nl.nijenhuis.runecraft.items.ItemRunecraft;
import nl.nijenhuis.runecraft.items.ItemSkillChecker;
import nl.nijenhuis.runecraft.items.RunecraftAxe;
import nl.nijenhuis.runecraft.items.RunecraftPickaxe;

public class RCItems {
	
	//ORES
	public static Item orecopper = new ItemRunecraft().setUnlocalizedName("orecopper");
	public static Item oretin = new ItemRunecraft().setUnlocalizedName("oretin");
	public static Item oreiron = new ItemRunecraft().setUnlocalizedName("oreiron");
	public static Item oresilver = new ItemRunecraft().setUnlocalizedName("oresilver");
	public static Item oremithril = new ItemRunecraft().setUnlocalizedName("oremithril");
	public static Item oreadamantite = new ItemRunecraft().setUnlocalizedName("oreadamantite");
	public static Item orerunite = new ItemRunecraft().setUnlocalizedName("orerunite");
	public static Item oregold = new ItemRunecraft().setUnlocalizedName("oregold");
	public static Item orecoal = new ItemRunecraft().setUnlocalizedName("orecoal");
	
	//		TOOLS
	//PICKAXES
	public static Item pickaxebronze = new RunecraftPickaxe(RunecraftArmory.BRONZE).setUnlocalizedName("pickaxebronze");
	public static Item pickaxeiron = new RunecraftPickaxe(RunecraftArmory.IRON).setUnlocalizedName("pickaxeiron");
	public static Item pickaxesteel = new RunecraftPickaxe(RunecraftArmory.STEEL).setUnlocalizedName("pickaxesteel");
	public static Item pickaxemithril = new RunecraftPickaxe(RunecraftArmory.MITHRIL).setUnlocalizedName("pickaxemithril");
	public static Item pickaxeadamant = new RunecraftPickaxe(RunecraftArmory.ADAMANT).setUnlocalizedName("pickaxeadamant");
	public static Item pickaxerune = new RunecraftPickaxe(RunecraftArmory.RUNE).setUnlocalizedName("pickaxerune");
	
	//AXES
	public static Item axebronze = new RunecraftAxe(RunecraftArmory.BRONZE).setUnlocalizedName("axebronze");
	public static Item axeiron = new RunecraftAxe(RunecraftArmory.IRON).setUnlocalizedName("axeiron");
	public static Item axesteel = new RunecraftAxe(RunecraftArmory.STEEL).setUnlocalizedName("axesteel");
	public static Item axemithril = new RunecraftAxe(RunecraftArmory.MITHRIL).setUnlocalizedName("axemithril");
	public static Item axeadamant = new RunecraftAxe(RunecraftArmory.ADAMANT).setUnlocalizedName("axeadamant");
	public static Item axerune = new RunecraftAxe(RunecraftArmory.RUNE).setUnlocalizedName("axerune");
	
	//BARS
	public static Item barbronze = new ItemRunecraft().setUnlocalizedName("barbronze");
	public static Item bariron = new ItemRunecraft().setUnlocalizedName("bariron");
	public static Item barsteel = new ItemRunecraft().setUnlocalizedName("barsteel");
	public static Item barmithril = new ItemRunecraft().setUnlocalizedName("barmithril");
	public static Item baradamantite = new ItemRunecraft().setUnlocalizedName("baradamantite");
	public static Item barrunite = new ItemRunecraft().setUnlocalizedName("barrunite");
	
	
	//Skill Checker
	public static Item skillchecker = new ItemSkillChecker().setUnlocalizedName("skillchecker");
	
	//Hammer
	public static Item itemhammer = new ItemHammer().setUnlocalizedName("itemhammer");
	

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
		
		RegisterHelper.registerItem(axebronze);
		RegisterHelper.registerItem(axeiron);
		RegisterHelper.registerItem(axesteel);
		RegisterHelper.registerItem(axemithril);
		RegisterHelper.registerItem(axeadamant);
		RegisterHelper.registerItem(axerune);
		
		RegisterHelper.registerItem(barbronze);
		RegisterHelper.registerItem(bariron);
		RegisterHelper.registerItem(barsteel);
		RegisterHelper.registerItem(barmithril);
		RegisterHelper.registerItem(baradamantite);
		RegisterHelper.registerItem(barrunite);
		
		
		RegisterHelper.registerItem(skillchecker);
		
		RegisterHelper.registerItem(itemhammer);
		
		
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
		
		RegisterHelper.registerItemRenderer(axebronze);
		RegisterHelper.registerItemRenderer(axeiron);
		RegisterHelper.registerItemRenderer(axesteel);
		RegisterHelper.registerItemRenderer(axemithril);
		RegisterHelper.registerItemRenderer(axeadamant);
		RegisterHelper.registerItemRenderer(axerune);
		
		RegisterHelper.registerItemRenderer(barbronze);
		RegisterHelper.registerItemRenderer(bariron);
		RegisterHelper.registerItemRenderer(barsteel);
		RegisterHelper.registerItemRenderer(barmithril);
		RegisterHelper.registerItemRenderer(baradamantite);
		RegisterHelper.registerItemRenderer(barrunite);
		
		
		RegisterHelper.registerItemRenderer(skillchecker);
		
		RegisterHelper.registerItemRenderer(itemhammer);
				

	}
	
}
