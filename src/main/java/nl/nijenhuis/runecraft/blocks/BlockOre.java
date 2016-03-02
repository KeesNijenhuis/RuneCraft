package nl.nijenhuis.runecraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import nl.nijenhuis.runecraft.init.RCBlocks;
import nl.nijenhuis.runecraft.init.RCItems;
import nl.nijenhuis.runecraft.level.SkillMining;

public class BlockOre extends Block {

	SkillMining mining = new SkillMining("mining");

	public BlockOre(Material materialIn) {
		super(materialIn);
		this.setHardness(4f);
		this.setBlockBounds(0, 0, 0, 1, 0.4f, 1);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockDestroyedByPlayer(worldIn, pos, state);

		if(!mining.hasMaxXp()) {
			if(this == RCBlocks.copperore) {
				mining.setAddedXp(15);
			} else if(this == RCBlocks.tinore) {
				mining.setAddedXp(25);
			} else if(this == RCBlocks.mithrilore) {
				mining.setAddedXp(50000);
			}
		} else {
			mining.setAddedXp(0);
		}
	
		SkillMining.setCurrentLevel(mining.getCurrentLevel());
		SkillMining.setCurrentXp(mining.getAddedXp() + mining.getCurrentXp());
		//System.out.println("EXPERIENCE: " + mining.getCurrentXp());
		
		mining.calcExpNeeded();
		mining.levelUp();
	
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
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT;
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return this == RCBlocks.mithrilore ? RCItems.oremithril
				: (this == RCBlocks.copperore ? RCItems.orecopper
						: (this == RCBlocks.tinore ? RCItems.oretin : Item.getItemFromBlock(this)));
	}

}
