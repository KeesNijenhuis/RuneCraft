package nl.nijenhuis.runecraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import nl.nijenhuis.runecraft.help.GuiHandler;
import nl.nijenhuis.runecraft.help.RecipeRemover;
import nl.nijenhuis.runecraft.help.Reference;
import nl.nijenhuis.runecraft.init.RCBlocks;
import nl.nijenhuis.runecraft.init.RCItems;
import nl.nijenhuis.runecraft.proxy.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Runecraft {

	@Instance(Reference.MODID)
	public static Runecraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		RCItems.registerItems();
		RCBlocks.registerBlocks();

		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

		/*
		 * GameRegistry.registerTileEntity(TileEntityRCFurnace.class,
		 * "RCfurnace");
		 */
		RecipeRemover.removeRecipes(new ItemStack(Items.wooden_pickaxe), new ItemStack(Items.wooden_pickaxe));
		RecipeRemover.removeRecipes(new ItemStack(Items.wooden_axe), new ItemStack(Items.wooden_axe));
		RecipeRemover.removeRecipes(new ItemStack(Items.wooden_shovel), new ItemStack(Items.wooden_shovel));
		RecipeRemover.removeRecipes(new ItemStack(Items.wooden_hoe), new ItemStack(Items.wooden_hoe));
		RecipeRemover.removeRecipes(new ItemStack(Items.wooden_sword), new ItemStack(Items.wooden_sword));

		RecipeRemover.removeRecipes(new ItemStack(Items.stone_pickaxe), new ItemStack(Items.stone_pickaxe));
		RecipeRemover.removeRecipes(new ItemStack(Items.stone_axe), new ItemStack(Items.stone_axe));
		RecipeRemover.removeRecipes(new ItemStack(Items.stone_shovel), new ItemStack(Items.stone_shovel));
		RecipeRemover.removeRecipes(new ItemStack(Items.stone_hoe), new ItemStack(Items.stone_hoe));
		RecipeRemover.removeRecipes(new ItemStack(Items.stone_sword), new ItemStack(Items.stone_sword));

		RecipeRemover.removeRecipes(new ItemStack(Items.iron_pickaxe), new ItemStack(Items.iron_pickaxe));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_axe), new ItemStack(Items.iron_axe));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_shovel), new ItemStack(Items.iron_shovel));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_hoe), new ItemStack(Items.iron_hoe));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_sword), new ItemStack(Items.iron_sword));

		RecipeRemover.removeRecipes(new ItemStack(Items.iron_pickaxe), new ItemStack(Items.iron_pickaxe));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_axe), new ItemStack(Items.iron_axe));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_shovel), new ItemStack(Items.iron_shovel));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_hoe), new ItemStack(Items.iron_hoe));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_sword), new ItemStack(Items.iron_sword));

		RecipeRemover.removeRecipes(new ItemStack(Items.iron_pickaxe), new ItemStack(Items.iron_pickaxe));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_axe), new ItemStack(Items.iron_axe));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_shovel), new ItemStack(Items.iron_shovel));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_hoe), new ItemStack(Items.iron_hoe));
		RecipeRemover.removeRecipes(new ItemStack(Items.iron_sword), new ItemStack(Items.iron_sword));

		RecipeRemover.removeRecipes(new ItemStack(Blocks.furnace), new ItemStack(Blocks.furnace));

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenderers();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
