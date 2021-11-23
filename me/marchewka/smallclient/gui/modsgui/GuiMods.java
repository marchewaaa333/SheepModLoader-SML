package me.marchewka.smallclient.gui.modsgui;

import java.io.IOException;

import me.marchewka.smallclient.Client;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiMods extends GuiScreen {

	@Override
	public void initGui() {
				//this.buttonList.add(new Buttons(0, width / 2 - 70, height / 2 - 28, 140, 20, "Singleplayer"));
		//this.buttonList.add(new Buttons(1, width / 2 - 70, height / 2 - 6, 140, 20, "Multiplayer"));
		//this.buttonList.add(new Buttons(2, width - 105, 3, 80, 20, "Settings"));
		//this.buttonList.add(new Buttons(3, width - 23, 3, 20, 20, "X"));
		//this.buttonList.add(new Buttons(4, width - 187, 3, 80, 20, "Mods"));
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
		
	    
	     
	      
	      //this.drawCenteredString(this.mc.fontRendererObj, "amogos", (int)this.width / 2.0F, (int)this.height / 2.0F - 6.0F, -1);
	    		
		this.drawDefaultBackground();
		String[] buttons = new String[]{"SinglePlayer", "Multiplayer", "Settings", "Quit"};
	    int count = 0;
	    String[] var9 = buttons;
	    int var8 = buttons.length;
		
	    for(int var7 = 0; var7 < var8; ++var7) {
	       String name = var9[var7];
	       float x = (this.width / buttons.length * count) + (float)(this.width / buttons.length) / 2.0F + 8.0F - (float)this.mc.fontRendererObj.getStringWidth(name) / 2.0F;
	       float y = (this.height - 20);
	       //boolean hovered = (float)mouseX >= x && (float)mouseY >= y && (float)mouseX < x + (float)this.mc.fontRendererObj.getStringWidth(name) && (float)mouseY < y + (float)this.mc.fontRendererObj.FONT_HEIGHT;
	       this.drawCenteredString(this.mc.fontRendererObj, name, (this.width / buttons.length * count + this.width / buttons.length / 2), (this.height - 20), -1);
	       ++count;
	    }
	    this.drawGradientRect(0, this.height - 500, this.width, this.height, 10101010, -10101010);
		this.mc.getTextureManager().bindTexture(new ResourceLocation("emeraldclient/a01a0e5a5d6bd97db9512cc60384d0a1.png"));
		//Gui.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, width, height, width, height);
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
}
