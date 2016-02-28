package nl.nijenhuis.runecraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.EnumWorldBlockLayer;
import nl.nijenhuis.runecraft.init.RCBlocks;
import nl.nijenhuis.runecraft.init.RCItems;

public class BlockOre extends Block{

	public BlockOre(Material materialIn) {
		super(materialIn);
		this.setHardness(4f);
		this.setBlockBounds(0, 0, 0, 1, 0.4f, 1);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean isFullCube() {
		return false;
	}

	@Override
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return this == RCBlocks.mithrilore ? RCItems.oremithril : (this == RCBlocks.copperore ? RCItems.orecopper : (this == RCBlocks.tinore ? RCItems.oretin : Item.getItemFromBlock(this)));
	    }
}
