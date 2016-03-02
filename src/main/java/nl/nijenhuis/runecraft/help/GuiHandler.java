package nl.nijenhuis.runecraft.help;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import nl.nijenhuis.runecraft.client.gui.GuiAnvil;
import nl.nijenhuis.runecraft.client.gui.GuiFurnace;
import nl.nijenhuis.runecraft.client.gui.GuiSkill;
import nl.nijenhuis.runecraft.inventory.ContainerAnvil;
import nl.nijenhuis.runecraft.inventory.ContainerFurnace;
import nl.nijenhuis.runecraft.tileentity.TileEntityAnvil;
import nl.nijenhuis.runecraft.tileentity.TileEntityFurnace;

public class GuiHandler implements IGuiHandler {
	
	public static final int GUIID_SKILL = 1;
	public static final int GUIID_ANVIL = 2;
	public static final int GUIID_FURNACE = 3;
	
	
	

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		if(ID == GUIID_ANVIL) {
			return new ContainerAnvil(player.inventory, (TileEntityAnvil) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID == GUIID_FURNACE) {
			return new ContainerFurnace(player.inventory, (TileEntityFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID == GUIID_SKILL) {
			return null;
		}
	
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GUIID_ANVIL) {
			return new GuiAnvil(player.inventory, (TileEntityAnvil) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID == GUIID_FURNACE) {
			return new GuiFurnace(player.inventory, (TileEntityFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID == GUIID_SKILL) {
			return new GuiSkill();
		}

		
		return null;
	}
	
	

}
