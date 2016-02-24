package nl.nijenhuis.runecraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nl.nijenhuis.runecraft.help.RecipeRemover;
import nl.nijenhuis.runecraft.help.Reference;
import nl.nijenhuis.runecraft.init.RCBlocks;
import nl.nijenhuis.runecraft.init.RCItems;
import nl.nijenhuis.runecraft.proxy.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)



public class Runecraft {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@Instance(Reference.MODID)
	public static Runecraft instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		RCItems.registerItems();
		RCBlocks.registerBlocks();
		
		
		RecipeRemover.removeRecipes(new ItemStack(Items.wooden_pickaxe), new ItemStack(Items.wooden_pickaxe));
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
