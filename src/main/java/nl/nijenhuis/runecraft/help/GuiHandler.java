package nl.nijenhuis.runecraft.help;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	private static final int GUIID = 1;
	public static int getGuiID() {
		return GUIID;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		if(ID != getGuiID()) {
			System.err.println("Invalid ID expected" + getGuiID() + ", received " + ID);
		}
		
		
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID != getGuiID()) {
			System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
		}

		
		return null;
	}
	
	

}
