package me.marchewka.smallclient.gui;

import me.marchewka.smallclient.gui.modsgui.GuiMods;
import net.minecraft.client.Minecraft;

public class GuiManager {

	public static void ShowMainMenuInGame() {
		System.out.println("Loading main menu");
		Minecraft.getMinecraft().displayGuiScreen(new InGameMainMenu());
	}
	
	public static void ShowModsGui() {
		System.out.println("Loading main menu");
		Minecraft.getMinecraft().displayGuiScreen(new GuiMods());
	}
	
}
