package me.marchewka.smallclient.mods;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.lwjgl.opengl.GL11;

import me.marchewka.smallclient.gui.GuiManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;

public class LoadMod {
	
	
	static int x = 10;
	
	public static void Load() {
		FontRenderer font;
		font = Minecraft.getMinecraft().fontRendererObj;
		System.out.println("Trying to load mods!");
		File file = new File("ShepModLoad/mod.shp");
		try {
			if(FileUtils.readFileToString(file).contains("Test;")) {
				System.out.println("TEST!");
			} else {
				System.out.println("No string in file found!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void InGameMainMenu(){
		System.out.println("Trying to load mods!");
		File file = new File("ShepModLoad/mod.shp");
		try {
			if(FileUtils.readFileToString(file).contains("MainMenuInGame-Bind-I();")) {
				GuiManager.ShowMainMenuInGame();
			} else {
				System.out.println("No string in file found!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
