package nl.nijenhuis.runecraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nl.nijenhuis.runecraft.blocks.BlockAnvil;
import nl.nijenhuis.runecraft.blocks.BlockFurnace;
import nl.nijenhuis.runecraft.blocks.BlockOre;
import nl.nijenhuis.runecraft.blocks.BlockTree;
import nl.nijenhuis.runecraft.help.RegisterHelper;

public class RCBlocks {

	public static Block mithrilore = new BlockOre(Material.iron).setUnlocalizedName("mithrilore");
	public static Block copperore = new BlockOre(Material.iron).setUnlocalizedName("copperore");
	public static Block tinore = new BlockOre(Material.iron).setUnlocalizedName("tinore");
	
	public static Block anvil = new BlockAnvil(Material.iron).setUnlocalizedName("anvil");
	public static Block furnace = new BlockFurnace(Material.iron).setUnlocalizedName("furnace");
	
	public static Block treenormal = new BlockTree(Material.wood).setUnlocalizedName("treenormal");
	public static Block treeoak = new BlockTree(Material.wood).setUnlocalizedName("treeoak");
	public static Block treewillow = new BlockTree(Material.wood).setUnlocalizedName("treewillow");
	public static Block treemaple = new BlockTree(Material.wood).setUnlocalizedName("treemaple");
	public static Block treemahogany = new BlockTree(Material.wood).setUnlocalizedName("treemahogany");
	public static Block treeyew = new BlockTree(Material.wood).setUnlocalizedName("treeyew");
	
	public static void registerBlocks() {
		RegisterHelper.registerBlock(mithrilore);
		RegisterHelper.registerBlock(copperore);
		RegisterHelper.registerBlock(tinore);
		RegisterHelper.registerBlock(anvil);
		
		RegisterHelper.registerBlock(furnace);
		
		RegisterHelper.registerBlock(treenormal);
		RegisterHelper.registerBlock(treeoak);
		RegisterHelper.registerBlock(treewillow);
		RegisterHelper.registerBlock(treemaple);
		RegisterHelper.registerBlock(treemahogany);
		RegisterHelper.registerBlock(treeyew);
		
		
	}
	
	public static void registerBlockRenderer() {
		RegisterHelper.registerBlockRenderer(mithrilore);
		RegisterHelper.registerBlockRenderer(copperore);
		RegisterHelper.registerBlockRenderer(tinore);
		RegisterHelper.registerBlockRenderer(anvil);
		
		RegisterHelper.registerBlockRenderer(furnace);
		
		RegisterHelper.registerBlockRenderer(treenormal);
		RegisterHelper.registerBlockRenderer(treeoak);
		RegisterHelper.registerBlockRenderer(treewillow);
		RegisterHelper.registerBlockRenderer(treemaple);
		RegisterHelper.registerBlockRenderer(treemahogany);
		RegisterHelper.registerBlockRenderer(treeyew);
				
		
	}

}
