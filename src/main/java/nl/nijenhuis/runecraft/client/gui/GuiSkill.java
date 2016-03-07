package nl.nijenhuis.runecraft.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nl.nijenhuis.runecraft.help.Reference;
import nl.nijenhuis.runecraft.level.SkillMining;
import nl.nijenhuis.runecraft.level.SkillWoodcutting;

@SideOnly(Side.CLIENT)
public class GuiSkill extends GuiScreen {

	private final int imageHeight = 129;
	private final int imageWidth = 176;

	private static final int SKILL_WIDTH = 64;
	private static final int SKILL_HEIGHT = 32;

	private static final int MINING_X = 4;
	private static final int MINING_Y = 4;

	private static final int WOOD_X = 4;
	private static final int WOOD_Y = 37;

	private static ResourceLocation guiTexture = new ResourceLocation(Reference.MODID + ":textures/gui/gui.png");

	private GuiButton buttonDone;

	private GuiMining guiMining;
	private GuiWoodcutting guiWoodcutting;

	private SkillMining mining;
	private SkillWoodcutting woodcutting;

	public GuiSkill() {

		mining = new SkillMining("mining");
		woodcutting = new SkillWoodcutting("woodcutting");
		guiMining = new GuiMining();
		guiWoodcutting = new GuiWoodcutting();
	}

	@Override
	public void initGui() {
		buttonList.clear();
		Keyboard.enableRepeatEvents(true);

		buttonDone = new GuiButton(0, width / 2 - (98 / 2), 25 + imageHeight, 98, 20, I18n.format("gui.done", new Object[0]));
		buttonList.add(buttonDone);

	}

	public void updateScreen() {
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);

		GL11.glColor4f(1, 1, 1, 1);

		buttonDone.visible = true;

		mc.getTextureManager().bindTexture(guiTexture);

		int offsetFromScreenLeft = (width - imageWidth) / 2;
		int offsetTopScreen = 20;
		drawTexturedModalRect(offsetFromScreenLeft, 20, 0, 0, imageWidth, imageHeight);

		// DRAWS STRINGS FOR MINING
		this.fontRendererObj.drawString("" + mining.getCurrentMiningLevel(), offsetFromScreenLeft + 40, offsetTopScreen + 10, 0xFEFE00);
		this.fontRendererObj.drawString("" + mining.getCurrentMiningLevel(), offsetFromScreenLeft + 51, offsetTopScreen + 24, 0xFEFE00);

		// DRWAS STRINGS FOR WOODCUTTING
		this.fontRendererObj.drawString("" + woodcutting.getCurrentWCLevel(), offsetFromScreenLeft + 40, offsetTopScreen + 40, 0xFEFE00);
		this.fontRendererObj.drawString("" + woodcutting.getCurrentWCLevel(), offsetFromScreenLeft + 51, offsetTopScreen + 54, 0xFEFE00);

		List<String> hoverText = new ArrayList<String>();

		if (isInRect(offsetFromScreenLeft + MINING_X, offsetTopScreen + MINING_Y, SKILL_WIDTH, SKILL_HEIGHT, mouseX, mouseY)) {
			hoverText.add("Mining: " + mining.miningLevelToString());
			hoverText.add("Exp: " + mining.miningExpToString());
			hoverText.add("Left: " + mining.miningExpNeededToString());
		}

		if (isInRect(offsetFromScreenLeft + WOOD_X, offsetTopScreen + WOOD_Y, SKILL_WIDTH, SKILL_HEIGHT, mouseX, mouseY)) {
			hoverText.add("Woodcutting: " + woodcutting.wcLevelToString());
			hoverText.add("Exp: " + woodcutting.wcExpToString());
			hoverText.add("Left: " + woodcutting.wcExpNeededToString());
		}

		if (!hoverText.isEmpty()) {
			drawHoveringText(hoverText, mouseX, mouseY, fontRendererObj);
		}
	}

	public static boolean isInRect(int x, int y, int xSize, int ySize, int mouseX, int mouseY) {
		return ((mouseX >= x && mouseX <= x + xSize) && (mouseY >= y && mouseY <= y + ySize));
	}

	@Override
	protected void mouseClickMove(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick) {
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
	}

	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		GuiButton button = buttonDone;
		if (isInRect(((width - imageWidth) / 2) + MINING_X, 20 + MINING_Y, SKILL_WIDTH, SKILL_HEIGHT, mouseX, mouseY)) {
			mc.displayGuiScreen(guiMining);
		}
		else if(isInRect(((width - imageWidth) / 2) + WOOD_X, 20 + WOOD_Y, SKILL_WIDTH, SKILL_HEIGHT, mouseX, mouseY)) {
			mc.displayGuiScreen(guiWoodcutting);
		}
		else if (button == buttonDone) {
			mc.displayGuiScreen((GuiScreen) null);
		} 
	}

	@Override
	public void onGuiClosed() {
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

}
