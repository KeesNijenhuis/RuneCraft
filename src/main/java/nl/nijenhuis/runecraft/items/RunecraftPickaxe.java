package nl.nijenhuis.runecraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RunecraftPickaxe extends ItemPickaxe {
	
	
	
	public RunecraftPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTabs.tabMisc);
	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}
	
	

}
