package nl.nijenhuis.runecraft.client.gui;

import java.io.IOException;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import nl.nijenhuis.runecraft.help.Reference;
import nl.nijenhuis.runecraft.level.SkillMining;
import nl.nijenhuis.runecraft.level.SkillWoodcutting;

public class GuiSkill extends GuiScreen {

	private final int imageHeight = 129;
	private final int imageWidth = 176;

	private static ResourceLocation guiTexture = new ResourceLocation(Reference.MODID + ":textures/gui/gui.png");

	private GuiButton buttonDone;

	private SkillMining mining;
	private SkillWoodcutting woodcutting;

	public GuiSkill() {

		mining = new SkillMining();
		woodcutting = new SkillWoodcutting();
	}

	@Override
	public void initGui() {
		buttonList.clear();
		Keyboard.enableRepeatEvents(true);

		buttonDone = new GuiButton(0, width / 2 - (98 / 2), 25 + imageHeight, 98, 20, I18n.format("gui.done", new Object[0]));
		buttonList.add(buttonDone);

	}

	int levelMining;
	int currentExp;

	@Override
	public void updateScreen() {
		levelMining = mining.getCurrentLevel();
		currentExp = mining.getCurrentXp();
		buttonDone.visible = true;
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		GL11.glColor4f(1, 1, 1, 1);

		mc.getTextureManager().bindTexture(guiTexture);

		int offsetFromScreenLeft = (width - imageWidth) / 2;
		int offsetTopScreen = 20;
		drawTexturedModalRect(offsetFromScreenLeft, 20, 0, 0, imageWidth, imageHeight);
		
		//DRAWS STRINGS FOR MINING
		this.fontRendererObj.drawString("" + mining.getCurrentLevel(), offsetFromScreenLeft + 40, offsetTopScreen + 10, 0xFEFE00);
		this.fontRendererObj.drawString("" + mining.getCurrentLevel(), offsetFromScreenLeft + 51, offsetTopScreen + 24, 0xFEFE00);

		//DRWAS STRINGS FOR WOODCUTTING
		this.fontRendererObj.drawString("" + woodcutting.getCurrentLevel(), offsetFromScreenLeft + 40, offsetTopScreen + 40, 0xFEFE00);
		this.fontRendererObj.drawString("" + woodcutting.getCurrentLevel(), offsetFromScreenLeft + 51, offsetTopScreen + 54, 0xFEFE00);

	}

	@Override
	protected void mouseClickMove(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick) {
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if (button == buttonDone) {
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
