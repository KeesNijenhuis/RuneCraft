package nl.nijenhuis.runecraft.proxy;

import net.minecraft.client.Minecraft;
import nl.nijenhuis.runecraft.client.gui.GuiSkill;
import nl.nijenhuis.runecraft.init.RCBlocks;
import nl.nijenhuis.runecraft.init.RCItems;

public class ClientProxy extends CommonProxy {

	public void registerRenderers() {
		RCItems.registerItemRenderer();
		RCBlocks.registerBlockRenderer();
		
		
	}
	
	@Override
	public void openGui() {
		Minecraft.getMinecraft().displayGuiScreen(new GuiSkill());
	}
}
