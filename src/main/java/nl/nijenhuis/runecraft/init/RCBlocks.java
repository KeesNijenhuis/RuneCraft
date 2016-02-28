package nl.nijenhuis.runecraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nl.nijenhuis.runecraft.blocks.BlockOre;
import nl.nijenhuis.runecraft.help.RegisterHelper;

public class RCBlocks {

	public static Block mithrilore = new BlockOre(Material.iron).setUnlocalizedName("mithrilore");
	public static Block copperore = new BlockOre(Material.iron).setUnlocalizedName("copperore");
	public static Block tinore = new BlockOre(Material.iron).setUnlocalizedName("tinore");
	
	
	
	public static void registerBlocks() {
		RegisterHelper.registerBlock(mithrilore);
		RegisterHelper.registerBlock(copperore);
		RegisterHelper.registerBlock(tinore);
		
		
	}
	
	public static void registerBlockRenderer() {
		RegisterHelper.registerBlockRenderer(mithrilore);
		RegisterHelper.registerBlockRenderer(copperore);
		RegisterHelper.registerBlockRenderer(tinore);
		
	}

}
