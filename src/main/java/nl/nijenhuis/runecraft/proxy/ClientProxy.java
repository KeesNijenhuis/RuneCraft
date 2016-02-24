package nl.nijenhuis.runecraft.proxy;

import nl.nijenhuis.runecraft.init.RCBlocks;
import nl.nijenhuis.runecraft.init.RCItems;

public class ClientProxy extends CommonProxy {

	public void registerRenderers() {
		RCItems.registerItemRenderer();
		RCBlocks.registerBlockRenderer();
	}
}
