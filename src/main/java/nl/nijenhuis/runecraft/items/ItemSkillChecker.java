package nl.nijenhuis.runecraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nl.nijenhuis.runecraft.Runecraft;

public class ItemSkillChecker extends Item {
	
	public ItemSkillChecker() {
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		if(worldIn.isRemote) {
			return itemStackIn;
		}
		else {
			Runecraft.proxy.openGui();
			//playerIn.openGui(Runecraft.instance, GuiHandler.GUIID_SKILL, worldIn, 0,0 ,0);
		}
		return itemStackIn;
	}
}
