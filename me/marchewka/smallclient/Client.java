package me.marchewka.smallclient;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.lwjgl.opengl.Display;

import me.marchewka.smallclient.event.EventManager;
import me.marchewka.smallclient.event.EventTarget;
import me.marchewka.smallclient.event.impl.ClientTickEvent;
import me.marchewka.smallclient.gui.GuiManager;
import me.marchewka.smallclient.gui.InGameMainMenu;
import me.marchewka.smallclient.mods.LoadMod;
import net.minecraft.client.Minecraft;

public class Client {
	
	File dir = new File("ShepModLoad"); 
	File file = new File("ShepModLoad/mod.shp");
	
	public static final Client INSTANCE = new Client();
	public static final Client getInstance() {
		return INSTANCE;
	}
	
	public void init() {		
		try {
			FileUtils.forceMkdir(dir);
			FileUtils.touch(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EventManager.register(this);
	}
	
	public void start() {
		Display.setTitle("SheepModLoader (3be6e9f/master)");
		
	}
	
	public void shutdown() {
			
	}
	
	@EventTarget
	public void onTick(ClientTickEvent e) {
		
		if(Minecraft.getMinecraft().gameSettings.loadmod.isPressed()) {
			LoadMod.Load();
		}
		
		if(Minecraft.getMinecraft().gameSettings.modopts.isPressed()) {
			LoadMod.InGameMainMenu();
		}
		
	}


}
