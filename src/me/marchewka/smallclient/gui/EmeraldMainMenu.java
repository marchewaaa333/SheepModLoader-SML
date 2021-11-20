package me.marchewka.smallclient.gui;

import java.io.IOException;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.util.ResourceLocation;

public class EmeraldMainMenu extends GuiScreen {
	
	@Override
	public void initGui() {
		this.buttonList.add(new Buttons(0, width / 2 - 70, height / 2 - 28, 140, 20, "Singleplayer"));
		this.buttonList.add(new Buttons(1, width / 2 - 70, height / 2 - 6, 140, 20, "Multiplayer"));
		this.buttonList.add(new Buttons(2, width - 105, 3, 80, 20, "Settings"));
		this.buttonList.add(new Buttons(3, width - 23, 3, 20, 20, "X"));
		this.buttonList.add(new Buttons(4, width - 187, 3, 80, 20, "Mods"));
		super.initGui();
	}
	
	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		switch(button.id) {
		case 0:
			mc.displayGuiScreen(new GuiSelectWorld(this));
			break;
		case 1:
			mc.displayGuiScreen(new GuiMultiplayer(this));
			break;
		case 2:
			mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
			break;
		case 3:
			mc.shutdown();
			break;
				
		}
		super.actionPerformed(button);
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		this.mc.getTextureManager().bindTexture(new ResourceLocation("emeraldclient/a01a0e5a5d6bd97db9512cc60384d0a1.png"));
		Gui.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, width, height, width, height);
		super.drawScreen(mouseX, mouseY, partialTicks);
	}

}