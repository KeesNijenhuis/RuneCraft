package nl.nijenhuis.runecraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import nl.nijenhuis.runecraft.blocks.BlockOre;
import nl.nijenhuis.runecraft.help.RegisterHelper;

public class RCBlocks {

	public static Block mithrilore = new BlockOre(Material.iron).setUnlocalizedName("mithrilore").setCreativeTab(CreativeTabs.tabMisc);
	
	public static void registerBlocks() {
		RegisterHelper.registerBlock(mithrilore);
	}
	
	public static void registerBlockRenderer() {
		RegisterHelper.registerBlockRenderer(mithrilore);
	}

}
